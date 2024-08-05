// adding 100 para
// const t1=performance.now();
// for (let i = 0; i < 100; i++) {
// let newElement=document.createElement('p');
// newElement.textContent='This is Para' + i;

// document.body.appendChild(newElement);
// }
// const t2=performance.now();
// console.log("this took" + (t2-t1) + "ms");

// // optimizing a bit
// const t3=performance.now();

// let myDiv = document.createElement('div');

// for (let i = 0; i < 100; i++) {
//     let newElement=document.createElement('p');
//     newElement.textContent='This is Para' + i;
    
//     myDiv.appendChild(newElement);
//     }
//     document.body.appendChild(myDiv);
//     const t4=performance.now();
//     console.log("this took" + (t4-t3) + "ms");


let fragment = document.createElement('div');

for (let i = 0; i < 100; i++) {
    let newElement=document.createElement('p');
    newElement.textContent='This is Para' + i;
    
    fragment.appendChild(newElement);
    }
    document.body.appendChild(fragment); 
    // issme single reflow hogaya aur single repaint
    
    function addPara() {
        let para = document.createElement('p');
        para.textContent='JS is Single';
        document.body.appendChild(para);
    }

    function appendNewMessage(){
        let para = document.createElement('p');
        para.textContent = 'badhiya hai sab';
        document.body.appendChild(para);
    }

    addPara();
    addNewMessage();

    // observations
    // 1. run to completion return to code
    // js does not execute multiple lines function at same time
