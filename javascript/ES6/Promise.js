const message = new Promise(function(resolve,reject){
    if(30 < 10){
        resolve('Success')
    }
    else{
        reject('Failure')
    }
})
message.then(function(msg){
    console.log('success msg',msg)
}).catch(function(error){
    console.log('Failure msg',error)
})
console.log("=======================================================")
