import java.util.Calendar;
import java.util.GregorianCalendar;
import java.util.Scanner;
public class Empleado {

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        
        DatosPedido pedido = new DatosPedido();
        float compras=0,acum=0,acumUno=0,acumDos=0,finDia=0,corte;
        
        float total=0,fin,totalUno=0,totalDos=0,pago=0;
        
          
    
        do{
        System.out.format("%19s %n","Bienvenido a Los Alamos Cafe"); 
        System.out.format("%s %n","------------------------------------------");
        System.out.format("%s %n","Ingresa porfavor tu nombre");
        String nombre=teclado.nextLine();
        pedido.setNombre(nombre);
        System.out.format("%-70s %n","------------------------------------------");
        System.out.format("%-70s %n","Muchas gracias por estar aqui: "+pedido.getNombre());
        System.out.format("%-70s %n","------------------------------------------"); 
    
        do{
        System.out.format("%-49s %n","Por el momento contamos con frapes y los sabores son: \n Caramelo Cajeta Mapcha Chai");
        System.out.format("%s %n","------------------------------------------");
        System.out.format("%-20s %n","Cual sabor desea comprar");        
        String bebida=teclado.nextLine();
        pedido.setBebida(bebida);
        System.out.format("%-70s %n","----------------------------------------");
        System.out.format("%s %n","Los tamaños que manejos son: \n Chico = 40 Mediano = 47 Refill = 35");
        System.out.format("%s %n","Cual tamaño");
        String tamaño=teclado.nextLine();
        pedido.setTamaño(tamaño);
        teclado.nextLine();
        System.out.format("%25s %10s %n","Ingrese la cantida de productos a llevar de ",bebida);
        int cantidad=teclado.nextInt();
        pedido.setCantidad(cantidad);
        if(tamaño.equalsIgnoreCase("Chico") || tamaño.equalsIgnoreCase("chico")){
        compras=((cantidad*40));
//        acum=acum+compras;
//        total=acum;
        } 
        else if(tamaño.equalsIgnoreCase("Mediano") || tamaño.equalsIgnoreCase("mediano")){
        compras=((cantidad*47));
//        acumUno=acumUno+compras;
//        totalUno=acumUno;
        }
        else if(tamaño.equalsIgnoreCase("Refill") || tamaño.equalsIgnoreCase("refill")){
        compras=((cantidad*30));
//        acumDos=acumDos+compras;
//        totalDos=acumDos;
        } 
        System.out.format("-%35s %n","----------------------------------------");
        System.out.format("%35s %10s %20s %20s  %n","Usted ha ordenado una bebida de:",pedido.getBebida()," \n y una cantidad de:",pedido.getCantidad());
        System.out.format("%70s %n","----------------------------------------------------------------------"); 
        
        pago=pago+(compras*16/100)+compras; 
        System.out.format("%s %n","Desea Facturar");
        teclado.nextLine();
        String facturar=teclado.nextLine();
        if (facturar.equalsIgnoreCase("Si")|| facturar.equalsIgnoreCase("Si")){        
        Calendar c1 = GregorianCalendar.getInstance();
        System.out.format("%s %n","----------------------------------------------------------------------");        
        System.out.format("%s %s %n","Nombre del cliente: ",pedido.getNombre()); 
        System.out.format("%s %s %n","Bebida: ",bebida);   
        System.out.format("%s %d %n","Una Cantidad de",cantidad); 
        System.out.format("%s %s %n","Una Cantidad de",tamaño);     
        System.out.format("%s %n","Fecha actual: "+c1.getTime().toLocaleString());
        System.out.format("%s %n","----------------------------------------------------------------------");
        System.out.format("%-20s %12.2f %n","El subtotal es: ",compras);
        System.out.format("%s %.2f %n","El iva es:  ",(compras*16/100)); 
        System.out.format("%s %.2f %n","El total a pagar es de:  ",((compras*16/100)+compras)); 
        System.out.format("%70s %n","----------------------------------------------------------------------");
        System.out.format("%49s %n ","Muchas gracias por su compra \n Esperamos que vuelva pronto");     
        System.out.format("%70s %n","----------------------------------------------------------------------"); 
        }
        
        System.out.format("%s %n","Desea comprar algo mas");
        teclado.nextLine();
        String compra=teclado.nextLine();
        pedido.setCompra(compra);
        acum=acum+compras;

        
        }
        while(pedido.getCompra().equalsIgnoreCase("Si") || pedido.getCompra().equalsIgnoreCase("Si"));
        finDia=finDia+acum;
        
        System.out.format("%s %n","Desea realizar otra ventaa");
        String orders=teclado.nextLine();
        pedido.setOrders(orders);
        }
        while(pedido.getOrders().equalsIgnoreCase("Si") || pedido.getOrders().equalsIgnoreCase("Si"));
      
