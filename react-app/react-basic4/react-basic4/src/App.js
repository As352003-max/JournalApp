import {useState,useEffect} from 'react';
import './App.css';

function App() {

const[text,setText]=useState('');
const[name,]=useState('love');


// // variation 1 -> Every Render ye  use effect har baar chalega jab bhi hum kuch likhenge
// useEffect( ()=> {
//   console.log("UI RENDERING DONE")
// })

// variation 2 -> First Render ye sirf ek baar chalega first text likhne pe vo bhi
// useEffect( ()=> {
//   console.log("UI RENDERING DONE")
// },[])

// variation 3 -> Whenever dependency changes jab bhi text ki value change hogi code run hoga
// useEffect( ()=> {
//   console.log("Change Observed")
// },[text])

// variation 3 -> first Render+Whenever dependency changes jab bhi name ki value change hogi code run hoga nahi toh pehli baar chalega bas 
useEffect( ()=> {
  console.log("Change Observed")
},[name])
// iss name vale array ko hum bolte hai dependency list 


function changeHandler(event) {

  setText(event.target.value);
  console.log(text);
  
}

  return (
    <div className="App">
      <input type="text" onChange={changeHandler}></input>
    </div>
  );
}

export default App;
