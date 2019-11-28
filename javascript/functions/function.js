//Named Functions
function add(num1,num2)
{
    console.log('Sum=',num1+num2)
}
add(10,20)
function add(num1,num2,num3)
{
    console.log('Sum= ',num1+num2+num3)
}
add(10,20,30)
console.log('------------------------')

//Anonymous Functions
var sub = function (num1,num2,num3)
{
    var subvalue = num1-num2;
    return subvalue;
}
var value = sub(56,36);
console.log('value=',value)
console.log('------------------------')

console.log("hello");
(function(num1,num2)
{
    console.log('value=',num1+num2)
})(23,32);

//FatArrow Function
var div = (num1,num2) => {
    console.log('value=',num1/num2)
    console.log('product=',num1*num2)
}
div(20,10);
console.log('------------------------')

var div1 = num1 => {
    console.log('value=',num1)
}
div1(90);
console.log('------------------------')

var div2 = num1 => console.log(num1);
div2(423);
console.log('------------------------')

var div3 = (num1,num2) => num1 + num2;
div3(50,50);

greeting('sir');
function greeting(msg)
{
    console.log('hello',msg);
}
console.log('------------------------')

greet('pooja')
var greet = function(msg){
    console.log('Hi',msg);
}
console.log('------------------------')

greets('haseeb');
var greets = (msg) => {
    console.log('Hello',msg);
}