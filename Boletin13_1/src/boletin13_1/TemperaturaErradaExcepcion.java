package boletin13_1;

public class TemperaturaErradaExcepcion extends Exception {

    public TemperaturaErradaExcepcion() {
        super("informacion da excepcion");
    }

    public TemperaturaErradaExcepcion(String mensaxe) {
        super(mensaxe);

    }
}
