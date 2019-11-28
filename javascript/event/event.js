function showMessage(){
    alert('Hi Hello Welcome!!!!!!!')
}

function changeColor(){
   let Element =  document.getElementById('mover')
   Element.style.color = 'green'
}
function removeColor(){
    let Element = document.getElementById('mover')
    Element.style.color = 'black'
}
function printHello(){
    // console.log('Hello')
   let UserName = document.getElementById('username')
   
}

let name = 'Rakesh'
let age = 21
let Phoneno = 95359008635
console.log('Name is '+name + 'Age is '+age+ 'Phoneno is');
console.log(`Name is ${name}  Age is ${age} Phoneno is ${Phoneno}`);
console.log(`2 + 2= ${2+2}`)

document.getElementById('b1').disabled = true