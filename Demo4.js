var fs=require("fs");

var myReadStream=fs.createReadStream(__dirname+ '/takeHome.txt','utf-8');
var start=[];
var counter=0;

myReadStream.on('data',function(chunk){
console.log("chunk received");
counter++;
var myWriteStream=fs.createWriteStream(__dirname+ '/start['+counter+'].txt');
myWriteStream.write(chunk);

})
 
/* myReadStream.pipe(myWriteStream); */