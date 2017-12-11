package boletin13_1;

public class Boletin13_1 {

    public static void main(String[] args) {

        ConversorTemperaturas obx1 = new ConversorTemperaturas();

        try {
            obx1.centigradosAFharenheit();

        } catch (TemperaturaErradaExcepcion ex) {
            System.out.println(ex.getMessage());

        }

        ConversorTemperaturas obx2 = new ConversorTemperaturas();

        obx2.centígradosAReamur();

    }

}
