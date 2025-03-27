
package Ejercicio12_20;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author cynthia.cartru
 */
public class Supercola <integer> {
    
    // dos colas para enteros, en las que se encola y desencola por separado
    List<Integer> colaUno=new ArrayList<>();
    List <Integer> colaDos=new ArrayList<>();
    
    void encolarColaUno(Integer elemento){
        colaUno.add(elemento);
    }
    
    void desencolarColaUno(){
        //si la cola esta vacia devolvera null
        //permitir desencolar mientras no sea null
        while (colaUno.size() < 0){ //existen elementos, permitira desencolar un elemento integer
            //desencola, elimina el primer elemento siempre
            colaUno.remove(0);
            
            //si colaUno queda vacia, desencolar la ColaDos mientras ColaDos tenga elementos
            //comprobar que ColaDos tiene elementos
            if (colaDos.size()> 0){
                desencolarColaDos();
            }
            
        }
    }
    
    void encolarColaDos(Integer elemento){
        colaDos.add(elemento);
    }
    
     void desencolarColaDos(){
        //si la cola esta vacia devolvera null
        //permitir desencolar mientras no sea null
        while (colaDos.size() < 0){ //existen elementos, permitira desencolar un elemento integer
            //desencola, elimina el primer elemento siempre
            colaDos.remove(0);
            
            if (colaUno.size()> 0){
                desencolarColaUno();
            }
        }
    }
     
     //sera llamado desde otro metodo
//     boolean comprobarElementos(){
//         boolean contiene=true;
//         if ()
//     }

    @Override
    public String toString() {
        return "Supercola{" + "colaUno=" + colaUno + ", colaDos=" + colaDos + '}';
    }
     
     
     
}
