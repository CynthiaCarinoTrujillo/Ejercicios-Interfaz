package ejercicio12_17;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/**
 *
 * @author cynthia.cartru
 */
public class Cola<T> {

    //arraylist de tipo generico
    private List<T> arrayCola = new ArrayList<>();

    public Cola() {
    }

    void encolar(T valor) {
        //metodo que almacenara un dato de tipo generico desde al final al inicio
        arrayCola.add(valor);
    }

    T desencolar() {
        //metodo que extraera un elemento del arraylist
        //se elimina el primer elemento que entro (de inicia a fin)
        //verificar si esta vacia
        boolean vacia = arrayCola.isEmpty();
        //si el array tiene elementos devuelve false
        if (vacia == false) {
            Iterator<T> it = arrayCola.iterator(); //recorrera el array de tipo generico
        }
        T t = null;

        return t;
    }

    @Override
    public String toString() {
        return "{" + arrayCola + '}';
    }

}
