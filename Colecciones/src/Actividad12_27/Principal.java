
package Actividad12_27;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
/**
 *
 * @author cynthia.cartru
 */
public class Principal {
    public static void main(String[] args) {
        Scanner entradaDatos=new Scanner(System.in);
        System.out.println("Ingrese una cadena de caracteres");
        String cadena=entradaDatos.nextLine().trim();
     
        //devolver una lista con los caracteres en cada elemento
        System.out.println("Lista de characteres"+ leeCadena(cadena));
    }
    
    
    public static List<Character> leeCadena(String cadena){
        List<Character> cadenaresultante=new ArrayList<>();
        
        for (int contador=0; contador < cadena.length(); contador++){
            char caracter=cadena.charAt(contador);
            cadenaresultante.add(caracter);
        }       
        return cadenaresultante;
    }
}
