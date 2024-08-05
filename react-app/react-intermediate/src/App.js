import {useState} from "react";
import './App.css';

function App() {

  const[formData,setFormData]=useState({firstName: "",lastName: "",email:"",comments:"", isVisible:true,mode:""});

     console.log(formData)
  function changeHandler(event) {
    setFormData(prevFormData=>{
      return{
        ...prevFormData,  
        [event.target.name]:event.target.value
      }
    });
  }







  // function changeFirstNameHandler(event) {
  //   console.log("printing first name")
  //   // here by writting event and event.target.value we can print the value of input
  //   console.log(event.target.value);
  // }

  // function changeLastNameHandler(event) {
  //   console.log("printing last name")
  //   // here by writting event and event.target.value we can print the value of input
  //   console.log(event.target.value);
  // }


  function submitHandler(event){
    event.preventDefault();
    // print
    console.log("finally printing the entire form k data........")
    console.log(formData)
  }
  return (
    <div className="App">
     <form onSubmit={submitHandler}>
      <input type="text" placeholder='firstName' onChange={changeHandler} name="firstName" value={formData.firstName}/>
      <br/>
      <br/>
      <input type="text" placeholder='lastName' onChange={changeHandler} name="lastN  ame" value={formData.lastName}/>
      <br/>
      <br/>
      <input type="text" placeholder='email' onChange={changeHandler} name="email" value={formData.email}/>
      <br/>
      <br/>
      <br/>
      <textarea placeholder='enter your comments here' onChange={changeHandler} name="comments" value={formData.comments}/>
      <br/>
      <br/>
      <input type="checkbox" onChange={changeHandler} name="isVisible" id="isVisible"/>
      <label htmlFor="isVisible">Am I Visible?</label>
      <br/>
      <br/>
      <fieldset>
        <legend>Mode</legend>
        <input type="radio" onChange={changeHandler} name="mode" value="Online-Mode" id="Online-Mode" checked={formData.mode==="Online-Mode"}/>
      <label htmlFor="Online-Mode">Online Mode</label> 
      <br/>
      <br/>
      <input type="radio" onChange={changeHandler} name="mode" value="Offline-Mode" id="Offline-Mode" checked={formData.mode==="Offline-Mode"}/>
      <label htmlFor="Offline-Mode">Offline Mode</label> 
      </fieldset>
      <label htmlFor="favCar">Tell me your Favourite Car </label>
      <select onChange={changeHandler}
        name="favCar" id="favCar" value={formData.favCar}>
        <option value="scorpio">Scorpio</option>
        <option value="Fortunr">Fortunr</option>
        <option value="thaar">thaar</option>
        <option value="landrover">landrover</option>
        <option value="defender">defender</option>
        <option value="Scorpio">Scorpio</option>
      </select>
      <button>Submit</button>
     </form>
    </div>
  );
}

export default App;
