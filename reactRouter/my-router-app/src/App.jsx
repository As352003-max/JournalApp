// Here Route is basically used to render different elements in one common page on clicking on specific link

import { Routes,Route } from 'react-router-dom';
import Home from './components/Home';
import Support from './components/Support';
import About from './components/About';
import Labs from './components/Labs';
import MainHeader from './components/MainHeader';
import NotFound from './components/NotFound';
import './App.css'
import {NavLink } from 'react-router-dom';
// difference between link and navlink is it makes the status active for the element
function App() {
  // const [count, setCount] = useState(0)

  return (
    <div className='App'>

      <nav>
        <ul>
          <li>
            <NavLink to="/">Home</NavLink>
          </li>
          <li>
          <NavLink to="/support">Support</NavLink>
          </li>
          <li>
          <NavLink to="/about">About</NavLink>
          </li>
          <li>
          <NavLink to="/labs">Labs</NavLink>
          </li>
        </ul>
      </nav>
    <Routes>
      <Route path="/" element={<MainHeader/>}>
      {/* {Default Route} */}
      <Route index element={<Home/>}/>
      <Route path="/support" element={<Support/>}/>
      <Route path="/about" element={<About/>} />
      <Route path="/labs" element={<Labs/>} />
      <Route path='/not-found' element={<NotFound/>} />
      </Route>
    </Routes>
    </div>
  )
}

export default App
