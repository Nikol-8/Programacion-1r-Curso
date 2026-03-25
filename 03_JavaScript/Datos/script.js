let nombre = prompt("Introduce tu nombre y apellido:");
let dia = prompt("Introduzca su día de nacimiento: ");
let mes = prompt("Introduzca su mes de nacimiento: ");
let anio = prompt("Introduzca su año de nacimiento: ");

let hoy = new Date();
let fechaActual = hoy.toLocaleDateString();

let longitud = nombre.length;

let primeraA = nombre.indexOf("a");
let ultimaA = nombre.lastIndexOf("a");

let recorte = nombre.substring(3);

let mayusculas = nombre.toUpperCase();

let edad = hoy.getFullYear() - parseInt(anio);

let fechaNacimiento = new Date(anio, mes - 1, dia);

let diasSemana = ["domingo", "lunes", "martes", "miércoles", "jueves", "viernes", "sábado"];
let diaTexto = diasSemana[fechaNacimiento.getDay()];

let coseno = Math.cos(180 * Math.PI / 180);

let mayor = Math.max(34,67,23,75,35,19);

let aleatorio = Math.random();

let ul = document.getElementById("resultado");

ul.innerHTML = `
<li>Buenos días ${nombre}, hoy es ${fechaActual}</li>
<li>Tu nombre tiene ${longitud} caracteres</li>
<li>La primera "a" está en la posición: ${primeraA}</li>
<li>La última "a" está en la posición: ${ultimaA}</li>
<li>Tu nombre sin las 3 primeras letras: ${recorte}</li>
<li>Tu nombre en mayúsculas: ${mayusculas}</li>
<li>Tu edad es: ${edad} años</li>
<li>Naciste un feliz ${diaTexto} del año ${anio}</li>
<li>El coseno de 180 es: ${coseno}</li>
<li>El número mayor es: ${mayor}</li>
<li>Número aleatorio: ${aleatorio}</li>
`;