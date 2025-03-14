package ejercicio12_2;

import java.util.Random;
import java.util.Arrays;
/**
 *
 * @author cyn
 */
public class Principal {

    public static void main(String[] args) {
        //esta es otra forma de hacer arrays
        // Contenedor<Integer> c=new Contenedor<>(new Integer[0]);

        //llamar al constructor que genera un array de 30
        Contenedor<Integer> array1 = new Contenedor<>(new Integer[30]);
        Integer aleatorio=generaRandom();
        
//        for (Integer v: array1){
//            
//        }
        array1.insertarAlInicio(aleatorio);
        
        array1.mostrarInformacion();
        
    }

    //metodo que genera numeros enteros entre 1 y 10
    public static Integer generaRandom() {
        Random random = new Random();
        Integer generaciones = random.nextInt(11);
        return generaciones;
    }
}
