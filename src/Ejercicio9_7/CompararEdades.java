
package Ejercicio9_7;
import java.util.Comparator;
/**
 *
 * @author cyn
 */
public class CompararEdades implements Comparator{
  
    @Override
    public int compare(Object o1, Object o2) {
        int resultado=0;
        //CONVERTIR OBJECT A SOCIO
        Socio uno=(Socio)o1;
        Socio dos=(Socio)o2;
        resultado=uno.edadSocio()-dos.edadSocio();
        return resultado;
    }
    
}
