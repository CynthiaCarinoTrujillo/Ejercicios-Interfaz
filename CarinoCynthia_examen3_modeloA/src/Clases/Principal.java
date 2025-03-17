package Clases;
import java.util.Arrays;
/**
 *
 * @author cynthia.cartru
 */
public class Principal {

    public static void main(String[] args) {

        Empleado arrayEmpleados[] = new Empleado[5];
        arrayEmpleados[0] = new Desarrollador("Carlos", 2000, "Java");
        arrayEmpleados[1] = new Desarrollador("Luisa", 2300, "Python");
        arrayEmpleados[2] = new Gerente("Ana", 3000, 500);
        arrayEmpleados[3] = new Desarrollador("Lola", 2200, "Java");
        arrayEmpleados[4] = new Gerente("Pedro", 3000, 300);

        System.out.println("***Lista de empleados original***");
        for (Empleado valor: arrayEmpleados){
            System.out.println(valor.toString());
        }
        
        System.out.println("Lista de empleados ordenados por nombre: ");
        Arrays.sort(arrayEmpleados);
        for (Empleado valor: arrayEmpleados){
            System.out.println(valor.toString());
        }
        
    }
}
