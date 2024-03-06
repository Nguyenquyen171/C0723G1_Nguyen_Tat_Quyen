import React from 'react';
import {ErrorMessage, Field, Form, Formik} from "formik";
import {toast} from 'react-toastify';
import 'react-toastify/dist/ReactToastify.css';
import * as bookService from "../../service/BookService"
import * as Yup from "yup";
import {useNavigate} from "react-router-dom";


function CreateBook() {
    const navigate = useNavigate();
    const initialValue = {
        title: "",
        quantity: 0
    };
    const validateObject = {
        title: Yup.string()
            .required("Vui lòng nhập tiêu đề"),
        quantity: Yup.number().required("Vui lòng nhập số lượng")
            .min(1, "Số lượng phải lớn hơn 0 !")
    };

    const addNewBook = async (values) => {
        let result = await bookService.createBook(values);
        if (result) {
            toast.success("Thêm mới thành công");
            navigate("/")
        } else {
            toast.error("Lỗi")
        }
    };

    return <>
        <div className="container mt-4">
            <h1>Add New Book</h1>
            <Formik
                initialValues={initialValue}
                onSubmit={(values) => {
                    addNewBook(values);
                }}
                validationSchema={Yup.object(validateObject)}
            >

                <Form>
                    <div>
                        <label htmlFor="title" className="form-label">Title</label>
                        <Field type="text" className="form-control" name="title" id="title"/>
                        <ErrorMessage name="title" component="span" className="err-mess text-danger"/>

                        <label htmlFor="quantity" className="form-label">Quantity</label>
                        <Field type="number" className="form-control" name="quantity" id="quantity"/>
                        <ErrorMessage name="quantity" component="span" className="err-mess text-danger"/>

                        <button className="btn btn-outline-dark" type="submit">Submit</button>
                    </div>
                </Form>
            </Formik>
        </div>
    </>
}
export default CreateBook;