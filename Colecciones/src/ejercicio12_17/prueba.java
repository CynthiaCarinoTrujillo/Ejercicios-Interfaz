package ejercicio12_17;

import java.util.Scanner;

/**
 *
 * @author cynthia.cartru
 */
public class prueba {

    public static void main(String[] args) {
        Scanner entradaDatos = new Scanner(System.in);
        //crear objeto COla
        Cola<Integer> arrayCola = new Cola();

        for (int contador = 0; contador < 4; contador++) {
            System.out.println("Ingrese un numero para almacenar:");
            Integer num = entradaDatos.nextInt();
            arrayCola.encolar(num);
            System.out.println("Dato agregado correctamente");
        }

        System.out.println("resultado " + arrayCola.toString());
        
        //desencolar
    }
}
