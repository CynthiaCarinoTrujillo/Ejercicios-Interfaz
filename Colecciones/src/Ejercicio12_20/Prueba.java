
package Ejercicio12_20;
import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author cynthia.cartru
 */
public class Prueba {
    public static void main(String[] args) {
        Scanner entradaDatos=new Scanner(System.in);
        Supercola <Integer> arrayUno=new Supercola<>();
        Supercola <Integer> arrayDos=new Supercola<>();
        int opcion;
        Integer valor=null;
        do {
            System.out.println("MENU: Selecciona una opcion");
            System.out.println("1.Encolar en cola 1");
            System.out.println("2.Encolar en cola 2");
            System.out.println("3.Desencolar de cola 1");
            System.out.println("4.Desencolar de cola 2");
            System.out.println("5.Salir del programa");
            opcion=entradaDatos.nextInt();
            switch (opcion){
                
                case 1->{
                    System.out.println("Ingrese el valor que quiere encolar");
                    valor=entradaDatos.nextInt();
                    arrayUno.encolarColaDos(valor);
                    System.out.println("[ "+valor + " Encolado en cola 1 ]");
                    arrayUno.toString();
                }
                
                case 2->{
                    System.out.println("Ingrese el valor que quiere encolar");
                    valor=entradaDatos.nextInt();
                    arrayDos.encolarColaDos(valor);
                    System.out.println("[ "+ valor + " Encolado en cola 2 ]");
                }
                
                case 3->{
                    arrayUno.desencolarColaUno();
                    System.out.println("Desencolado de cola uno");
                }  
                
                case 4 ->{
                    arrayDos.desencolarColaDos();
                    System.out.println("Desencolado de cola dos");
                }
                
            }
            
        } while (opcion!=5);
        
    }
}
