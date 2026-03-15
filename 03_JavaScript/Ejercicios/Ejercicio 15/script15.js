function dameUnNumero() {

    let numero = parseInt(prompt("Dame un número:"));
    return numero;

}

function esMayor(numero1, numero2) {

    return numero1 < numero2;

}

let numero1 = dameUnNumero();
let numero2 = dameUnNumero();

while (esMayor(numero1, numero2)) {

    console.log("El primero es mayor");

    numero1 = dameUnNumero();
    numero2 = dameUnNumero();

}

console.log("El segundo es mayor. Fin");