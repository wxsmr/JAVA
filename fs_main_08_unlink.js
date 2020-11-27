const fs = require("fs");

function unlinkFile(src){
	fs.unlink(src, (err) =>{
		if(err){
			console.error(err);
		};
		console.log('successfully deleted');
	
	});
}
var src = "C:/Users/Administrator/Desktop/江西软大区块链学院/node.js/nodejs_06/code/3.txt";
unlinkFile(src);
console.log("函数执行完毕");