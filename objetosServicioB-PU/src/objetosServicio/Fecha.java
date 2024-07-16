package objetosServicio;
import java.util.GregorianCalendar;

/**
 *
 * @author Jose y Christian
 */
public class Fecha extends GregorianCalendar 
{
    /**
     * Constructor vacio en el cual establecemos minutos, segundos, hora y
     * milisegundos a cero, y ademas utilizamos super para intanciar un objeto
     * de fecha para crear la hora.
     */
    
    public Fecha() 
    {
        super();
        set(HOUR, 0);
        set(MINUTE, 0);
        set(SECOND, 0);
        set(MILLISECOND, 0);
    }

    /**
     * Constructor que solicita los argumentos del dia, mes y año e inicializa o
     * establce una fecha, e igualmente, hora, minuto, segundo y milisegundo se
     * establecen a cero.
     *
     * @param day
     * @param month
     * @param year
     */
    // No  sirve
    public Fecha(int day, int month, int year) 
    {
        super(year, (month - 1), day);
        set(HOUR, 0);
        set(MINUTE, 0);
        set(SECOND, 0);
        set(MILLISECOND, 0);
    }

    /**
     * Constructor que solicita los argumentos del objeto fecha tales como año,
     * dia, mnes para crear o estacler la nueva fecha con el apoyo del un
     * cnstructor externo que en este caso es el super,y ademas inicializa los
     * atributos de hora, minuto, segundo y milisegundo a cero.
     *
     * @param fecha
     */
    public Fecha(Fecha fecha) 
    {
        super(fecha.get(YEAR), fecha.get(MONTH), fecha.get(DAY_OF_MONTH));
        set(HOUR, 0);
        set(MINUTE, 0);
        set(SECOND, 0);
        set(MILLISECOND, 0);
    }

    /**
     * Metodo por el cual nos regresa el dia del mes
     *
     * @return El dia del mes
     */
    public int getDay() 
    {
        return get(DAY_OF_MONTH);
    }

    /**
     * Metodo por el cual obtenemos el mes y lo regresamos el mes +1
     *
     * @return El mes
     */
    public int getMonth() 
    {
        return (get(MONTH));
    }

    /**
     * Metodo para obtener el año
     *
     * @return El año
     */
    public int getYear() 
    {
        return get(YEAR);
    }

    /**
     * Metodo para establecer el dia del mes en base al paramtro
     *
     * @param day Recib el dia del mes como parametro
     */
    public void setDay(int day) 
    {
        set(DAY_OF_MONTH, day);
    }

    /**
     * Metodo para establecer el mes en base a su parametro
     *
     * @param month El mes
     */
    public void setMonth(int month) 
    {
        set(MONTH, (month - 1));
    }

    /**
     * Metodo para establecer el año e base a su parametro
     *
     * @param year El año
     */
    public void setYear(int year)
    {
        set(YEAR, year);
    }

    /**
     * Metodo para establecer dia del mes, mes y año en base a sus parametros.
     *
     * @param day El dia del mes
     * @param month El mes
     * @param year EL año
     */
    public void setFecha(int day, int month, int year) 
    {
        set(DAY_OF_MONTH, day);
        set(MONTH, (month - 1));
        set(YEAR, year);
    }

    /**
     * Metodo por el cual establecemos una fecha que se recibe como paramatro en
     * formato String
     *
     * @param s Fecha en Formato String "DD/MM/AAAA"
     */
    public Fecha(String s) 
    {

        int dia, mes, anho;
        switch (s.length()) 
        {
            case 10:
                dia = Integer.parseInt(s.substring(0, 2));
                mes = Integer.valueOf(s.substring(3, 5));
                anho = Integer.valueOf(s.substring(6, 10));
                this.setDay(dia);
                this.setMonth(mes);
                this.setYear(anho);
                break;
                
            case 9:
                if (s.codePointAt(1) == 47) 
                {
                    dia = Integer.valueOf(s.substring(0, 1));
                    mes = Integer.valueOf(s.substring(2, 4));
                    anho = Integer.valueOf(s.substring(5, 9));
                    this.setDay(dia);
                    this.setMonth(mes);
                    this.setYear(anho);
                } 
                else 
                {
                    dia = Integer.valueOf(s.substring(0, 2));
                    mes = Integer.valueOf(s.substring(3, 4));
                    anho = Integer.valueOf(s.substring(5, 9));
                    this.setDay(dia);
                    this.setMonth(mes);
                    this.setYear(anho);
                }
                break;
                
            case 8:
                dia = Integer.valueOf(s.substring(0, 1));
                mes = Integer.valueOf(s.substring(2, 3));
                anho = Integer.valueOf(s.substring(4, 8));
                this.setDay(dia);
                this.setMonth(mes);
                this.setYear(anho);
                break;
                
            default:
            break;
        }
    }

    /**
     * Metodo por el cual en base a la fecha que recibe como paarmetro y la
     * fecha actua, encontramos su numero de dias, que los separa
     *
     * @param desde Objeto del tipo fecha
     * @return El numero de dias entre una fecha y otra
     */
    public int lapso(Fecha desde) 
    {
        if (desde.getTimeInMillis() > getTimeInMillis()) 
        {
            long hastaInMillis = getTimeInMillis();
            long desdeInMillis = desde.getTimeInMillis();
            long dif = hastaInMillis - desdeInMillis;
            int dias = (int)((((((dif / 1000) / 60) / 60) / 24)*-1));
            return dias;
        }
        
        long hastaInMillis = getTimeInMillis();
        long desdeInMillis = desde.getTimeInMillis();
        long dif = hastaInMillis - desdeInMillis;
        int dias = (int) (((((dif / 1000) / 60) / 60) / 24));
        return dias;
    }

    /**
     * Metodo en el cual agregamos nuevos dias , meses y años a la fecha de
     * vencimiento o la nueva fecha de vencimiento
     *
     * @param days Dias a agregar
     * @param month Meses a agregar
     * @param year Años a a agregar
     * @return La nueva fecha de vencimiento
     */
    public Fecha vencimiento(int days, int month, int year) 
    {
        Fecha fechaVencimiento = new Fecha(this);
        fechaVencimiento.add(DAY_OF_MONTH, days);
        fechaVencimiento.add(MONTH, month);
        fechaVencimiento.add(YEAR, year);
        return fechaVencimiento;
    }

    /**
     * Metodo por el cual establecemos una nueeva fecha de vencimiento,
     * unicamente se le agregara nuevos dias y meses
     *
     * @param days Dias a agregar
     * @param months Meses a agregar
     * @return La nueva fecha de vencimiento
     */
    public Fecha vencimiento(int days, int months) 
    {
        return vencimiento(days, months, 0);
    }

    /**
     * Metodo por el cual le agregamos mas dias a la fecha de vencimiento
     *
     * @param days dias a agregar
     * @return La nueva fecha de vencimiento
     */
    public Fecha vencimiento(int days) 
    {
        return vencimiento(days, 0, 0);
    }

    @Override
    /**
     * Devuelve los valores obtenidos de dia, mes y año, en un formato
     * DD/MM/AAAA
     */
    public String toString() 
    {
        return this.get(DAY_OF_MONTH)+"/"+(this.get(MONTH)+1)+"/"+this.get(YEAR);
    }

}
