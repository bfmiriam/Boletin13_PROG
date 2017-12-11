package boletin13_1;

import java.util.Scanner;

public class ConversorTemperaturas {

    final static int graosCº = 80;
    public float centigrados;
    public float resultado;

    public ConversorTemperaturas() {

    }

    Scanner ler = new Scanner(System.in);

    public void centigradosAFharenheit() throws TemperaturaErradaExcepcion {

        System.out.println("Introduce temperatura: ");
        centigrados = ler.nextFloat();

        if (centigrados < 80) {
            throw new TemperaturaErradaExcepcion("...La temperatura debe ser mayor de 80ºC...");
        }

        resultado = (float) (9 / 5 * centigrados + 32.4);
        System.out.println("Fharenheir= " + resultado);

    }

    public void centígradosAReamur() {

        try {
            System.out.println("Introduce temperatura: ");
            centigrados = ler.nextFloat();

            if (centigrados < 80) {
                throw new TemperaturaErradaExcepcion();
            }

            resultado = (float) (4.0 / 5.0 * centigrados);
            System.out.println("Reamur= " + resultado);

        } catch (TemperaturaErradaExcepcion e1) {
            System.out.println("...La temperatura debe ser mayor de 80ºC...");
        }

    }

}
