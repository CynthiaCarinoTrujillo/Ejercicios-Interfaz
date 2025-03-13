
package Par;

import java.util.Arrays;

/**
 *
 * @author cynthia.cartru
 */
public class Metodoprincipal {

    public static void main(String[] args) {

        Integer parametrouno = 3;
        Double parametrodos = 2.4;
        //instanciar la clase Par
        Par<Integer, Double> par1 = new Par<>(parametrouno, parametrodos);
        Par<String, Float> par2 = new Par<>("Cynthia", 45.33f);
        System.out.println("Objeto PAR1 Integer y Double--------------");
        System.out.println("Valores" + par1.toString());
        System.out.println("Objeto PAR2 String y Float---------------");
        System.out.println("Valores" + par2.toString());

        //Array e insercion
        String cad1 = "Juan";
        String cad2 = "Carlos";
        String cad3 = "Joaquin";
        String array[] = {cad1, cad2};
        String nuevoarray[] = Par.insercion(array, cad3);
        //imprimir el nuevo array
        System.out.println("Nueva tabla" + Arrays.toString(nuevoarray));

        //metodo concatenacion
        String array3[] = {"45", "79"};  
        System.out.println("Metodo con 2 tablas"+ Arrays.toString(Par.tablasConcatenadas(nuevoarray,array3)));
        

    }
}
