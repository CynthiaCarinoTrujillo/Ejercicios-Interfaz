package Actividad12_4;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.Scanner;

/**
 *
 * @author cynthia.cartru
 */
public class actividad12_4 {

    public static void main(String[] args) {
        //importar arraylist,collection,iterator
        Collection<Integer> arrayUno = new ArrayList<>();
        Scanner entradaDatos = new Scanner(System.in);
        
        Integer valores = 0;
        while (valores != -1) {
            
            System.out.println("Introduzca un numero entero positivo: ");
            //cada dato introducido se almacenara en el array mientras sea positivo
            valores = entradaDatos.nextInt();
            if (valores > -1) {
                //se guarda en el arrayUno, el dato que es int se convierte a Integer
                arrayUno.add((Integer) valores);
            } else {
                System.out.println("Ha introducido -1");
                System.out.println("El resultado es: " + arrayUno.toString());
                System.out.println("----------------------------------------");
                System.out.println("Numeros pares en el array");
                for (Integer elemento: arrayUno){
                    if (elemento % 2 ==0){
                        System.out.println(elemento);
                    }
                }
                
                //invocar a un iterator desde la coleccion
                Iterator<Integer> i=arrayUno.iterator();
                //recorrer el array de la coleccion
                for (;i.hasNext();){
                    Integer elemento=i.next();
                    if (elemento % 3 == 0){
                        i.remove(); //eliminar el valor que no e
                    }                    
                    
                }
                
                System.out.println("--------------------------------");
                System.out.println("Array sin numeros multiplos de 3");
                System.out.println(arrayUno);
            }

        }//fin de while

    }

}
