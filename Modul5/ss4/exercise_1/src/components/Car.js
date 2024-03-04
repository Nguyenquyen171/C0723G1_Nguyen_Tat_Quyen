import {useState} from "react";

function CarSelected() {
    const [selectedCar, setSelectedCar] = useState({
        car: "Mercedes6",
        color: "black"
    });

    const handleChangeCar = (event) => {
        let updateCar ={car: event.target.value};
        setSelectedCar({...selectedCar,...updateCar})
    };

    const handleChangeColor = (event) => {
        setSelectedCar(() => (
                {...selectedCar, ...{color: event.target.value}}
            )
        );
    };

    return <>
        <h3>SELECT YOUR CAR</h3>
        <label htmlFor="car">Select a car</label>
        <select onInput={handleChangeCar}  onChange={handleChangeCar} name="car" id="car">
            <option value="Mercedes6">Mercedes6</option>
            <option value="Mercedes7">Mercedes7</option>
            <option value="Mercedes8">Mercedes8</option>
        </select>
        <br/>
        <label htmlFor="color">Select color</label>
        <select onInput={handleChangeColor} name="color" id="color">
            <option value="black">black</option>
            <option value="white">white</option>
            <option value="pink">white</option>
        </select>
        <p>selected {selectedCar.car} - {selectedCar.color}</p>
    </>

}

export default CarSelected;


