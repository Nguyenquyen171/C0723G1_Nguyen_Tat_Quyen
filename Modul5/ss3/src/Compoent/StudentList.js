import {Component} from "react";

const students = [
    {
        id: 1,
        name: 'A',
        age: 22,
        address: 'Da Nang'
    },
    {
        id: 2,
        name: 'B',
        age: 22,
        address: 'Ha Noi'
    },
    {
        id: 3,
        name: 'C',
        age: 22,
        address: 'Sai Gon'
    },
    {
        id: 4,
        name: 'D',
        age: 22,
        address: 'Da Nang'
    }
];


class StudentList extends Component {
    render() {
        return (
            <div className="container p-4">
                <h2>Student List</h2>
                <table className="table table-dark table-striped table-hover mt-4">
                    <thead>
                    <tr>
                        <th>Number</th>
                        <th>Name</th>
                        <th>Age</th>
                        <th>Address</th>
                    </tr>
                    </thead>
                    <tbody>
                    {students.map((student, index) => (
                        <tr key={student.id}>
                            <td>{index + 1}</td>
                            <td>{student.name}</td>
                            <td>{student.age}</td>
                            <td>{student.address}</td>
                        </tr>
                    ))}

                    </tbody>
                </table>
            </div>
        )
    }
}

export default StudentList;