import logo from './logo.svg';
import './App.css';
import 'bootstrap/dist/css/bootstrap.min.css';
import 'bootstrap/dist/js/bootstrap.bundle.min';
import StudentList from "./components/StudentList";
import React from "react";
import ToDoApp from "./components/ToDoApp";

function App() {
  return (
      <>
        {/*<StudentList/>*/}
        <ToDoApp/>
      </>
  );
}

export default App;