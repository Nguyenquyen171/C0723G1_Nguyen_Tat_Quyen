import axios from "axios";

export const getAllBook = async (searchParam) => {
  try {
    const result = await axios.get(`http://localhost:3000/`);
    return result.data;
  } catch (error) {
    console.log(error);
  }
};

export const create = async (book) => {
  try {
    const result = await axios.post(`http://localhost:3000/create`, book);
    return result.data;
  } catch (error) {
    console.log(error);
  }
};

export const update = async (book) => {
  try {
    const result = await axios.patch(`http://localhost:3000/edit/${book.id}`, book);
    return result.data;
  } catch (error) {
    console.log(error);
  }
};

export const findById = async (id) => {
  try {
    const result = await axios.get(`http://localhost:3000/book/${id}`);
    return result.data;
  } catch (error) {
    console.log(error);
  }
};
