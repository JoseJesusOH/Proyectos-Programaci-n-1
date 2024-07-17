/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pruebas;

import fabricaMesas.IMesa;
import fabricaMesas.Mesa;
import fabricaMesas.MesaRectangular;
import fabricaMesas.MesaRedonda;

/**
 *
 * @author josej
 */
public class PruebaMesa {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here

        IMesa[] mesas = new IMesa[5];

        mesas[0] = new MesaRedonda("Redonda", 2, 5);
        mesas[1] = new MesaRedonda("Redonda", 1, 4);
        mesas[2] = new MesaRectangular("Rectangular", 4, 5, 1);
        mesas[3] = new MesaRectangular("Rectangular", 3, 8, 2);
        mesas[4] = new MesaRectangular("Rectangular", 6, 9, 1);

        for (int i = 0; i < 5; i++) {
            mesas[i].calcularArea();
            mesas[i].calcularCosto();
        }
        System.out.println("----------------------------------------------");
        for (int i = 0; i < 5; i++) {
            System.out.println(mesas[i].toString());
        }

    }

}
