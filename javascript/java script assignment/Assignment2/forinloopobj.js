var person = {
    name : 'pooja',
    age : 22,
    education : 'B.E',
}
for( var details in person)
console.log('details = ',person[details])
console.log('=======================================')

var cricket = {
    name : 'M.S.Dhoni',
    age : 38,
    team : 'INDIA',
}
for(var details in cricket)
console.log('details = ',cricket[details])
console.log('=======================================')

var dress = {
    name : 'salwar',
    type : 'Indian',
    price : 2500,
    size : 25,
}
for(var fit in dress)
console.log('dress = ',dress[fit])
console.log('=======================================')

var mobile = {
    name : 'OPPO F11 PRO',
    price : 20000,
    RAM : '6GB',
    color : 'black',
}
for(var features in mobile)
console.log('mobile =',mobile[features])
console.log('=======================================')

var laptop = {
    name : 'HP',
    price : 40990,
    RAM : '8GB',
    color : 'black',
}
for(var features in laptop)
console.log('laptop = ',laptop[features])
console.log('=======================================')

var rice = {
    item : 'basumathi',
    quantity : '1kg',
    time : '30mins',
}
for(var items in rice)
console.log("rice = ",rice[items])
console.log('=======================================')

var Icecream = {
    name : 'Amul',
    price : 100,
    flavor : 'chocolate',
}
for(var flavor in Icecream)
console.log("ice cream = ",Icecream[flavor])
console.log('=======================================')

var film = {
    name : 'bahubali',
    director : 'rajmouli',
    hero : 'prabhas',
    budget : '1.8million',
    boxoffice : '6.5billion',
}
for( var det in film)
console.log("film = ",film[det])
console.log('=======================================')

var google = {
     founder : 'larry page & sergey brin',
     year : 1998,
     headquarter : 'california',
}
for ( var about in google)
console.log("about = ",google[about])
console.log('=======================================')

var amazon = {
    product : 'nailpolish',
    color : ' peach',
    cost : 100,
    companu : 'LakMe',
}
for(var pro in amazon)
console.log('product = ',amazon[pro])