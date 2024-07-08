// app.js
App({
  // 小程序启动执行的方法
  onLaunch:function(){
    console.log('小程序启动成功')
    wx.cloud.init({
      env: 'cdesc-8ggrvak62de632c4'
      })
  }
})
