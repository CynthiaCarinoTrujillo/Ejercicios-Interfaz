
package Act12_5;

import java.time.LocalDate;
import java.time.temporal.ChronoUnit;

/**
 *
 * @author cyn
 */
public class Cliente implements Comparable<Cliente>{
    
    String nombreCliente;
    String dniCliente;
    LocalDate fechaNacimiento;

    public Cliente(String nombreCliente, String dniCliente, LocalDate fechaNacimiento) {
        this.nombreCliente = nombreCliente;
        this.dniCliente = dniCliente;
        this.fechaNacimiento = fechaNacimiento;
    }
    
    public int getEdad(){
        LocalDate hoy=LocalDate.now();
        int edadCliente= (int) ChronoUnit.YEARS.between(fechaNacimiento,hoy);
        return edadCliente;
    }

    @Override
    public String toString() {
        return "Cliente{" + "nombreCliente=" + nombreCliente + ", dniCliente=" + dniCliente + '}';
    }

    @Override
    public int compareTo(Cliente t) {
        return dniCliente.compareTo(t.dniCliente);
    }


   
    
    
}
