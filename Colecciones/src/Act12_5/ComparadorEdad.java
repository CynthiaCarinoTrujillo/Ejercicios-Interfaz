
package Act12_5;

import java.util.Comparator;

/**
 *
 * @author cyn
 */
public class ComparadorEdad implements Comparator<Cliente> {

    
    @Override
    public int compare(Cliente c1, Cliente c2) {
        //comparar por edad
        int comparacionEdad = Integer.compare(c1.getEdad(),c2.getEdad());
        //en caso de que las edades sean iguales, ordenamos por nombre
        if (comparacionEdad == 0) {
            return c1.nombreCliente.compareToIgnoreCase(c2.nombreCliente);
        }
        return comparacionEdad;
    }
    
}
