import React from 'react'

const Filter = (props) => {
  let filterData = props.filterData;
  let category=props.category;
  let setCategory=props.setCategory;

function filterHandler(title) {
  setCategory(title);
}
  return (
    <div className='w-11/12 flex flex-wrap max-w-max justify-center gap-y-4 space-x-4 mx-auto py-4'>
  {filterData.map((data)=>{
            return(<button 
        className={`bg-black text-white rounded-md font-medium text-lg px-2 py-1 hover:bg-opacity-50 border-2 transition-all duration-300
          ${category=== data.title ?
             "bg-opacity-60 border-white":
              "bg-opacity-40 border-transparent"}`}
       key={data.id} 
       onClick={()=>filterHandler(data.title)}>
            {data.title}
        </button>
     )
      })}
    </div>
  )
}

export default Filter;
