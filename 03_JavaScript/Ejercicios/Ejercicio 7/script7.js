function parImpar(numero){

    if (numero % 2 === 0) {
        return "El número es par";
    } else {
        return "El número es impar";
    }
}

let numero = parseInt(prompt("Introduce un número entero:"));

console.log(parImpar(numero));