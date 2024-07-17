
import java.util.GregorianCalendar;

import java.util.Scanner;

public class Calendario {

  
    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);
        GregorianCalendar fecha = new GregorianCalendar();

        int año,mesNa,meses,semanas,dias,años, horas;
        
        System.out.println("Ingresa el año de nacimiento: ");
        año = entrada.nextInt();
        
        System.out.println("Ingresa el mes de nacimiento: ");
        mesNa = entrada.nextInt();
       
        años = (fecha.get(GregorianCalendar.YEAR)- año ); 
        
        meses =((12-mesNa)+((años-1)*12) + (12-(fecha.get(GregorianCalendar.MONTH)))*2 )    ;
        
        
        semanas = (fecha.get(GregorianCalendar.DAY_OF_MONTH) )/7;

        dias = ((fecha.get(GregorianCalendar.DAY_OF_MONTH) )%7)-1;
       
        horas = (fecha.get(GregorianCalendar.HOUR) ) + 12 ;
                
        System.out.println(" Usted actualmente tiene " + años + " de edad ");
        System.out.println(" Por lo tanto usted vivido " + meses + " meses,\n con "+semanas+"  semanas, "+ dias + " dias y "+ horas +" horas"  );
          


    }
    
}
