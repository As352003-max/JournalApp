// rafc
import Card from './Card';
import React from 'react'
import { useState } from 'react';
const Cards = (props) => {
let courses = props.courses;
let category=props.category;
const[likedCourses,setLikedCourses]=useState([]);
// getCourse it returns you a list of all courses from the api response
function getCourses (){
  if (category==='All') {
    let allCourses=[];
    // object.values se maine saare values nikal di key ko ignore karke saare value nikal diye for each ka  use karke hu saare values pe move karenge
    // console.log("printing courses"  );
    // console.log(courses);
    Object.values(courses).forEach((courseCategory)=>{
        courseCategory.forEach(courseData=>{
            allCourses.push(courseData);
        })
    })
  return allCourses;
  }
  else{
//  mai sirf specific category ka data pass karunga
 return courses[category];
  }
  

}


  return (
    <div className='flex flex-wrap justify-center gap-4 mb-4 '>
{
getCourses().map((course) => (
  <Card key={course.id} course={course}
  likedCourses={likedCourses}
  setLikedCourses={setLikedCourses}/>
))
}

      
    </div>
  )
}

export default Cards
