package proyectof;

/**
 *
 * @author Arnold Patu
 */
import java.util.Scanner;
public class proyectof {
        /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //variables
        String cliente;
        double tc,compra1,compra2,compra3,pc;
        //creando las lecturas
        Scanner lectura=new Scanner(System.in);
        //Entrada de datos
        System.out.print("Nombre del empleado: ");
        cliente=lectura.next();
        System.out.print("Ingrese el monto de la primera compra: ");
        compra1=lectura.nextDouble();
        System.out.print("Ingrese el monto de la segunda compra: ");
        compra2=lectura.nextDouble();
        System.out.print("Ingrese el monto de la tercera compra: ");
        compra3=lectura.nextDouble();
        
        //procesos
        tc=compra1+compra2+compra3;
        //le hago q me de resultado con un decimal ya q son terminos monetarios
        pc=Math.round(tc/3*10.0)/10.0;
                
        //salida
        System.out.println("El monto total de las compras de "+cliente+" es de: "+tc);
        System.out.println("En promedio las compras suman un total de: "+pc);
               
    }
    
}
