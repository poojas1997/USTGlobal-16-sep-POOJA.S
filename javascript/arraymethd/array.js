const hobbies = ['cricket','cooking','coding','sleeping'];
console.log(typeof hobbies);

const isArrayornot = Array.isArray(hobbies)
console.log('is it array or not = ',isArrayornot);

const hascooking = hobbies.includes('cooking')
console.log('has playing games = ',hascooking)

const hascoding = hobbies.includes('coding',100)
console.log('has playing games = ',hascoding)

hobbies.push('chess','music')
console.log('after push method = ',hobbies)

hobbies.pop('music')
console.log('after pop method =',hobbies)

hobbies.unshift('Numismatics','singing')
console.log('after unshift method',hobbies)

hobbies.shift()
console.log('after shift method',hobbies)

const hobbies1 = ['sleeping','cricket','Eating','coding','roaming']
hobbies1.splice(1,2,'bird watching','pubg')
console.log('after splice method',hobbies1)

const afterslice = hobbies1.slice(2,4)
console.log('after slice method',afterslice)

const index = hobbies1.indexOf('coding')
console.log('the index of element is ',index)

 string = hobbies1.join('-')
 console.log('after join method',string)

 const marks = [100,200,300,400]
 const num = marks.map(function(value,index){
     let newvalue = value + 50;
     return newvalue;
 })
 console.log('after map method = ',num)
//  using fatarrow function
 const num1 = marks.map(value => value + 500);
 console.log('after fat arrow function = ',num1)

 const num2 = marks.filter(function(value,index){
     if ( value > 200){
         return true;
     }else{
         return false;
     }
 })
 console.log('after filter method' ,num2)
//  using fat arrow function
const num3 = marks.filter(value => value > 200)
console.log(`after fat arrow function = `,num3) 

