package Ejercicio9_7;
import java.util.Arrays;
import java.time.LocalDate;

/**
 *
 * @author cyn
 */
public class Prueba {

    public static void main(String[] args) {
        //array que guardara los socios creados
        Socio listaSocios []=new Socio[3];
        
        LocalDate nacimiento = LocalDate.of(1890, 2, 20);
        Socio socio1 = new Socio(11, "Camila Rodriguez", nacimiento);

        nacimiento = LocalDate.of(1970, 3, 25);
        Socio socio2 = new Socio(22, "Bruno Mars", nacimiento);
        
        nacimiento = LocalDate.of(1700, 3, 20);
        Socio socio3 = new Socio(33, "Angela Aguilar", nacimiento);
        
        //guardamos los socios en el array
        listaSocios[0]=socio1;
        listaSocios[1]=socio2;
        listaSocios[2]=socio3;
        
        //comparar los id del socio1 y socio2
        int comparacion = socio1.compareTo(socio2);
       
        System.out.println(socio1.toString());
        System.out.println(socio2.toString());
        
        if (comparacion > 0){
            System.out.println("Socio: "+ socio1.toString() + " va despues "
                    + "que "+ socio2.toString());
        } else {
            System.out.println("Socio "+ socio2.toString() + " va despues que"
                    + socio1.toString());
        }
        
        //Arrays.sort(listaSocios);
        //System.out.println(Arrays.deepToString(listaSocios));
        
        
        //crear un objeto para comparar edades
        CompararEdades ce = new CompararEdades();
        Arrays.sort(listaSocios, ce);
        System.out.println(Arrays.deepToString(listaSocios));
        
        //crear objeto para comparar nombres
        CompararNombres comparacionNombres=new CompararNombres();
        Arrays.sort(listaSocios, comparacionNombres);
        System.out.println(Arrays.deepToString(listaSocios));
        
    }
}
