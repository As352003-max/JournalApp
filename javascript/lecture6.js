// if we want to check which all events we are triggering by clicking we will use monitorEvents()
// if we dont want to check which all events we are triggering by clicking we will use unmonitorEvents()
// function which we have passed to apply addeventlistner same function we have to pass to apply removeEventlistner

// document.addEventListener('click',function(){
//     console.log('I have clicked on the document');
// });

// document.removeEventListener('click',function(){
//     console.log('I have clicked on the document');
// });

// here  removeEventListener() cannot be applied to apply it we need (same Text, same Type , same function ) same as addEventListener()

// function eventfuncion() {
//         console.log('I have clicked on the document');
    
// }
// document.addEventListener('click', eventFunction)

// const content=document.querySelector('#wrapper');

// content.addEventListener('click', function(event){
//     console.log(event);
    
// })

let links=document.querySelectorAll('a');
let thirdLink=links[2];

thirdLink.addEventListener('click',function(event){
    event.preventDefault();
    // preventDefault is used to stop the various tags from performing their work here it will stop anchor tag from doing so
    console.log('MAZA AAYA');
});


// here event listener is attached to each para 
// let myDiv=document.createElement('div');

// for(let i=1; i<=100; i++){
//   let newElement= document.createElement('p');
// //   this is used to print 100 paras
//   newElement.textContent='This is para' + i;
// //   this is used to enter element in those paras

//   newElement.addEventListener('click',function(event) {
//     console.log('I have clicked on para');
//   });
//   myDiv.appendChild(newElement);
// }
// document.body.appendChild(myDiv);
// we use body because document can have only html element all other element are child of html element



// In order to save memory attaching all para with common eventListener
// let myDiv=document.createElement('div');
// function paraStatus(event) {
//   console.log('I have clicked on para');
// }
// for(let i=1; i<=100; i++){
//   let newElement= document.createElement('p');
// //   this is used to print 100 paras
//   newElement.textContent='This is para' + i;
// //   this is used to enter element in those paras

//   newElement.addEventListener('click',paraStatus);
//   myDiv.appendChild(newElement);
// }
// document.body.appendChild(myDiv);



// multiple time mapping karne se rokne ke liye hum eventListner ko directly div ke upar laga denge par iska drawback bhi hai ki iski vajah se hum paragraphs ki individuality kho dete hai 

// let myDiv=document.createElement('div');
// function paraStatus(event) {
//   console.log('Para' + event.target.textContent);
//   // event.target ka use karke hum individual para ko access kar sakte hai
// }
// myDiv.addEventListener('click',paraStatus);
// for(let i=1; i<=100; i++){
//   let newElement= document.createElement('p');
// //   this is used to print 100 paras
//   newElement.textContent= 'This is para' + i;
// //   this is used to enter element in those paras
//  myDiv.appendChild(newElement);
// }
// document.body.appendChild(myDiv);


let element = document.querySelector('#wrapper');

element.addEventListener('click',function(event){
    if(event.target.nodeName ==='SPAN'){
        // nodename is used to do changes in individual element
console.log('span' + event.target.textContent);
    }
});

// dom content loaded is used to know that our all htl event are loaded
// we will use it by applying an event listener
{/* <script>
    document.addEventListener('DOM Contentloaded',function(){

    });
// </script> */}