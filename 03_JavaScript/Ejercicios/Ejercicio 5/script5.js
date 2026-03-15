//Pide la edad al ususario
let edad = parseInt(prompt("Introduce tu edad:"));

//Comprueba la edad
if (edad < 18) {
    console.log("Es menor de edad");
} else if (edad >= 18 && edad <= 65) {
    console.log("Es adulto/a");
} else  {
    console.log("Está jubilado/a");
}