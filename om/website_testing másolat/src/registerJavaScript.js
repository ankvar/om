alert('A kuponok eléréséhez fel kell iratkoznod!')

document.getElementById("submitButton").onclick = function() {
    const nameLabel = document.getElementById("nameLabel");
    const emailLabel = document.getElementById("emailLabel");
    const nameInput = document.getElementById("nameInput");
    const emailInput = document.getElementById("emailInput");

    if (nameInput.value === "" || emailInput.value === "") {
        alert('Minden mező kitöltése kötelező.');
    } else {
        const rateHREF = document.createElement("a")
        rateHREF.textContent = ("Tovább a kuponközpontba")
        rateHREF.href = "../html/cupon.html";

        const myDiv = document.querySelector("#myDiv")
        myDiv.appendChild(rateHREF);
    }

};
