import java.util.Scanner;

public class PotenciaElectrica {

    public static void main(String[] args) {
        
        Scanner teclado = new Scanner(System.in);
        
        float potencia,voltaje,intensidad,resistencia=4;
        
        System.out.println("Dime la intensidad electrica;");
                intensidad = teclado.nextFloat();
                
                voltaje = resistencia * intensidad ;
                potencia = voltaje * intensidad ;
                
                System.out.println("El valor de la potencia electrica del circuito es :"+ potencia);
                
        
    }
    
}
