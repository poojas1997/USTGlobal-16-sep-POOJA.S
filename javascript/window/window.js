console.log('window object',window)
console.log('This keyword',this)
console.log(this === window)

// window.alert('welcome to Javascript class')
// alert('welcome to UST Global and Test Yantra')

// let confirmsave = confirm('Are you sure to save it');
// console.log('confirmsave = ', confirmsave)

// let username = prompt('what is your name','Deeksha')
// console.log('username = ',username)

const person = {
    Firstname : 'Alia',
    age : 26,
    Lastname : 'Bhatt',
    getName : function(){
        console.log('This name = ',this)
        return this.Firstname + ' ' +this.Lastname
    }
}
let fullName = person.getName()
console.log('Full Name =',fullName)

