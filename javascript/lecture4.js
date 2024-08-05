// FUNCTION

// function declaration

function run() {
    console.log('running');
}
run();

//Named function assignement

let stand= function walk() {
    console.log('walking');
}
stand();

// Anonymous function assignement

let walk= function() {
    console.log('walking');
}
walk();

function sum(a,b){
    console.log(arguments)
    return a+b;
}

console.log(sum(1,2));

// console.log(sum(1)) agar hum ek no dete hai 

// ek special object hai humare js me jisko hum argument kehte hai

function sum(a,b){
let total=0;
for (let value of arguments) {
    total=total+value;
    return total;
}
}
console.log(sum(1,2));


// REST OPERATOR (REST PARAMETER)

function sum1(num,value,...args){
    console.log(args);
}

sum1(1,2,3,4,5,6);

// DEFAULT PARAMETER

function interest(p,r,y){
    return p*r*y/100;
}

console.log(interest(1000,10,5)); 


let person={
    fName:'amitanshu',
    lName:'singh',
    get fullName(){
        return `${person.fName} ${person.lName}`;
    },
    set fullName(value){

        if(typeof value!==String){
            throw new Error("You have not sent a string");
        }
        let parts=value.split(' ');
        this.fName=parts[0];
        this.lName=parts[1];
    }
};

// getter -> access properties
// setter -> change or mutate properties

// console.log(person);

// issue -> read only

console.log(person.fullName);


// try and error used for error resolving

try{
    person.fullName=true;

}

catch(e){
    alert('you have sent a number in fullName');
}

console.log(person.fullName);

