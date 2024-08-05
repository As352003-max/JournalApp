import './App.css';
import { useState } from 'react';

function App() {

  const[formData,setFormData] = useState({
    firstName:"",lastName:"",email:"",country:"India",
    streetAddress:"",city:"",state:"",postalCode:"",
    comments:false, candidates:false, offers:false,pushNotifications:""
  })
  
  
  
  function changeHandler(event) {
    const {name,value,checked,type}=event.target;
    setFormData((prev) => ({...prev, [name]:type === "checkbox" ? checked: value}))
  }

  function submitHandler(event) {
    event.preventDefault();
    console.log("Finslly printing the value of form data ");
    console.log(formData)
  }

  return (
    <div className="flex flex-col  items-center mt-2">
      <form  onSubmit={submitHandler}>
      <label htmlFor="firstName">First name</label>
      <br/>
      <input
      type="text"
      name="firstName"
      id="firstName"
      placeholder='Love'
      value={formData.firstName}
      onChange={changeHandler}
      className='outline'/>

<br/>
<label htmlFor="lastName">Last name</label>
      <br/>
      <input
      type="text"
      name="lastName"
      id="lastName"
      placeholder='Singh'
      value={formData.lastName}
      onChange={changeHandler}
      className='outline'/>
   
   <br/>
<label htmlFor="email">E-mail</label>
      <br/>
      <input
      type="text"
      name="email"
      id="email"
      placeholder='abc@gmil.com'
      value={formData.email}
      onChange={changeHandler}
      className='outline'/>

<br/>
<label htmlFor="country">Country</label>
      <br/>
      <select 
      name="country"
      id="country"
      value={formData.country}
      onChange={changeHandler}
      className='outline'
          >
<option>India</option>
          <option>United State of America</option>
          <option>Canada</option>
          <option>Mexico</option>
      </select>

<br/>
<label htmlFor="streetAddress">Street Address</label>
      <br/>
      <input
      type="text"
      name="streetAddress"
      id="streetAddress"
      placeholder='B-25C'
      value={formData.streetAddress}
      onChange={changeHandler}
      className='outline'/>

<br/>
<label htmlFor="city">City</label>
      <br/>
      <input
      type="text"
      name="city"
      id="city"
      placeholder='B-25C'
      value={formData.city}
      onChange={changeHandler}
      className='outline'/>

<br/>
<label htmlFor="state">State / Province</label>
      <br/>
      <input
      type="text"
      name="state"
      id="state"
      placeholder='Bihar'
      value={formData.state}
      onChange={changeHandler}
      className='outline'/>

<br/>
<label htmlFor="postalCode">Postal Code</label>
      <br/>
      <input
      type="text"
      name="postalCode"
      id="postalCode"
      placeholder='110077'
      value={formData.postalCode}
      onChange={changeHandler}
      className='outline'/>

<br/>
<br/>
<fieldset>
  <legend>By Email</legend>

  <div className='flex'>
  <input
  id='comments'
  name='comments'
  type='checkbox'
 checked={formData.comments}
  onChange={changeHandler}
  />

  <div>
    <label htmlFor="comments">Comments</label>
    <p>Get notified when someones posts a comment on a posting</p>
  </div>
  </div>

  
  <div className='flex'>
  <input
  id='candidates'
  name='candidates'
  type='checkbox'
  checked={formData.candidates}
  onChange={changeHandler}
  />

  <div>
    <label htmlFor="candidates">Candidates</label>
    <p>Get notified when a candidate applies for a job</p>
  </div>
  </div>

  
  <div className='flex'>
  <input
  id='offers'
  name='offers'
  type='checkbox'
  checked={formData.offers}
  onChange={changeHandler}
  />

 <div>
    <label htmlFor="offers">Offers</label>
    <p>Get notified when someones accepts or rejects the offer</p>
  </div>
  </div>

</fieldset>

<br/>
<br/>
<fieldset>

  <legend>Push Notifications</legend>
  <p>These are delivered via SMS to your mobile phone.</p>

  <br/>
  <input
  type="radio"
  id='pushEverything'
  name="pushNotifications"
  value="Everything"
  onChange={changeHandler}
  />

  <label htmlFor="pushEverything">Everything</label>

<br/>
  <input
  type="radio"
  id='pushEmail'
  name="pushNotifications"
  value="Same as email"
  onChange={changeHandler}
  />

  <label htmlFor="pushEmail">Same as email</label>

  <br/>
  <input
  type="radio"
  id='pushNothing'
  name="pushNotifications"
   value="No Push Notification"
   onChange={changeHandler}
  />

  <label htmlFor="pushNothing">No Push Notification</label>


</fieldset>

<br/>
<button className='text-white bg-blue-800 font-bold rounded py-2 px-4'>Save</button>

      </form>
    </div>
  );
}

export default App;
