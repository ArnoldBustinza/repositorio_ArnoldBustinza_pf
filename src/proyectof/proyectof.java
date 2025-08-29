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
        double tc,compra1,compra2,compra3,pc,dc,tp;
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
        dc=tc*0.05;
        tp=tc-dc;
        pc=Math.round(tp/3*10.0)/10.0;
        //salida
        System.out.println("El monto previo de las compras de "+cliente+" es de: "+tc);
        System.out.println("En descuento es de: "+dc);
        System.out.println("En monto a pagar: "+tp);
        System.out.println("En promedio las compras suman un total de: "+pc);
               
    }
    
}
