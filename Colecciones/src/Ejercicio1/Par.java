
package Ejercicio1;

/**
 *
 * @author cynthia.cartru
 */
public class Par <T,U> implements Comparable <T>{
    
    private T valorT;
    private U valorU;
    
    public Par(T valorT, U valorU){
        this.valorT=valorT;
        this.valorU=valorU;
    }
    
    public void setvalorT(T valorT){
        this.valorT=valorT;
    }
    
    public T getValorT(){
        return valorT;
    }
    
    public void setvalorU(U valorU){
        this.valorU=valorU;
    }
    
    public U getvalorU(){
        return valorU;
    }
    
    public static <T extends Comparable<T>> boolean contiene(T array[],T valor){
        boolean resultado=false;
        //devuelve true si el array contiene el valor o false
        for (int contador=0; contador < array.length; contador++){
            if (array[contador]== valor){
                
                resultado=true;
            } 
        }
        return resultado;
    }

    @Override
    public int compareTo(T valor) {
        //recibe 1 valor tipo T a comparar
        int resultado=this.compareTo(valor);
        return resultado;
    }
    
    
}

