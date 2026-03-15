//Pide la nota
let nota = parseInt(prompt("Introduc euna nota entre 0 y 10:"));

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