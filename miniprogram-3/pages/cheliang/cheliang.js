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
      url: 'http://localhost:8082/siji/zuche', 
      method : 'GET',
      data : {
       'cheliangid':cheliangid,
       'sijiid':id
      },
      success: function(res) {
        console.log('接到了',res);
        wx.showToast({
          title: res.data,
          icon: 'none',
          duration: 2500
        })
      }
    })
  },
  show() {
    let that = this
    wx.request({
      url: 'http://localhost:8082/cheliang/findAll', 
      method : 'GET',
      success: function(res) {
        var data = res.data;
        var arr = [];
        console.log('res',res)
        for(var i=0;i<data.length;i++){
          var id = data[i].id;
          var mingcheng = data[i].mingcheng;
          // if(mingcheng.length>2){
          //   mingcheng = mingcheng.substr(0,2)+'...'
          // }
          var pinpai = data[i].pinpai;
          // if(pinpai.length>2){
          //   pinpai = pinpai.substr(0,2)+'...'
          // }
          var jiage = data[i].jiage;
          // if(jiage.length>2){
          //   jiage = jiage.substr(0,2)+'...'
          // }
          var chepaihao = data[i].chepaihao;
          // if(chepaihao.length>2){
          //   chepaihao = chepaihao.substr(0,2)+'...'
          // }
          var zhuangtai = data[i].zhuangtai;
          // if(zhuangtai.length>2){
          //   zhuangtai = zhuangtai.substr(0,2)+'...'
          // }
          arr[i] = {
            id: id,
            mingcheng: mingcheng,
            pinpai: pinpai,
            jiage: jiage,
            chepaihao: chepaihao,
            zhuangtai: zhuangtai
          }
        }
        console.log(arr)
        that.setData({
          objectArray:arr
        })
      }
    })
  }
})

