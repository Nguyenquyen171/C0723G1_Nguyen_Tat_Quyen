import {useState} from "react";

function Count(addMore) {
    const [count, setCount] = useState(0);

    const increaseUnit = () => {
        setCount((previousValue) => previousValue + addMore);
    };

    return [count, increaseUnit];
}

export default Count;