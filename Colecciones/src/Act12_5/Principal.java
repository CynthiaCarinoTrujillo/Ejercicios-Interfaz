package Act12_5;

import java.util.TreeSet;
import java.time.LocalDate;
import java.time.temporal.ChronoUnit;
import java.util.HashSet;
import java.util.Set;

/**
 *
 * @author cyn
 */
public class Principal {

    public static void main(String[] args) {

        //conjunto elementos ordenados x orden natural o comparador personalizado
        TreeSet<Cliente> conjuntoClientes = new TreeSet<>();

        //agregamos New de objeto cliente y a la vez estamos llamando al constructor
        Cliente c1 = new Cliente("Marta", "111", LocalDate.of(2005, 2, 15));
        Cliente c2 = new Cliente("Carlos", "112", LocalDate.of(2004, 3, 22));
        Cliente c3 = new Cliente("Jorge", "115", LocalDate.of(2004, 8, 10));
        conjuntoClientes.add(c1);
        conjuntoClientes.add(c2);
        conjuntoClientes.add(c3);

        System.out.println("Conjunto clientes: " + conjuntoClientes);
        
        //HASTSET
        
//        HastSet<Cliente> otroConjuntoCliente=new HastSet<>();

    }
    
    static <E> Set<E> union(Set<E> conjuntoUno, Set<E> conjuntoDos){
        Set<E> resultado=new HashSet<>(conjuntoUno);
        resultado.addAll(conjuntoDos); //se agrega conjunto dos a conjunto uno
        return resultado;
    }
    
    static <E> Set<E> interseccion(Set<E> conjuntoUno, Set<E> conjuntoDos){
        Set<E> interseccion=new HashSet<>(conjuntoUno);
        interseccion.addAll(conjuntoDos); //agregar conjunto dos a interseccion, donde esta conjunto uno
        return interseccion;
    }
    
//    static <E> TreeSet<E> (TreeSet<E> conjuntoUno, TreeSet<E> conjuntoDos){
//        
//        return null;
//        
//    }

}
