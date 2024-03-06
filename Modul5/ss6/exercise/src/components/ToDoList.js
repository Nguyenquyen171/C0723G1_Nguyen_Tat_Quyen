function ToDoList() {
    return <>
        <div className="container mt-4">
            <h1>Todo List</h1>
            <div className="d-flex">
                <input type="text" value={this.state.item} className="form-control" onChange={handleChange}
                       placeholder="Enter task"/>
                <button className="btn btn-outline-dark" type="button" onClick={handleAddItem}>Submit</button>
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
                    {/*{this.state.list.map((value, index) =>*/}
                    {/*    <tr key={index}>*/}
                    {/*        <td>{index + 1}</td>*/}
                    {/*        <td>{value}</td>*/}
                    {/*    </tr>*/}
                    {/*)}*/}
                    </tbody>
                </table>
            </div>
        </div>
    </>;

}