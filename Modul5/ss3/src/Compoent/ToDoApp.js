import {Component} from "react";
import {render} from "react-dom";

class ToDoApp extends Component {

    constructor(props) {
        super(props);
        this.state = {
            list: ["task1", "task2"],
            item: ""
        }
    }
    handleChange = (event) => {
        this.setState({
            item: event.target.value
        });
    };

    handleAddItem = () => {
        const arr = [...this.state.list, this.state.item];
        if (this.state.item !== "") {
            this.setState({
                list: arr,
                item: ""
            });
        }
    };


    render() {
        return (
            <div className="container mt-4">
                <h1>Todo List</h1>
                <div className="d-flex">
                    <input type="text" value={this.state.item} className="form-control" onChange={this.handleChange} placeholder="Enter task"/>
                    <button className="btn btn-outline-dark" type="button" onClick={this.handleAddItem}>Add</button>
                </div>
                <div>
                    <table className="table table-bordered table-striped table-hover mt-4">
                        <thead>
                        <tr>
                            <th>No.</th>
                            <th>Task</th>
                        </tr>
                        </thead>
                        <tbody>
                        {this.state.list.map((value, index) =>
                            <tr key={value}>
                                <td>{index + 1}</td>
                                <td>{value}</td>
                            </tr>
                        )}
                        </tbody>
                    </table>
                </div>
            </div>
        )
    }
}

export default ToDoApp;