        pedido.setCorte(pago);
        
        System.out.format("%70s %n","----------------------------------------------------------------------");
        System.out.format("%s %.2f %n","El toatl de las ventas del dia fue de: ",pedido.getCorte());
        System.out.format("%70s %n","----------------------------------------------------------------------");
        
    
        
        
        
        
    }    
}
     
        
        
//        
//        do{
//        System.out.format("%19s %n","Bienvenido a Los Alamos Cafe"); 
//        System.out.format("%s %n","------------------------------------------");
//        System.out.format("%s %n","Ingresa porfavor tu nombre");
//        String nombre=teclado.nextLine();
//        pedido.setNombre(nombre);
//        System.out.format("%-70s %n","------------------------------------------");
//        System.out.format("%-70s %n","Muchas gracias por estar aqui: "+pedido.getNombre());
//        System.out.format("%-70s %n","------------------------------------------"); 
//        
//        do{
//       
//        System.out.format("%-49s %n","El menu es: \n Caramelo Cajeta Mapcha Chai");
//        System.out.format("%s %n","------------------------------------------");
//        System.out.format("%-20s %n","Cual sabor desea comprar");        
//        String bebida=teclado.nextLine();  
//        System.out.format("%-70s %n","----------------------------------------");
//        System.out.format("%s %n","Los tamaños que manejos son: \n Chico = 40 Mediano = 47 Refill = 35");
//        System.out.format("%s %n","Cual tamaño");
//        String tamaño=teclado.nextLine();
//        teclado.nextLine();
//        System.out.format("%25s %10s %n","Ingrese la cantida de productos a llevar de ",bebida);
//        int cantidad=teclado.nextInt();
//
//        if(tamaño.equalsIgnoreCase("Chico") || tamaño.equalsIgnoreCase("chico")){
//        compras=((cantidad*40));
////        acum=acum+compras;
////        total=acum;
//        } 
//        else if(tamaño.equalsIgnoreCase("Mediano") || tamaño.equalsIgnoreCase("mediano")){
//        compras=((cantidad*47));
////        acumUno=acumUno+compras;
////        totalUno=acumUno;
//        }
//        else if(tamaño.equalsIgnoreCase("Refill") || tamaño.equalsIgnoreCase("refill")){
//        compras=((cantidad*30));
////        acumDos=acumDos+compras;
////        totalDos=acumDos;
//        }
//             
////        fin=fin+(total+totalUno+totalDos);    
//        System.out.format("-%35s %n","----------------------------------------");
//        System.out.format("%35s %10s %20s %20s  %n","Usted ha ordenado una bebnida de:",bebida," \n y una cantidad de:",cantidad);
//        System.out.format("%70s %n","----------------------------------------------------------------------"); 
//        teclado.nextLine();
//        
//        System.out.format("%s %n","Desea comprar algo mas");
//        String compra=teclado.nextLine();
//        pedido.setCompra(compra);
//        
//        }
//        while(pedido.getCompra().equalsIgnoreCase("Si") || pedido.getCompra().equalsIgnoreCase("Si"));
//    
//        Calendar c1 = GregorianCalendar.getInstance();
//        System.out.format("%s %n","----------------------------------------------------------------------");
//        System.out.format("%s %n","Fecha actual: "+c1.getTime().toLocaleString());
//        System.out.format("%s %n","----------------------------------------------------------------------");
//        System.out.format("%s %f %n","El subtotal es: ",());
//        System.out.format("%s %.2f %n","El iva es:  ",(*16/100)); 
//        System.out.format("%s %.2f %n","El total a pagar es de:  ",((*16/100)+)); 
//        System.out.format("%70s %n","----------------------------------------------------------------------");
//        System.out.format("%49s %n ","Muchas gracias por su compra \n Esperamos que vuelva pronto");     
//        System.out.format("%70s %n","----------------------------------------------------------------------"); 
//    
//        System.out.format("%s %n","Desea realizar otra ventaa");
//        String orders=teclado.nextLine();
//        pedido.setOrders(orders);
//        }
//        while(pedido.getOrders().equalsIgnoreCase("Si") || pedido.getOrders().equalsIgnoreCase("Si"));
//        float corte=finDia;
//        cut.setCorte(corte);
//        
//        System.out.format("%70s %n","----------------------------------------------------------------------");
//        System.out.format("%s %.2f %n","El toatl de las ventas del dia fue de: ",cut.getCorte());
//        System.out.format("%70s %n","----------------------------------------------------------------------");
//        
//    
//        
//        
//        
//        
        
