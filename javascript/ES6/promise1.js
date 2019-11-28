const Employee = new Promise(function(resolve,reject){
    if(30 > 10){
        resolve([{
            name : 'pooja',
            age : 22
        },{
            name : 'billgates',
            age : 67
        },{
            name : 'jasmine',
            age : 25
        }])
    }
    else{
        reject('Failure')
    }
})
Employee.then(function(msg){
    console.log('success msg',msg)
}).catch(function(error){
    console.log('Failure msg',error)
})
console.log('----------------------------------------------------')

function outerFunction(counter){
    function innerFunction(){
        let count;
        count = counter + 10;
        return count;
    }
    return innerFunction;
}
let innerFunc = outerFunction(20)
let counter = innerFunc()
console.log('Counter value =',counter)
console.log('----------------------------------------------------')
