import React from 'react';
import ReactDOM from 'react-dom/client';
import './index.css';
import App from './App';
import {ToastContainer} from "react-toastify";
// this is the css configuration of react-toastify which we will use ToastContiner
import "react-toastify/dist/ReactToastify.css";

const root = ReactDOM.createRoot(document.getElementById('root'));
root.render(
  <div>
    <App/>
    <ToastContainer/>
  </div>
);
