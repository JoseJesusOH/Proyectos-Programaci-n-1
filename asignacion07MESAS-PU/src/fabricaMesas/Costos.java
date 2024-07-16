/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fabricaMesas;

/**
 *
 * @author josej
 */
public class Costos {

    /**
     * Atributo estatico constante de los costos de las mesas en unn arreglo
     * bidimensional
     */
    private static final double[][] costos = {{100.0, 200.0}, {500.0, 800.0}, {60.0, 80.0}};
    /**
     * Atributos estaticos constantes que nos sirven de apoyo para identificar o
     * obtener los costos de los materiales para los tipos de mesas
     */
    protected static final int CUBIERTA = 0, PEDESTAL = 1, PATA = 2, PINO = 0, CEDRO = 1;

    /**
     * Metodo estatico para obtener el costo de la cubierta, y costo de los
     * pedestales y patas de las mesas a comprar
     *
     * @param componente Componente a obtener
     * @param material Material a obtener
     * @return EL costo del componente y su material
     */
    public static double get(int componente, int material) {
        return costos[componente][material];
    }

}
