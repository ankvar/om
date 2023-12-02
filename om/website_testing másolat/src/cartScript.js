const cart = document.getElementById("cartElements");

let price;

let cartElementIDS = ["A", "B", "C", "D", "E", "F"]

let cartElement = [
    {
        id: A,
        element: "A",
        price: "PRICE"
    },
    {
        id: B,
        element: "B",
        price: "PRICE"
    },
    {
        id: C,
        element: "C",
        price: "PRICE"
    },
    {
        id: D,
        element: "D",
        price: "PRICE"
    },
    {
        id: E,
        element: "E",
        price: "PRICE"
    },
    {
        id: F,
        element: "F",
        price: "PRICE"
    },
];

const getfoodbtn = document.getElementById("getFoodButton");

const getfood = Boolean(getfoodbtn);

const foodDiv = document.getElementById("foodDiv");

if(cartElementIDS[1] == getfood) {
    document.getElementById("firstFooded").innerHTML = cartElement[1];
    const activeFooded = getfood;
}

const allPrice = Math.floor(Math.round(acivefood, price))