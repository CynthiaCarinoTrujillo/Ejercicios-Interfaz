
package Ejercicio12_3;
import java.util.Scanner;
import java.util.Arrays;

/**
 *
 * @author cyn
 */
public class Principal {
    public static void main(String[] args) {
        
        Scanner entradaDatos = new Scanner(System.in);
        
        System.out.println("Indique el tamaño del array: ");
        int tamanio=entradaDatos.nextInt();
        
        //se crea un array de integer
        Contenedor<Integer> array1 = new Contenedor<>(new Integer[tamanio]);
        
       
        

//        // Leer números positivos hasta que el usuario ingrese -1
//        System.out.println("Ingrese números positivos (-1 para finalizar):");
//        while ((numero = scanner.nextInt()) != -1) {
//            pila.apilar(numero);
//        }

        
    }
            
}
