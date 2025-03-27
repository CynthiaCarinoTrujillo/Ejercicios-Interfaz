
package ejercicio12;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author cynthia.cartru
 */
public class Cola <T> {
    
    List <T> array=new ArrayList<>();
    
    //implementar metodo encolar
    void encolar(T elemento){
        array.add(elemento);
    }    
    
    //metodo desencolar
    void desencolar(){
        //eliminamos el primer elemento del array
        array.remove(0);
    }
    
    //metodo toString

    @Override
    public String toString() {
        return "Array{" + array + '}';
    }
    
}
