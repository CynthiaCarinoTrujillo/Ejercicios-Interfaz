
package Ejercicio9_7;
import java.time.LocalDate;
import java.time.temporal.ChronoUnit;
/**
 *
 * @author cyn
 */
public class Socio implements Comparable {
    int id;
    String name;
    private LocalDate fechNac;

    //constructor
    public Socio(int id, String name, LocalDate fecha) {
        this.id = id;
        this.name = name;
        this.fechNac = fecha;
    }
    
    //compareTO implementado para comparar los id
    @Override
    public int compareTo(Object o) {
        int resultado = 0;
        //convertir objeto a tipo socio
        Socio otro = (Socio) o;
        if (id < otro.id) {
            resultado = -1;
        } else if (id > otro.id) {
            resultado = 1;
        } else {
            resultado = 0;
        }
        return resultado;
    }
    
    
    /* compare TO implementado para comparar los nombres
    @Override
    public int compareTo(Object objeto) {
        //convertir el objeto a clase Socio
        Socio otro = (Socio) objeto;
        return nombre.compareTo(otro.nombre);
    }*/
    
    //metodo que devuelve la edad
    public int edadSocio(){
        int edad=(int)fechNac.until(LocalDate.now(),ChronoUnit.YEARS);
        return edad;
    }
    
    @Override
    public String toString() {
        String cadena = "Nombre de socio: " + name + " ID: " + id + " Fecha de nacimiento: " + fechNac;
        return cadena;
    }

    public LocalDate getFechNac() {
        return fechNac;
    }

    public void setFechNac(LocalDate fechNac) {
        this.fechNac = fechNac;
    }
    
}
