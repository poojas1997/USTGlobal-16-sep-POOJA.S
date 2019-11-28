let myname : string = "pooja";
console.log(myname, typeof myname)

let age = 22;
console.log(age, typeof age)

let mobilenumber : number;
console.log(mobilenumber, typeof mobilenumber)

let address;
address = "mandya";
address = 571401;
console.log(address, typeof address)

let calAge = function() : void{
    console.log("age is 26")
}
calAge();

class Person {
    constructor(public name : string , public age : number){

    }
}

let person1 = new Person("pooja" , 22);
console.log(person1)

class Student extends Person{
    constructor(name : string , age : number , public rollno : number){
        super(name , age);
    }

}

let student1 = new Student("johny" , 25 , 13)
console.log(student1)