const items = [{
    name : 'earrings',
    id : 1,
    price : 5000,
},
{
    name : 'kajal',
    id : 2,
    price : 1000,
},
{
    name : 'trimmer',
    id : 3,
    price : 3000,
},
{
    name : 'beardo',
    id : 4,
    price : 170,
}];

const updatedItem = items.map(function(price,index){
    
    items.price =  items.price + 300
    return price;
});
const itemsArrow = items.map((value ) => {
    value.price = value.price + 300
    return value
})
console.log('updatedItem = ',updatedItem)
console.log('itemsArrow = ',itemsArrow)

const filteredItem = items.filter((item) => item.price > 1000)
console.log('filterdeItem = ',filteredItem)


