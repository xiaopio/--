Page({
  onLoad(options) {
    let myname = wx.getStorageSync('myname');
    console.log('wx.getStorageSync中的数据',myname)
    if(myname==''){
      wx.showToast({
        title: '还没有登录,请先登录',
        icon: 'none',
        duration: 2500
      })
      wx.reLaunch({  
        url:"/pages/login/login"
      })
    }else{
      this.show();
    }
  },
  data: {
    objectArray: []
  },
  reg(event){
    let that = this;
    let cheliangid = event.currentTarget.dataset.id;
    let id = wx.getStorageSync('id');
    //车辆id和司机发到后端
    wx.request({
      url: 'http://localhost:8082/siji/huanche', 
      method : 'GET',
      data : {
       'cheliangid':cheliangid,
       'sijiid':id
      },
      success: function(res) {
        console.log('接到了',res);
        wx.showToast({
          title: '还车完成',
          icon: 'none',
          duration: 2500
        })
        that.setData({
          objectArray:[]
        })
      }
    })
  },
  show() {
    console.log(1111111)
    let that = this
    let id = wx.getStorageSync('id');
    console.log(id)
    wx.request({
      url: 'http://localhost:8082/cheliang/selectOneCheliang', 
      method : 'GET',
      data : {
        'sijiid':id
       },success: function(res) {
        var data = res.data;
        var arr = [];
        console.log('res',res)
        console.log('data',data)
        if(data!=''){
          var id = data.id;
          var mingcheng = data.mingcheng;
          // if(mingcheng.length>2){
          //   mingcheng = mingcheng.substr(0,2)+'...'
          // }
          var pinpai = data.pinpai;
          // if(pinpai.length>2){
          //   pinpai = pinpai.substr(0,2)+'...'
          // }
          var jiage = data.jiage;
          // if(jiage.length>2){
          //   jiage = jiage.substr(0,2)+'...'
          // }
          var chepaihao = data.chepaihao;
          // if(chepaihao.length>2){
          //   chepaihao = chepaihao.substr(0,2)+'...'
          // }
          var zhuangtai = data.zhuangtai;
          // if(zhuangtai.length>2){
          //   zhuangtai = zhuangtai.substr(0,2)+'...'
          // }
          arr[0] = {
            id: id,
            mingcheng: mingcheng,
            pinpai: pinpai,
            jiage: jiage,
            chepaihao: chepaihao,
            zhuangtai: zhuangtai
          }
          console.log(arr)
          that.setData({
            objectArray:arr
          })}
      }
    })
  }
})

