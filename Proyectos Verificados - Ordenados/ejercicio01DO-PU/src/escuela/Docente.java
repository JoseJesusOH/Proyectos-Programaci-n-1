/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package escuela;

/**
 *
 * @author josej
 */
public class Docente {

    private String nombre;
    private String apellido;
    private String tipo;
    private float horas;
   
    /**
     * Constructor que inicializa los atributos de la clase
     *
     * @param nombre Nombre del docente
     * @param apellido Apellido del docente
     * @param tipo Tipo de maestro
     * @param horas Horas Trabajadas
     */
    public Docente(String nombre, String apellido, String tipo, float horas) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.tipo = tipo;
        this.horas = horas;
    }

    /**
     * Regresa el nombre del maestro
     *
     * @return el nombre del maestro
     */
    public String getNombre() {
        return nombre;
    }

    /**
     * Establece el nombre
     *
     * @param nombre nombre del maestro
     */
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    /**
     * Obtiene el apellido del maestro
     *
     * @return el apellido
     */

    public String getApellido() {
        return apellido;
    }

    /**
     * Estable el apellido del docente
     *
     * @param apellido Apellido del docente
     */
    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    /**
     *Obtiene el tipo de maestro
     * @return el tipo de maestro
     */
    public String getTipo() {
        return tipo;
    }
    /**
     * Establece el tipo de maestro
     * @param tipo Tipo de maestro
     */
    public void setTipo(String tipo) {
        this.tipo = tipo;
    }
    /**
     * Obtiene el numero de horas trabajadas por el docente
     * @return Numero de horas
     */
    public float getHoras() {
        return horas;
    }
    /**
     * Establece el numero de horas que trabajo el docente
     * @param horas Numero de horas trabajadas
     */
    public void setHoras(float horas) {
        this.horas = horas;
    }
    /**
     * Obtiene el costo por hora de trabajo
     * @return 
     */
    
   /**
    * Regresa el nombre y apellidos fusionados del docente
    * @return nombre cmpleto
    */
    public String nombreCompleto() {
        return nombre + " " + apellido;
    }
    /**
     * Obtiene el sueldo bruto del empleado
     * @return El sueldo del docente
     */
    public float sueldoBruto() {
        return (tipo.equalsIgnoreCase("letras"))? 5*horas : (tipo.equalsIgnoreCase("ciencias"))? 3*horas: null;
    }
    /**
     * Obtiene el descuento del sueldo para el docente 
     * @return  El descuento a realizar
     */
    public float descuento() {
        return (float) (sueldoBruto() * 0.10);
    }
    /**
     * Obtiene el sueldo neto del cliente.
     * @return 
     */
    public float sueldoNeto() {
        return (sueldoBruto() - descuento());
    }
}
