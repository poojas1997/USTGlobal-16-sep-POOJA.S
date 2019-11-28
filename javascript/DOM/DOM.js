let h1Element = document.getElementById('demo')
console.log('Element = ',h1Element)
console.log('Element Text =',h1Element.textContent)
h1Element.textContent = 'Good Evening'  //change text 
console.log('=====================================================')

let buttonElement = document.createElement('button')
console.log('Button Element ',buttonElement)
buttonElement.textContent = 'click Me!!!!'

document.body.appendChild(buttonElement)      // to add to body of webpage

let ulElement = document.createElement('ul')
let li1Element = document.createElement('li')
let li2Element = document.createElement('li')
let li3Element = document.createElement('li')     // to create a list

li1Element.textContent = 'JAVA'
li2Element.textContent = 'SQL'
li3Element.textContent = 'JAVASCRIPT'

ulElement.appendChild(li1Element)
ulElement.appendChild(li2Element)
ulElement.appendChild(li3Element)

document.body.appendChild(ulElement)

h1Element.style.color = 'blue'
h1Element.style.fontSize = '20px'