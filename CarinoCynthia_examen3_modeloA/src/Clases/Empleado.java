
package Clases;
import Interfaces.Trabajador;

/**
 *
 * @author cynthia.cartru
 */
public abstract class Empleado implements Trabajador, Comparable{
    
    protected String nombre;
    protected double salarioBase;

    public Empleado(String nombre, double salarioBase) {
        this.nombre = nombre;
        this.salarioBase = salarioBase;
    }
    
    @Override
    public double CalcularSalario() {
        return salarioBase;
    }

    public String getNombre() {
        return nombre;
    }
    
    @Override
    public int compareTo(Object o){
        int resultado=0;
        Empleado uno=(Empleado)o;
        resultado=nombre.compareToIgnoreCase(uno.nombre);
        return resultado;
    }
}
