/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package objetosServicio;

import java.util.Calendar;
import objetosServicio.Fecha;
import objetosServicio.Periodo;

/**
 *
 * @author josej
 */
public class Prueba01 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Fecha hoy = new Fecha(20, 01, 2021);
        Fecha ayer = new Fecha(2004, 8, 15);
        Fecha manhana = new Fecha(hoy);
        manhana.add(Calendar.YEAR, 1);
        System.out.println("------------------------------");
        System.out.println(hoy.toString());
        System.out.println("------------------------------");
        System.out.println(ayer.toString());
        System.out.println("------------------------------");
        System.out.println(manhana.toString());
        System.out.println("------------------------------");
        ayer.set(12, 6, 2008);
        System.out.println(ayer.toString());
        System.out.println("------------------------------");
//        System.out.println(hoy.lapso(manhana));
//        System.out.println(hoy.toString());
//        System.out.println(manhana.toString());
        System.out.println("------------------------------");
        System.out.println(hoy.equals(hoy));
        System.out.println("------------------------------"); 
        System.out.println(ayer.after(manhana)|| ayer==manhana);
        System.out.println(ayer.toString());
        System.out.println(manhana.toString());
        System.out.println("------------------------------");
        System.out.println(ayer.after(manhana));
        System.out.println(ayer.toString());
        System.out.println(manhana.toString());
        System.out.println("------------------------------");
        Fecha desde = new Fecha(2004, 2, 5);
        Periodo periodo = new Periodo(desde, hoy);
        System.out.println(periodo.toString());
        System.out.println("------------------------------");
        System.out.println(periodo.contiene(ayer));
    }

}
