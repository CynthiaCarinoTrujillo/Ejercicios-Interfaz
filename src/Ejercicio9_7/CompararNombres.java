
package Ejercicio9_7;
import java.util.Comparator;

/**
 *
 * @author cyn
 */
public class CompararNombres implements Comparator{

    @Override
    public int compare(Object t, Object t1) {
        int resultado=0;
        //convierte a los objetos en socios
        Socio socio1=(Socio)t;
        Socio socio2=(Socio)t1;
        resultado=socio1.name.compareToIgnoreCase(socio2.name);
        return resultado;
    }

    @Override
    public Comparator reversed() {
        return Comparator.super.reversed(); 
    }
    
}
