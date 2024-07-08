let myname = null;
let password = null;
let s1 = null;
let s2 = null;
let s3 = null;
Page({
  checkDenglu: function(){
    let that = this;
    let myname = wx.getStorageSync('myname');
    if(myname==''){
      that.setData({
        "fla":true
      })
    }else{
      that.setData({
        "fla":false,
        "loginname":myname,
      })
    }
  },
  onLoad: function(){
    this.checkDenglu();
  },
  data: {
    "fla":true,
    "loginname":"",
    result:'请求后台中。。。。。'
  },
  inputName: function (event) {
    myname = event.detail.value
  },
  inputMingcheng: function (event) {
    s1 = event.detail.value
  },
  inputJialing: function (event) {
    s2 = event.detail.value
  },
  inputJiazhaodengji: function (event) {
    s3 = event.detail.value
  },
  inputPassword(event) {
    password = event.detail.value//将用户输入的密码放到变量里面
  },
  show(text){
    wx.showToast({
      title: text,
      icon: 'none',
      duration: 2500
    })
  },
  //注册函数
  reg() {
    let that = this;
    if(myname==null || password==null || myname=='' || password==''
    || s1==null || s1=='' 
    || s2==null || s2=='' 
    || s3==null || s3=='' ){
      wx.showToast({
        title: '注册失败,请输入完整的信息',
        icon: 'none',
        duration: 2500
      })  
    }else{
      wx.request({
        url: 'http://localhost:8082/siji/addSiji', 
        method : 'GET',
        data : {
         'mingcheng':s1,
         'jialing':s2,
         'jiazhaodengji':s3,  
         'zhanghao':myname,
         'mima':password
        },
        success: function(res) {
          console.log('接到了',res);
          console.log(res.data)
          if(res.data=='注册成功'){
            that.setData({
              "fla":false,
              "loginname":myname
            })
          }else{
            that.show(res.data)
          }
        }
      })
    }
  },
  //登录函数
  dl() {
    let that = this;
    if(myname==null || password==null || myname=='' || password=='' ){
      this.show('登录失败,请输入完整的信息')
      return;
    }else{
      wx.request({
        url: 'http://localhost:8082/siji/login', 
        method : 'GET',
        data : {
         'zhanghao':myname,
         'mima':password
        },
        success: function(res) {
          console.log('接到了',res);
          console.log(res.data)
          console.log(res.data.indexOf('登录成功'))
          if(res.data.indexOf('登录成功')==0){
            wx.setStorageSync('myname',res.data.split("=")[1])
            wx.setStorageSync('id',res.data.split("=")[2])
            that.setData({
              "fla":false,
              "loginname":res.data.split("=")[1]
            })
          }else{
            that.show(res.data)
          }
        }
      })
    }
  },
  tuichu() {
    wx.removeStorageSync('myname')
    this.setData({
      "fla":true
    })
  }
})

