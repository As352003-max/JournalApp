import './Amitns.css';

function Amitns(props) {


    const day=props.day;
    const month=props.month;
    const year=props.year;
   return(<div className="year">
    <span> {day} </span>
    <span> {month} </span>
    <span> {year} </span>
    </div>
    ) ;
    
}

export default Amitns;