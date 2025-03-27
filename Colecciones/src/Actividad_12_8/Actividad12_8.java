
package Actividad_12_8;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Random;

/**
 *
 * @author cynthia.cartru
 */
public class Actividad12_8 {
    
    public static void main(String[] args) {
        Random r=new Random();
        //se insertaran 20 numeros aleatorios en una coleccoin
        Collection <Integer> listaNum=new ArrayList<>();
        
        //agregar random a la lista
        for(int i=0; i < 20; i++){
            Integer aleatorio=r.nextInt(100);
            listaNum.add(aleatorio);
        }
        
        //imprimir lista con aleatorios
        System.out.println("Lista de aleatorios"+ listaNum);
        
        System.out.println("------------------------------------------");
        //convertir la coleccion a tabla
        Integer tabla[]= listaNum.toArray(new Integer[0]);
        Arrays.sort(tabla);
        System.out.println(Arrays.toString(tabla));
        //ordenar el array de menor a mayor
    }
}
