var brands = ['kingfisher','bisleri','aqua','kinley']
console.log('For of Loop')
for(var element of brands){
    console.log('Brand = ',element);
}
console.log('============================================================')
console.log('For in Loop')
for(var index in brands){
    console.log('Brand = ',brands[index]);
}
console.log('============================================================')
console.log('For in loop for object')
var person = {
    name :'sundari',
    age : 33,
    color : 'white',
}
for(var key in person){
    console.log('value = ',person[key]);
}
console.log('============================================================')
console.log('ForEach method for object')
var movies = ['sholay','mayabazaar','jurassicpark','titanic'];
movies.forEach(function(value,index){
    console.log('movie = ',value);
});
console.log('============================================================')
var items = [{
    item : 'bangles',
    id : 1,
    price : 100
},
{
    item : 'eyeliner',
    id : 2,
    price : 150
},
{
    item : 'shoes',
    id : 3,
    price : 5000
},
{
    item : 'watch',
    id : 4,
    price : 7000
}]
items.forEach(function(value,index){
    console.log('Items = ',value);
    console.log('Index of item = ',index);
   
});
console.log('============================================================')
var num = [10,20,30,,40,,50]
for(var i = 0; i <num.length; i++){
console.log('for loop' ,num[i])
}
console.log('============================================================')
var num = [10,20,30,,40,,50]
num.forEach(function(value,index){
console.log('num=',value);
});
console.log('============================================================')

num ['hundred'] = 100;
for(var i = 0; i < num.length; i++)
{
    console.log('for loop',num[i])
}
console.log('============================================================')

num ['hundred'] = 100;
for(var key in num)
console.log("num =",num[key])
console.log('============================================================')

var name;
var name = 'pailwaan';
name = 'prasthanam'

// console.log(name1)
let name1;
// let name1 = 'saaho';
name1 = 'rajahuli';

// const name2;
const name2 = 'dream girl';
// name2 = 'kurukshetra';

console.log('name = ',name)
console.log('name1 = ',name1)
console.log('name2 = ',name2)
console.log('============================================================')

for(var i = 0; i<5; i++){
    console.log('inside the loop = ',i)
}
console.log('outside the loop = ',i)
console.log('============================================================')

for(let i = 0; i<5; i++){
    console.log('inside the loop = ',i)
}
console.log('outside the loop = ',i)
console.log('============================================================')

for(const i = 0; i<5; i++){
    console.log('inside the loop = ',i)
}
console.log('outside the loop = ',i)
console.log('============================================================')

