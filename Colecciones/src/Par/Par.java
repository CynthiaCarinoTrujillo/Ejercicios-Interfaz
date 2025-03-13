
package Par;
import java.util.Arrays;
import java.util.ArrayList;

/**
 *
 * @author cynthia.cartru
 */
public class Par <T,U> {
    private T valorT;
    private U valorU;

    public Par(T valorT, U valorU) {
        this.valorT = valorT;
        this.valorU = valorU;
    }
    
    public Par(U valorU){
        this.valorU=valorU;
    }
    public T getValorT() {
        return valorT;
    }

    public void setValorT(T valorT) {
        this.valorT = valorT;
    }

    public U getValorU() {
        return valorU;
    }

    public void setValorU(U valorU) {
        this.valorU = valorU;
    }

    @Override
    public String toString() {
        return "Par{" + "valor T= " + valorT + ", valor U= " + valorU + '}';
    }
    
    //metodo generico que trabaja con U (u es de tipo generico y puede ser muchos tipos de datos)
    //se esta recibiendo un valor de tipo U y una tabla de tipo U
    //el metodo devuelve una tabla de tipo U. Y se insertan los valores al final
    public static <U> U[] insercion(U tabla[], U valor ){
        //Crear una nueva tabla y aumentar su longitud
        U tablanueva[]=Arrays.copyOf(tabla, tabla.length+1);
        tablanueva[tablanueva.length-1]=valor;
        return tablanueva;
    }    
    
    //metodo que recibe 2 tablas y revuelve una con la combinacion de las 2
    public static <U> U[] tablasConcatenadas(U tabla1[], U tabla2[]){
        //crear la nueva tabla con las longitudes de las 2 tablas
        int sumalongitud=tabla1.length+tabla2.length;
        //copiar los valores de la primera tabla y luego la segunda
        U tablanueva[]=Arrays.copyOf(tabla1, sumalongitud);
        //copiar la segunda tabla2
        System.arraycopy(tabla2, 0, tablanueva, tabla1.length, sumalongitud - tabla1.length);    
        return tablanueva;
    }
    
}
