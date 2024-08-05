import React, { useEffect } from "react";
import Navbar from "./components/Navbar";
import Filter from "./components/Filter";
import Cards from "./components/Cards";
import './App.css';
import  {apiUrl,filterData} from "./data";
import {useState } from "react";
import { toast } from "react-toastify";
import Spinner  from "./components/Spinner";

const App=()=> {
  const [courses,setCourses]=useState(null);
  const [loading,setLoading]=useState(true);
  const [category,setCategory]=useState(filterData[0].title);

    async function fetchData(){
     setLoading(true);

      try {
        let response=await fetch(apiUrl);
        const output=await response.json();
        // output
        setCourses(output.data);
        // console.log("courses value updated");
        // console.log(courses);
      } catch (error) {
        toast.error("Something went wrong")
      }
      setLoading(false);
    }
    useEffect(()=>{
    fetchData();
    },[])
  
  
  
  return (
    <div className="main-h-screen flex bg-slate-400 flex-col"  >
      {/* navbar components*/}
      <div>
      <Navbar/>
      </div>
     

      <div >
      {/* filter components*/}
      <div>
      <Filter
      filterData={filterData}
      category={category}
      setCategory={setCategory}
      />
      </div>
      

      {/* Cards components*/}
      <div className="  w-11/12 max-w-[1200px] mx-auto flex flex-wrap justify-center items-center min-h-[50vh] ">
        {
           loading ? (<Spinner/>) : (<Cards courses={courses} category={category}/>)
        }
       </div>
       </div>
      </div>
      
  );
}

export default App;
