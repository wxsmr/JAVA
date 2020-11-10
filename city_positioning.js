const request = require('request');
const crcc = require('./city_readCityCode.js');
var url = 'http://ip.taobao.com/outGetIpInfo?ip=myip&accessKey=alibaba-inc';
request(url,(err,data) =>{
    var cityNameOBJ = JSON.parse(data.body);
    var cityName = cityNameOBJ.data.city;
    //中国天气编码json文件
    var codepath = "./city_weathercode_china.json";
    //第一次通过ip地址获取用户城市，第x次获取可以通过前端传递
    readCityCode(codepath,cityName,requestWeatherCom);
});
//(1)需要ip地址，通过ip地址获取当前城市
//http://ip.taobao.com/outGetIpInfo?ip=myip&accessKey=alibaba-inc

//(2)使用nodejs发送请求至网络接口服务，获取我们需要的数据，准备发送请求 request http.get