import './App.css';
import Item from './components/Item'; 
import Amitns from './Amitns';
import Card from './components/Card';

function App() {

  const response =[
  {
    itemName : "Nirma",
    itemDate : "20",
    itemMonth : "June",
    itemYear: "1998"
 },
  
 {
  itemName : "Nirma2",
  itemDate : "20",
  itemMonth : "June",
  itemYear: "1983"
},

{
  itemName : "Nirma3",
  itemDate : "20",
  itemMonth : "June",
  itemYear: "1984"
}
];

  return (
    <div>
      <Card>
      <Item name={response[0].itemName}>
     Hi how are you
     </Item>
     <Amitns day={response[0].itemDate} month={response[0].itemMonth} year={response[0].itemYear}></Amitns>

     <Item name={response[1].itemName}></Item>
     <Amitns day={response[1].itemDate} month={response[1].itemMonth} year={response[1].itemYear}></Amitns>

     <Item name={response[2].itemName}></Item>
     <Amitns day={response[2].itemDate} month={response[2].itemMonth} year={response[2].itemYear}></Amitns>
    <div className="App">Hello Jee</div>
      </Card>
     
    </div>
   
  );
}

export default App;
