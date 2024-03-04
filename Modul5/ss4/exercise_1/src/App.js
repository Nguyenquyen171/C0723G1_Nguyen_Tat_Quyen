import './App.css';
import Count from "./components/Counter";
import React from "react";

function App() {
    const [count, setCount] = Count(1);
    const [count1, setCount1] = Count(2);
    const increase1Unit = () => {
        setCount();
    };
    const increase2Unit = () => {
        setCount1();
    };
    return (
        <>
            <h3>Count: {count}</h3>
            <button onClick={increase1Unit}>Add 1</button>
            <br/>
            <h3>Count: {count1}</h3>
            <button onClick={increase2Unit}>Add 2</button>
        </>
    );
}

export default App;