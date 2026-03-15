const letras = ['T','R','W','A','G','M','Y','F','P','D',
'X','B','N','J','Z','S','Q','V','H','L','C','K','E'];

let numero = parseInt(prompt("Introduce el número de DNI:"));

while (numero < 0 || numero > 99999999) {

    console.log("Número de DNI no válido");
    numero = parseInt(prompt("Introduce el número de DNI:"));

}

let letraUsuario = prompt("Introduce la letra del DNI:").toUpperCase();

let resto = numero % 23;
let letraCorrecta = letras[resto];

if (letraUsuario === letraCorrecta) {

    console.log("DNI correcto");

} else {

    console.log("DNI incorrecto. La letra correcta es " + letraCorrecta);

}