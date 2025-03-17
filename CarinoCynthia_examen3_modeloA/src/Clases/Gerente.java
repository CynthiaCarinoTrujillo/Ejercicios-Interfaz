
package Clases;

/**
 *
 * @author cynthia.cartru
 */
public class Gerente extends Empleado{
    
    private double bono;
    
    public Gerente(String nombre, double salarioBase, double bono) {
        super(nombre, salarioBase);
        this.bono=bono;
    }
    
    @Override
    public double CalcularSalario() {
        return salarioBase+bono;
    }
    
    @Override
    public String toString(){
        return "Nombre: "+ nombre + " Salario base: "+ salarioBase + " Bono: " + bono;
    }
    
       
}
