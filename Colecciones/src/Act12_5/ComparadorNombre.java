
package Act12_5;

import java.util.Comparator;

/**
 *
 * @author cyn
 */
public class ComparadorNombre implements Comparator<Cliente>{

    @Override
    public int compare(Cliente t, Cliente t1) {
        return t.nombreCliente.compareToIgnoreCase(t1.nombreCliente);
    }
    
}
