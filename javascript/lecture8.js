// asynchronus javascript execute karega function ko ye humme pata hota hai par kab karega ye nahi pata rehta


// setTimeout(function(){
//     console.log('third');
// },5000);
// ye asynchronous code ban gaya issi vajah se
// ye sabse last me isliye print hoga kyuki ye tabhi execute hoga jab call stack empty ho

// console.log('kya hal chal')

// function sync(){
//     console.log('first');
// }
// sync();
// console.log('second');

// features of async code
// clean and concise
// better error handling
// easier bugging

// if we want to execute any thing in background with javascript we will use - Promise
// promise

// let meraPromise1 = new Promise(function(resolve,reject){
//    setTimeout(function(){
//     console.log('i am inside promise1');
//    },5000) 
//     // resolve(1998);
// });

// let meraPromise2 = new Promise(function(resolve,reject){
//     setTimeout(function(){
//      console.log('i am inside promise2');
//     },3000) 
//      // resolve(1998);
//  });

// console.log('Pehla');

// this process is called promise chaining it is done by using then waadaa1 is executed then waadaa 2 is executed
// let waadaa1 = new Promise(function(resolve,reject){
//     setTimeout(() => {
//      console.log('set timeout1 started');
//     },2000); 
//      resolve(true);
//  });

//  let output=waadaa1.then(()=>{
//  let waadaa2 = new Promise(function(resolve,reject){
//     setTimeout(() => {
//         console.log('set timeout2 started');
//        },3000); 
//    resolve("waadaa 2 resolved");
//  })
// return waadaa2;
//  })
//  output.then((value) => console.log(value));

//  async function utility(){

//     let delhiMausam = new Promise((resolve,reject)=>{
//         setTimeout(()=>{
//             resolve("delhi me garmi hai");
//         },1000);
//     });

//     let hydMausam = new Promise((resolve,reject)=>{
//         setTimeout(()=>{
//             resolve("Hyedrabad is cool");
//         },2000);
//     });

//     let dM=delhiMausam;
//     let hM=hydMausam;

//     return[dM,hM];
//  }


// let obj ={
//     heading:"head"
// };

// async function utility() {
//     let content = await fetch('https://jsonplaceholder.typicode.com/posts/1');
//     let output = await content.json();
//     console.log(output);
// }
// utility()

// async function helper(){

// let options ={
//     method: 'POST',
//     // stringyfy converts java object in to sting
//     body: JSON.stringify({
//         title:'foo',
//         body:'bar',
//         userId: 1,
//     }),

//     headers: {
//         'Content-type':'application/json; charset=UTF-8',
//     },
// };
// let content =fetch('https://jsonplaceholder.typicode.com/posts/1',options);
// let retponse=content.json();
// return response;
// }

// async function utility(){

//     let ans =helper;
//     console.log(ans);
// }
// utility();

let name ="Sher";
function init() {
    // name is a local variable created by init
    {
        let name= "Pawan";
    }
    
    let name="Mozilla";
    function displayName() {
        let name ="babbar";
        // displayName() is the inner function , that forms the closure
        console.log(name);
    }
    displayName();
}
init();