package Examen;

public abstract class Criatura {

    //Datos encapsulados
    private String nombre;
    private int nivel;
    private int psMax;
    private int psActual;
    private int ataque;
    private int defensa;

    //Constructor
    public Criatura(String nombre, int nivel, int psMax,
                    int psActual, int ataque, int defensa) {
        this.nombre = nombre;
        this.nivel = nivel;
        this.psMax = psMax;
        this.psActual = psActual;
        this.ataque = ataque;
        this.defensa = defensa;
    }

    //Getters Setters
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getNivel() {
        return nivel;
    }

    public void setNivel(int nivel) {
        this.nivel = nivel;
    }

    public int getPsMax() {
        return psMax;
    }

    public void setPsMax(int psMax) {
        this.psMax = psMax;
    }

    public int getPsActual() {
        return psActual;
    }

    public void setPsActual(int psActual) {
        this.psActual = psActual;
    }

    public int getAtaque() {
        return ataque;
    }

    public void setAtaque(int ataque) {
        this.ataque = ataque;
    }

    public int getDefensa() {
        return defensa;
    }

    public void setDefensa(int defensa) {
        this.defensa = defensa;
    }


    //Metodos
    public boolean estaDebilitada() {
        return (psActual <= 0);
    }

    public void curarCompleto() {
        psActual = psMax;
    }

    public void recibirDanio(int cantidad){
        psActual = psActual - cantidad;
        if (psActual < 0) {
            psActual = 0;
        }
    }

    public String estado() {
        return nombre + " [" + getTipo() +  "] " + "Nv." + nivel +
                " PS " + psActual + "/"  + psMax +
                " ATK " + ataque +
                " DEF " + defensa;
    }

    public abstract String getTipo();

    public abstract int atacar(Criatura objetivo);

}
