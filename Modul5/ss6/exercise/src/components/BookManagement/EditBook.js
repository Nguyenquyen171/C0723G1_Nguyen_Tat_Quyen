import React, {useEffect, useState} from 'react';
import {ErrorMessage, Field, Form, Formik} from "formik";
import {toast} from 'react-toastify';
import 'react-toastify/dist/ReactToastify.css';
import {useNavigate, useParams} from "react-router-dom";
import * as bookService from "../../service/BookService"
import * as Yup from "yup";


function EditBook() {
    const navigate = useNavigate();
    const [editedBook, setEditedBook] = useState();
    const {bookId} = useParams();

    const validateObject = {
        title: Yup.string()
            .required("Vui lòng nhập tiêu đề"),
        quantity: Yup.number().required("Vui lòng nhập số lượng")
            .min(1, "Số lượng phải lớn hơn 0 !")
    };

    const getBookById = async () => {
        let data = await bookService.getBookById(bookId);
        setEditedBook(data);
    };

    const editBook = async (values) => {
        let result = await bookService.editBook(values);
        if (result) {
            toast.success("Chỉnh sửa thành công");
            navigate("/")
        } else {
            toast.error("Lỗi")
        }
    };

    useEffect(() => {
        getBookById();
    }, []);
    if (!editedBook) {
        return null;
    } else {
        return <>
            <div className="container mt-4">
                <h1>Edit Book</h1>
                <Formik
                    initialValues={editedBook}
                    onSubmit={editBook}
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

                            <button className="btn btn-outline-dark" type="submit">Update</button>
                        </div>
                    </Form>
                </Formik>
            </div>
        </>
    }
}

export default EditBook;