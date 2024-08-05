console.log('hello jee');

// math operator use mdn docs to study

let lastname='Babbar';

let firstName=new String('love'); 


// template literal me hum backtick(` `) ka use karte hai isse humne sentence jaise likha hai vaise hi print ho jaata hai

let message = 
`Hello ${lastname},

Thanks for oppurtunity

Regards
Babbar`;

console.log(message);

let date=new Date();

let date3=new Date(2023,6,20,7 )
console.log(date3)

// ARRAYS

// adding new Elements 
// finding elements 
// removing elements
// splitting elements 
// combining elements

// to create an array we have to write

let numbers=[1,3,5,7];

// insertion

// In the end

// at end -> push
numbers.push(9);

// at beginning -> unshift
numbers.unshift(8);

// at middle ->splice
numbers.splice(2,0,10);
console.log(numbers);


// searching me agar humne dekha ki primitive ki searching ho rahi hai toh hum (index of and includes) use karenge
// aur agar object\referece ke saath searching ho rahi hai toh (find) ka use karte hai jisme hum call back ka use kate hai ya arrow function ka use karte hai

console.log(numbers.indexOf(2))
// if no is not present in the array then the index will be -1

// we want to check if number exist in the array or not

// 1st method

if(numbers.indexOf(4)!=-1)
console .log("present")
else 
console.log("absent")

// 2nd method

console.log(numbers.includes(7))
console.log(numbers.indexOf(4,2))



let courses = [
    {no:1, naam :'Love'},
    {no:2, naam:'Rahul'}
];

console.log(courses);

// console.log( courses.includes ( {no:1, naam:'Love'}));


// function call method

// let course= courses.find(function(course){
//    return course.naam === 'Love';
// });


// arrow method
let course = courses.find(course=> course.naam == 'Love');

console.log(course);

let num=[1,2,3,4]
num.pop(4);
// pop is used to delete elements from last

num.shift(1);
// shift is used to delete elements from starting

num.splice(1,1);
// splice is used to delete element from between

num.push(8,9,10);

num.unshift(12,3);

num.splice(3,0,5);

console.log(num )



// CONCATENATE AND SLICING

let first=[1,2,3];
let second=[4,5,6];

let combined =first.concat(second);
console.log(combined);

let sliced = combined.slice(2,3);
// in slicing what we do we include first parameter and exclude the second one that is why we get only 3 on slicing the combined object from (2,3)
console.log(sliced);

let slice = combined.slice(2);
// here all the elements after index 2 including it get sliced
console.log(slice);

// slicing/concatenation on object and refences (h.w)


// SPREAD OPERATOR

let first1 = [1,2,3]
let second2 = [4,5,6]

let combinedboth = [...first,...second]

console.log(combinedboth);

// copy bhi easily create ho jaati hai 

let another = [...combined];


// ITERATION IN ARRAY

let arr =[10,20,30,40,50];

// for(let value of arr) {
//     console.log(value);
// }

// use of call back function
// arr.forEach(function(number){
// console.log(number);
// })

// use of arrow function
arr.forEach(number=>console.log(number));
    

// JOINING ARRAY - is used fo joining an array

let number= [10,20,30,40,50];
const joined =number.join(',');
console.log(joined);

// SPLIT ARRAY- is used to ceate an array

let name= 'this is my book';
let parts =name.split(' ');
console.log(parts);


// SORTING AN ARRAY (sort function jo hai jo element hai usko string me convert karta hai fhir usko sort karta hai )

let numbers1 = [40,30,10,20,50];
// from smaller to grater

numbers1.sort();
console.log(numbers1);

// from grater to smaller

numbers1.reverse();
console.log(numbers1);


// FILTERING ARRAY
// IT FILTERS THE ARRAY

// let num1 = [1,2,-1,4];

// let filtered = num1.filter(function(value){
//     return value>=0;
// });

// console.log(filtered);


// FILTERING ARRAY using arrow function
let num1 = [1,2,-1,4];

let filtered = num1.filter(value => value>=0);

console.log(filtered);


// Mapping Arrays:


// maps each elemets  of array to something else

// let num2=[7,8,9,10];

// console.log(numbers);

// let items = numbers.map(value=>'student_no'+value);

// console.log(items);

// mapping with objects

let num3=[1,2,-6,-9];
let filtered1 = num3.filter(value => value>=0);

// let items1=filtered1.map(function(num){
//     return {value:num};
   
// // })

// arrow function

let items1=filtered1.map(num=>{value:num})

console.log(items1);

// chaining method 

let  num4=[1,2,-6,-9];


let items2=num3.filter(value => value>=0).map(num=>{value:num});
console.log(items2);