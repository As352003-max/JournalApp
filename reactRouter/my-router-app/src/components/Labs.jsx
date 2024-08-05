// import React from 'react'

import { useNavigate } from "react-router-dom";

const Labs = () => {
  const navigate = useNavigate();

function clickHandler() {
  // move to the page on clickinng the button useNavigate is used to provide navigation
  navigate("/about");
}

  return (<div>
    <div>
       This is Labs page
    </div>
    <button onClick={clickHandler}>Move to About Page</button>
  </div>
    
  )
}

export default Labs;
