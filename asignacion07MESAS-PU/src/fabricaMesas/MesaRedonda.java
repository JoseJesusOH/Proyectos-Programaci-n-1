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
public class MesaRedonda extends Mesa implements IMesa {

    /**
     * Atributo radio del circulo que nos ayudara a calcular el area
     */
    private double radio;

    /**
     * Metodo constructor para establecer el tipo de mesa, material y radio
     *
     * @param tipoMesa Tipo de mesa
     * @param material Material de la mesa
     * @param radio Radio de la mesa circular
     */
    public MesaRedonda(String tipoMesa, int material, double radio) {
        super(tipoMesa, material);
        this.radio = radio;

    }

    /**
     * Metodo para calcular el area de la mesa circular
     */
    @Override
    public void calcularArea() {
        this.area = Math.PI * (Math.pow(radio, 2));
    }

    /**
     * MEtodo para calcualr el costo de la mesa circular deacuerdo a su material
     */
    @Override
    public void calcularCosto() {
        if (material == 1) {
            this.costo = (Costos.get(Costos.CUBIERTA, Costos.PINO) * area) + (Costos.get(Costos.PEDESTAL, Costos.PINO));
        } else if (material == 2) {
            this.costo = (Costos.get(Costos.CUBIERTA, Costos.CEDRO) * area) + (Costos.get(Costos.PEDESTAL, Costos.CEDRO));
        }

    }

    /**
     * Metodo to string que nos ayuda a mostrar los atributos de la clase padre,
     * y los atributos de la clase, demas de mostrar el area, costo de la mesa
     *
     * @return Cadena de caracteres que nos ayudan a identificar los datos de la
     * mesa.
     */
    @Override
    public String toString() {
        return super.toString() + " , Radio; " + radio + " , Area; " + area + " , Costo; " + costo;
    }

}
