class Edificio {

constructor(calle, numero, codigoPostal) {
    this.calle = calle;
    this.numero = numero;
    this.codigoPostal = codigoPostal;

    this.plantas = [];

    console.log("Construido nuevo edificio en calle: " +
         calle + ", nº: " + numero + ", CP: " + codigoPostal + ".");
}

imprimirCalle() {
    return this.calle;
}

imprimirNumero(){
    return this.numero;
}

imprimirCodigoPostal() {
    return this.codigoPostal;
}

modificarNumero(numero) {
    this.numero = numero;
}

modificarCalle(calle) {
    this.calle = calle;
}

modificarCodigoPostal(codigo) {
    this.codigoPostal = codigo;
}

agregarPlantasYPuertas(numplantas, puertas) {

    for (let i = 0; i < numplantas; i++) {

        let planta = [];

        for (let j = 0; j < puertas; j++) {
            planta.push("");
        }

        this.plantas.push(planta);
    }

    console.log("Agregadas " + numplantas + " plantas con " +
                               puertas + " puertas cada una.");
}

agregarPropietario(nombre, planta, puerta) {

    this.plantas[planta - 1][puerta - 1] = nombre;

    console.log(nombre + " es ahora el propietario de la puerta " +
                puerta + " de la planta " +
                planta + ".");
}

imprimirPlantas() {

    console.log("Listado de propietarios del edificio calle " + this.calle +
                " número " + this.numero);

    for (let i = 0; i < this.plantas.length; i++) {

        for (let j = 0; j < this.plantas[i].length; j++) {

            console.log(
                "Propietario del piso " + (j + 1) +
                " de la planta " + (i + 1) +
                ": " + (this.plantas[i][j] || "") + "."
            );
        }
    }
}

}

let edificioA = new Edificio("Garcia Prieto", 58, 15706);
let edificioB = new Edificio("Camino Caneiro", 29, 32004);
let edificioC = new Edificio("San Clemente", "s/n", 15705);

console.log("El código postal del edificio A es: " + edificioA.imprimirCodigoPostal());
console.log("La calle del edificio C es: " + edificioC.imprimirCalle());
console.log("El edificio B está situado en la calle " + edificioB.imprimirCalle() +
             " número " + edificioB.imprimirNumero());

console.log("Agregamos 2 plantas y 3 puertas por planta al edificio A...");
edificioA.agregarPlantasYPuertas(2,3);

console.log("Agregamos 4 propietarios al edificio A...");

edificioA.agregarPropietario("Jose Antonio Lopez",1,1);
edificioA.agregarPropietario("Luisa Martinez",1,2);
edificioA.agregarPropietario("Marta Castellón",1,3);
edificioA.agregarPropietario("Antonio Pereira",2,2);

edificioA.imprimirPlantas();

console.log("Agregamos 1 planta más al edificio A...");

edificioA.agregarPlantasYPuertas(1,2);

console.log("Agregamos 1 propietario más al edificio A planta 3, puerta 2...");

edificioA.agregarPropietario("Pedro Meijide",3,2);

edificioA.imprimirPlantas();