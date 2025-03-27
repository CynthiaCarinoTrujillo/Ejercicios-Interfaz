
package ejercicio12_6;
import java.util.Collection;
import java.util.Random;
/**
 *
 * @author cynthia.cartru
 */
public class Principal {
    public static void main(String[] args) {
        Collection <Integer> array;
    }
    
    //metodo que genera numeros random
    public static Integer generarRandom(){
        Random r=new Random();
        Integer aleatorio =r.nextInt(100)+1;
        return aleatorio;
    }
}
