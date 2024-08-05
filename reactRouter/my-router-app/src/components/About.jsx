// import React from 'react'

import { useNavigate } from "react-router-dom"



const About = () => {
  const navigate = useNavigate()

  function clickHandler() {
    navigate(-1);
  }
  return (<div>
    <div>
       This is About page
    </div>
    <button onClick={clickHandler}>Go Back</button>
  </div>
    
  )
}

export default About
