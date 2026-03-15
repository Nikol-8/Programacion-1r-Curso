function saludar() {
    
    let nombre = prompt("Introduce tu nombre:");

    console.log("Bienvenido/a " + nombre + ".");
}

function mayorEdad() {

    let edad = parseInt(prompt("Introduce tu edad:"));

    if (edad < 18) {
        console.log("Tienes " + edad + " años, eres menor de edad.")
    } else if (edad > 18 && edad <=65) {
        console.log("Tienes " + edad + " años, eres aadulto/a.");
    } else {
        console.log("Tienes " + edad + " años, estás jubilado.");
    }
}

function calificacion() {

    let nota = parseInt(prompt("Introduce tu nota:"));
    
    if (nota < 3) {
        console.log("Insuficiente");
    } else if (nota >= 3 && nota <= 5) {
        console.log("Regular");
    } else if (nota >= 5 && nota <= 6) {
        console.log("Suficiente");
    } else if (nota >= 6 && nota <= 7) {
        console.log("Bien");
    } else if (nota >= 7 && nota <= 9) {
        console.log("Muy Bien");
    } else if (nota >= 9 && nota === 10) {
        console.log("Excelente");
    } else {
        console.log("Número no válido.");
    }
}

saludar();
mayorEdad();
calificacion();