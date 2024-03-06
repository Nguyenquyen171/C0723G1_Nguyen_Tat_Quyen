import logo from './logo.svg';
import './App.css';
import {BrowserRouter, Route, Routes} from "react-router-dom";
import CreateBook from "./components/BookManagement/CreateBook";
import Library from "./components/BookManagement/Libary";
import EditBook from "./components/BookManagement/EditBook";

function App() {
    return (
        <>
            {/*<ToDoApp/>*/}
            <BrowserRouter>
                <Routes>
                    <Route path="/" element={<Library/>}/>
                    <Route path="create" element={<CreateBook/>}/>
                    <Route path="edit/:bookId"  element={<EditBook/>}/>
                </Routes>
            </BrowserRouter>
            {/*<ToastContainer/>*/}

        </>
    );
}

export default App;
