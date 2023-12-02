function generateRandomCode() {

    const char = "ABCDEFGHIJKLMNOPQRSTUVWXYZ0123456789"
    let code = '';

    for(let i = 0; i < 8; i++) {
        const randomIndex = Math.floor(Math.random() * char.length);
        code += char.charAt(randomIndex);
    }
    return code   
}
const gave1Button = document.getElementById("gave1");
gave1Button.addEventListener('click', function() {
    const generatedCode = generateRandomCode();
    alert('A kuponkód: ' + generatedCode);
});

    const gave2Button = document.getElementById("gave2")
    gave2Button.addEventListener('click', function() {
        const generateCode = generateRandomCode();
        alert('A kuponkód: ' + generateCode);
});
    const gave3Button = document.getElementById("gave3")
    gave3Button.addEventListener('click', function() {
        const generateCode = generateRandomCode();
        alert('A kuponkód: ' + generateCode);
});
