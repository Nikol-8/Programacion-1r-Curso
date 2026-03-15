//Pide dos numeros al usuario
let numero1 = parseInt(prompt("Introduce el primer número:"));
let numero2 = parseInt(prompt("Introduce el segundo número:"));

//A) Qué número es mayor
if (numero1 > numero2) {
    console.log("El número mayor es: " + numero1);
} 
else if (numero2 > numero1) {
    console.log("El número mayor es: " + numero2);
} 
else {
    console.log("Los dos números son iguales");
}


//B) Si son positivos
if (numero1 > 0 && numero2 > 0) {
    console.log("Los dos números son positivos");
} else {
    console.log("Al menos uno de los números no es positivo");
}


//C) Si son igual a cero
if (numero1 === 0 || numero2 === 0) {
    console.log("Uno de los números es igual a cero");
}
