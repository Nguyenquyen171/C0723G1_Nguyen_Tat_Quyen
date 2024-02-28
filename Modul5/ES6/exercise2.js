//1
const isPrime = num => {
    if (num <= 1) return false;
    if (num <= 3) return true;

    if (num % 2 === 0 || num % 3 === 0) return false;

    let i = 5;
    while (i * i <= num) {
        if (num % i === 0 || num % (i + 2) === 0) return false;
        i += 6;
    }

    return true;
};

//2
const person = {
    name: 'John Doe',
    age: 25,
    gender: 'Male',
    country: 'USA'

};

const {name, age, ...rest} = person;
const student = {
    ...rest,
    role: 'Student'
};
console.log(student);

//3
const numbers = [2, 3, 4, 5, 6, 7, 8, 9, 10];
const primeNumbers = numbers.filter(num => isPrime(num));
console.log(primeNumbers); // Kết quả: [2, 3, 5, 7]

function displayInfo(obj) {
    let firstName = obj.firstName || "Quân";

    let degree = obj.degree || "NA";

    console.log(`firstName: ${firstName}, degree: ${degree}`);

}

let obj1 = {firstName: "John", degree: "PhD"}
displayInfo(obj1);
let obj2 = {};
displayInfo(obj2);
