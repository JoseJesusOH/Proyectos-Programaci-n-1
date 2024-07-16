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
public class Mesa {

    /**
     * Tipo de mesa a escoger
     */
    protected String tipoMesa;
    /**
     * Atributos double de area y costo para establecer los costos y superficies
     * de la smesas
     */
    protected double area, costo;
    /**
     * Atributo entero que nos apoya en el conteo de mesas desarrolladas
     */
    protected static int contadorMesas;
    /**
     * Atributo entero del material
     */
    protected int material;
    /**
     * Atributo entero que nos apoyo para establecer el numero de mesa que se
     * dasarollo
     */
    protected int numeMesa;

    /**
     * Metodo constructor para establcer el tipo de mesa y material
     *
     * @param tipoMesa Tipo de mesa
     * @param material Material de la mesa
     */
    public Mesa(String tipoMesa, int material) {
        this.tipoMesa = tipoMesa;
        this.material = material;
        contadorMesas++;
        this.numeMesa = contadorMesas;
    }

    /**
     * Metodo String que sirve para obtener el numero de mesa, tipo y material
     * de la mesa
     *
     * @return Los atributos de numMesa, tipoMEsa y material
     */
    @Override
    public String toString() {
        return "Numero; " + numeMesa + " Tipo; " + tipoMesa + " Material; " + ((material == 1) ? "Pino" : "Cedro");
    }

}
