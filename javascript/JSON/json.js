const person = {
                name : 'sundara',
                age : 100,
                color : 'white',
                address : {
                            city : 'Bijapur',
                            state : 'karnataka',
                            pincode : 591115
                            },
                hobbies : ['Coding','Bird Watching','Singing']
                }
        console.log('JavaScript person Object',person)
        const jsonObject =  JSON.stringify(person)
        console.log('JSON person Object ',jsonObject)

        console.log('===================================================================================')
        const JavaScriptPersonObject = JSON.parse(jsonObject)
        console.log('JavaScript person Object after parse',JavaScriptPersonObject)
        console.log('===================================================================================')

       localStorage.setItem('email','billgates@gmail.com')
       const emailID =  localStorage.getItem('email')
       console.log('Email ID', emailID)
       localStorage.clear();