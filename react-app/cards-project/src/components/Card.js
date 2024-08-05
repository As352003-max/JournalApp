// rafc icon react.js
import {FcLike,FcLikePlaceholder} from "react-icons/fc"
import React from 'react'
import { toast } from "react-toastify";

const Card = (props) => {
  let course=props.course;
  let likedCourses = props.likedCourses;
  let setLikedCourses =props.setLikedCourses;
  function cliclHandler() {
    // logic
    if(likedCourses.includes(course.id)){
      // pehle se liked hua pada hai
      setLikedCourses((prev) => prev.filter(((cid)=>cid!==course.id)) );
      toast.warning("like removed")
    } else{
      // pehle se liked nahi hai ye course
      // insert karna hai ye corse liked courses me 
      if (likedCourses.length===0) {
        setLikedCourses([course.id]);
      } else {
        //  non empty pehle se
        setLikedCourses((prev)=>[...prev,course.id]);
      }
      toast.success("Liked Successfully");
    }
  }
  return (
    <div className="w-[300px] bg-slate-600 bg-opacity-80 rounded-md overflow-hidden">
      <div className="relative">
        <img src={course.image.url} alt=""></img>
      </div>
        <div className="w-[30px] h-[30px] bg-white rounded-full absolute  grid place-items-center right-[200px] top-[200px] ">
            <button onClick={cliclHandler}>
                {
                  likedCourses.includes(course.id)?
                  (<FcLike fontSize="1.75rem"/>):
                  (<FcLikePlaceholder fontSize="1.75rem"/>)
                }
            </button>
        </div>
    
      <div>
        <p className="font-bold text-lg text-white leading-6">{course.title}</p>
        <p className=" mt-2 text-white">
          {course.description.length>100 ?
          (course.description.substr(0,100)) +"...":
          (course.description)
          }
          </p>
      </div>
    </div>
  )
}

export default Card
