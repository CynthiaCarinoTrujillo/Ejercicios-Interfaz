package ejercicio12_2;

import java.util.Arrays;

/**
 *
 * @author cyn
 */
public class Contenedor<T> {

    //array de T
    private T array[];

    public Contenedor() {
        this.array = (T[]) new Object[0];
        //inicializa un array de genericos, el new objeto hace casting con el array de tipo T
        //this.array=null;
    }

    void insertarAlInicio(T nuevo) {
        // modificar longitud para insertar un nuevo elemento
        T arraycopia[] = Arrays.copyOf(array, array.length + 1);
        // hacer hueco en el indice 0
        System.arraycopy(array, 0, arraycopia, 1, array.length);
        arraycopia[0] = nuevo;

        array = Arrays.copyOf(arraycopia, arraycopia.length);
    }

    void insertarAlFinal(T nuevo) {
        // Crear una nueva copia del array con una longitud mayor 
        T arraycopia[] = Arrays.copyOf(array, array.length + 1);

        // Insertar el nuevo elemento al final
        arraycopia[array.length] = nuevo;

        array = Arrays.copyOf(arraycopia, arraycopia.length);
    }

    void eliminarAlInicio() {
        //comprobar que el array no este vacio, si la longitud es 0 esta vacio
        if (array.length == 0) {
            System.out.println("Array vacio");
        } else {
            //crear una nueva copia del array que comienza desde el índice 1 y termina en el índice array.length
            T arraycopia[] = Arrays.copyOfRange(array, 1, array.length);
            array = Arrays.copyOf(arraycopia, arraycopia.length);
        }
    }

    void eliminarDelFinal() {
        if (array.length == 0) {
            System.out.println("Array vacío");
        } else {
            array= Arrays.copyOf(array, array.length - 1);
        }
    }
    
    void ordenar(){
        
    }

    @Override
    public String toString() {
        return "Contenedor{" + "array=" + array + '}';
    }

}
