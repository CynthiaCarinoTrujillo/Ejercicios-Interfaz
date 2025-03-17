
package Clases;

/**
 *
 * @author cynthia.cartru
 */
public class Desarrollador extends Empleado{
    
    private String lenguaje;

    public Desarrollador(String nombre, double salarioBase, String lenguaje) {
        super(nombre, salarioBase);
        this.lenguaje=lenguaje;
    }
    
    @Override
    public String toString(){
        return "Nombre: "+ nombre + " Salario base: "+ salarioBase + " Lenguaje: " + lenguaje;
    }
}
