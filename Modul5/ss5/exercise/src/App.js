import logo from './logo.svg';
import './App.css';
import ContactForm from "./components/contactForm";
import React from "react";
import { ToastContainer, toast } from 'react-toastify';
import 'react-toastify/dist/ReactToastify.css';

function App() {
  return (
      <>
        <ContactForm/>
        <ToastContainer/>
      </>
  );
}

export default App;