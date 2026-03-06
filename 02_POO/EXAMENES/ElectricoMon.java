package Examen;

public class ElectricoMon extends Criatura implements Entrenable, Evolucionable {

    //Constructor
    public ElectricoMon(String nombre, int nivel,
                        int psMax, int psActual,
                        int ataque, int defensa) {
        super(nombre, nivel, psMax, psActual, ataque, defensa);
    }
    //Metodos
    @Override
    public String getTipo() {
        return "ELECTRICO";
    }

    @Override
    public int atacar(Criatura objetivo) {

        int danioBase = 0;
        int danioFinal = 0;
        double multiplicador = 1;

        danioBase = getAtaque() - objetivo.getDefensa()/2;

        if (danioBase < 1) {
            danioBase = 1;
        }

        String tipoDefensor = objetivo.getTipo();

        if (tipoDefensor.equals("AGUA")) {
            multiplicador = 2;
        } else if (tipoDefensor.equals("PLANTA")) {
            multiplicador = 0.5;
        }

        danioFinal = (int) Math.round(danioBase * multiplicador);

        objetivo.recibirDanio(danioFinal);

        return danioFinal;
    }

    @Override
    public void entrenar() {
        setNivel(getNivel() + 1);
        setPsMax(getPsMax() + 1);
        setAtaque(getAtaque() + 1);
        setDefensa(getDefensa()+1);

        curarCompleto();
    }

    @Override
    public boolean puedeEvolucionar() {
        return getNivel() >= 8;
    }

    @Override
    public Criatura evolucionar() {
        String nuevoNombre = getNombre() + " EVO";

        return new ElectricoMon(
                nuevoNombre,
                getNivel(),
                getPsMax() + 2,
                getPsMax() + 2,
                getAtaque() + 2,
                getDefensa() + 2
        );
    }
}
