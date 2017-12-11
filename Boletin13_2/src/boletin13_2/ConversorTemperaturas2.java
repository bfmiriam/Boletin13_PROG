
package boletin13_2;

import java.util.Scanner;


public class ConversorTemperaturas2 {
        final static int graosCº=80;
    public float centigrados;
    public float resultado;
    
    public ConversorTemperaturas2(){
        
    }
    
    Scanner ler= new Scanner(System.in);
    
    public void centigradosAFharenheit() throws TemperaturaErradaExcepcion2{
    
        System.out.println("Introduce temperatura: ");
        centigrados=ler.nextFloat();
       
        if(centigrados<80){
            throw new TemperaturaErradaExcepcion2 ("...La temperatura debe ser mayor de 80ºC..."); 
        }
        
        resultado=(float) (9/5 * centigrados+32.4);
        System.out.println("Fharenheir= "+resultado);
  
   } 
    
    
    public float centígradosAReamur(){
        
        do{ 
        System.out.println("Introduce temperatura: ");
        centigrados=ler.nextFloat();
        }while(centigrados<80);
       
       resultado=(float) (4.0 / 5.0 * centigrados);
       
       return resultado;
       
    
        
    }
}
