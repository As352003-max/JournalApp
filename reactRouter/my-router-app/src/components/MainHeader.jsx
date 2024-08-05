// import React from 'react'
import { Outlet } from "react-router-dom"
const MainHeader = () => {
    return (
        <div>
            {/* Outlet is used to do nested routing */}
         <Outlet/>
        </div>
      )
}

export default MainHeader
