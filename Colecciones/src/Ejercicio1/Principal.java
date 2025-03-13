
package Ejercicio1;
import java.util.Arrays;

/**
 *
 * @author cynthia.cartru
 */
public class Principal {
    public static void main(String[] args) {
        //instanciar la clase con distintos tipos
        //parametros con valores T y U
        Par primerPar=new Par("Jenifer",4);
        System.out.println("valor T: "+ primerPar.getValorT()+ " valor U: "+ primerPar.getvalorU());
        
        System.out.println("---------------------------------------------------");
        primerPar=new Par(7854.5, 74);
        System.out.println("valor T: "+ primerPar.getValorT()+ " valor U: "+ primerPar.getvalorU());
        
        //crear arrays de t
       
    }
}
