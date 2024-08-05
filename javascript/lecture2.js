console.log('chaliye shuru karte hai')

// let rectangle={

//     length:1,
//     breadth:2,


//     // to add abehaviour (we say it a function also or method in javasript)

//     draw:function(){
//         console.log('drawing rectangle')
//     }


// };


// factory function

// function createRectangle(len,bre){
//     return rectangle={

//         length:len,
//         breadth:bre,
    
//         draw:function(){
//             console.log('drawing rectangle');
//         }
//     };
    
// }

// let rectangleObj1=createRectangle(5,4);
// let rectangle2=createRectangle(3,2);

// Camelcase notation-> first letter of every word except the first should be capital -> numberOfStudents
// constructor function->pascal notation ->first letter of every word is capital-> NumberOfStudents

function Rectangle(len,bre){

    this.length=len;
    this.breadth=bre;
    this.draw=function() {
        console.log('drawing');
    }
}



// object creation using constructor function
// let rectangleObject=new Rectangle(5,4);

// // we can dynamically add properties to the object
// rectangleObject.color='yellow';
// console.log(rectangleObject)




// we can dynamically delete properties from the object

// delete rectangleObject.color;
// console.log(rectangleObject)



// let Rectangle1=new Function('length','breadth',`this.length=length;
// this.breadth=breadth;
// this.draw=function() {
//     console.log('drawing');
// }`)

// let rect = new Rectangle(2,3);

// consol.log(rect) 


// primitive type ke js me copy banti hai 

// let a=10;
// let b=a;

// a++;
// console.log(a);
// console.log(b);



// refrence type ke js me same address ko point karta hai

// let a={value:10};
// let b=a;

// a.value++;

// console.log(a.value);
// console.log(b.value);



// let a=10;

// function inc(a){
//   a++;
// }

// inc (a);

// console.log(a);



let rectangle ={
length:2,
breadth:4
};

// for in loop 

// for(let key in rectangle){
//     // keys are reflected through key vriable
//     // values are reflected through rectang[key]
//     console.log(key,rectangle[key]);
// }

// // for of loop are used for iterables we write simply let key of rectangle it will show errors whereas if we write object.entries(retangle) it will easily print
// for(let key of Object.entries(rectangle) ){
//     console.log(key);
// }

if('color' in rectangle){
    console.log('Present');
}

else{
    console.log('absent');
}


// objet cloning can be done in three ways


// OBJECT CLONING 1

// iteration
// let src={
//     a:10,
//     b:20,
//     c:30
// };

// let dest={};

// for(let key in src){
//     dest[key]=src[key];
// }

// src.a++;
// console.log(dest);


// OBJECT CLONING 2

// assign
// multiple objects ko hum copy kar sakte hai using assign function

// let src={
//     a:10,
//     b:20,
//     c:30
// };

// let dest = Object.assign({},src);
// console.log(dest);
// src.a++;
// console.log(dest);
// OBJECT CLONING1

// spread

let src={
    a:10,
    b:20,
    c:30
};

let dest={...src};

console.log(dest);

src.a++;

console.log(dest);



// garbage collector aise variables aur aise constant ko find karta hai jo abhi use me nahi hai aur unki memory ko deallocate kara deta hai
// we dont have control on garbage collector