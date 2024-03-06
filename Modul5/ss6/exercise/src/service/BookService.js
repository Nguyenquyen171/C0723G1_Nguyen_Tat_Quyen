import axios from "axios";

export const getAll = async () => {
    try {
        let response = await axios.get("http://localhost:8080/books");
        return response.data;
    } catch (e) {
        return undefined;
    }
};

export const createBook = async (book) => {
    try {
        await axios.post("http://localhost:8080/books", book);
        return true
    } catch (e) {
        return false;
    }
};

export const getBookById = async (bookId) => {
    try {
        let response = await axios.get(`http://localhost:8080/books/${bookId}`);
        return response.data;
    } catch (e) {
        return undefined;
    }
};

export const editBook = async (book) => {
    try {
        await axios.put(`'http://localhost:8080/books/${book.id}'`,book);
        return true;
    } catch (e) {
        return false;
    }
};