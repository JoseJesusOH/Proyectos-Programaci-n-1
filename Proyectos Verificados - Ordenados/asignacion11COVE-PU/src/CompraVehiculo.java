import java.util.Scanner;

public class CompraVehiculo {

    public static void main(String[] args) {
        
        Scanner teclado = new Scanner(System.in);
        
        float ingreso, precioVehiculo, enganche=0, montoPago=0,mensualidad;
        int meses=0;

        System.out.println("Indique el sueldo mensual del comprador...");
        ingreso= teclado.nextFloat();
        System.out.println("Indique el precio del vehículo...");
        precioVehiculo = teclado.nextFloat( );

        if (ingreso>=12000){
        enganche = (float) (34*precioVehiculo)/100;
        meses =12 * 5;
        mensualidad = (float)(precioVehiculo-enganche)/meses;
        }  
        else {
        enganche = (float)(22*precioVehiculo)/100;
        meses =12 * 6;
        mensualidad = (float)(precioVehiculo-enganche)/meses;
        
        }
        System.out.println(" Ingresos del comprador :$ " + ingreso );
        System.out.println("    Precio del vehículo :$ " + precioVehiculo );
        System.out.println("               Enganche :$ " + enganche);
        System.out.println("          Meses a Pagar :$ " + meses);
        System.out.println(" Monto del pago mensual :$ " + mensualidad);

    }
    
}
