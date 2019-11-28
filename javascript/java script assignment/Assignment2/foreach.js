var person = [{
    name : 'pooja',
    age : 22,
    education : 'B.E'
},
{
     name : 'haseeb',
    age : 42,
    education : 'P.U.C.'
},
{
name : 'Nagoji rao',
age : 88,
education : 'D.Ed'
}];

person.forEach(function(value,index){
    console.log('value= ',value)
   
});
console.log('=======================================')

var cricket = [{
    name : 'M.S.Dhoni',
    age : 38,
    team : 'INDIA',
},
{
    name : 'malinga',
    age : 36,
    team : 'SRILANKA',
},
{
    name : 'kane williamson ',
    age : 29,
    team : 'NEWZEALAND',
}]


cricket.forEach(function(details,place){
    console.log('details = ',details)
   
});
console.log('=======================================')

var dress = [{
    name : 'salwar',
    type : 'Indian',
    price : 2500,
    size : 25,
},
{
    name : 'saree',
    type : 'Indian',
    price : 3000,
    size : null
},
{
    name : 'jeans',
    type : 'western',
    price : 2999,
    size : 38,
}]
dress.forEach(function(type,dress)
{
    console.log('dress = ',type)
 
} );
console.log('=======================================')

var mobile = [{
    name : 'OPPO F11 PRO',
    price : 20000,
    RAM : '6GB',
    color : 'black',
},
{
    name : 'OPPO F3',
    price : 11000,
    RAM : '6GB',
    color : 'gold',
},
{
    name : 'samsung',
    price : 20000,
    RAM : '8GB',
    color : 'blue',
}]
mobile.forEach(function(mobiles,index){
    console.log('mobile =',mobiles)

});
console.log('=======================================')

var laptop =[ {
    name : 'HP',
    price : 40990,
    RAM : '8GB',
    color : 'black',
},
{
    name : 'DELL',
    price : 48025,
    RAM : '8GB',
    color : 'Gold',
},
{
    name : 'LENOVO',
    price : 30000,
    RAM : '8GB',
    color : 'White',
}]

laptop.forEach(function(brand,index){
    console.log('laptop = ',brand)
 
});

console.log('=======================================')

var rice = [{
    item : 'basumathi',
    quantity : '1kg',
    price : '120',
},
{
    item : 'steam',
    quantity : '2kg',
    price : '80',
},
{
    item : 'normal',
    quantity : '1kg',
    price : '60',
}]
rice.forEach(function(type,index){
    console.log("rice = ",type)

});
console.log('=======================================')

var Icecream = [{
    name : 'Amul',
    price : 100,
    flavor : 'chocolate',
},
{
    name : 'joy',
    price : 50,
    flavor : 'vanila',
},
{
    name : 'cornetto',
    price : 300,
    flavor : 'butterscotch',
}]
Icecream.forEach(function(flavor,price){
    console.log("ice cream = ",flavor)

});
console.log('=======================================')

var film = [{
    name : 'bahubali',
    director : 'rajmouli',
    hero : 'prabhas',
    
},
{
    name : 'KGF',
    director : 'prashnth neel',
    hero : 'yash',
    
},
{
    name : 'darma',
    director : 'yograjbhat',
    hero : 'yash',
    
},
{
    name : 'kotigobba2',
    director : 'racikumar',
    hero : 'sudeep',
    
}]
film.forEach( function(film,hero){
    console.log("film = ",film)

});
console.log('=======================================')

var app = [{
     name : 'google',
     founder : 'larry page & sergey brin',
     year : 1998,
     headquarter : 'california',
},
{
    name : 'facebook',
     founder : 'mark zukerbarg',
     year : 2004,
     headquarter : 'california',
},
{
    name : 'instagram',
     founder : 'kevin systrom',
     year : 2010,
     headquarter : 'california',
}]
app.forEach ( function(apps,name){
    console.log("about = ",apps)

})
console.log('=======================================')

var amazon = [{
    product : 'nailpolish',
    color : ' peach',
    cost : 100,
    companu : 'LakMe',
},
{
    product : 'watch',
    color : ' black',
    cost : 5000,
    companu : 'fastrack',
},
{
    product : 'lipstick',
    color : ' pink',
    cost : 500,
    companu : 'LakMe',
}]
amazon.forEach(function(name,key){
    console.log('product = ',name)
});
