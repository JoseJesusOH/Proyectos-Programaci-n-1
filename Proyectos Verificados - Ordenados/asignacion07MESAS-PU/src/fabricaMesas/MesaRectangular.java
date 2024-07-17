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
public class MesaRectangular extends Mesa implements IMesa {

    /**
     * Atributos double del ancho y largo de la mesa
     */
    private double ancho, largo;

    /**
     * Metodo constructor de la clase en el cual establecemos el tipo de mesa, y
     * los atributos de la clase, ademas del material a utilizar.
     *
     * @param tipoMesa Tipo de mesa
     * @param ancho Ancho de la mesa
     * @param largo Largo de la mesa
     * @param material MAterial de la mesa a utilizar
     */
    public MesaRectangular(String tipoMesa, double ancho, double largo, int material) {
        super(tipoMesa, material);
        this.ancho = ancho;
        this.largo = largo;
    }

    /**
     * MEtodo para calcular el area de la superficie de la mesa
     */
    @Override
    public void calcularArea() {
        this.area = ancho * largo;
    }

    /**
     * Metodo para calcular el costo de la mesa
     */
    @Override
    public void calcularCosto() {
        if (material == 1) {
            this.costo = (area * (Costos.get(Costos.CUBIERTA, Costos.PINO))) + (4 * (Costos.get(Costos.PATA, Costos.PINO)));
        } else if (material == 2) {
            this.costo = (area * (Costos.get(Costos.CUBIERTA, Costos.CEDRO))) + (4 * (Costos.get(Costos.PATA, Costos.CEDRO)));
        }
    }

    /**
     * Metodo que nos regresa una cadena de carecteres a imprimir de la clase
     * padre y los atributos de la clase, ademas de mostrar area y costo de la
     * mesa
     *
     * @return Una cadena de caracteres
     */
    @Override
    public String toString() {
        return super.toString() + " , Ancho; " + ancho + " , Largo; " + largo + " , Area; " + area + " , Costo; " + costo;
    }

}
