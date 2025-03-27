package Ejercicio12_3;

/**
 *
 * @author cyn
 */
public class Contenedor<T, N> implements Pila<T, N> {

    private N array[];
    private int contador; //controla si el array esta lleno y la posicion donde se deben insertar los elementos
    private int longitud =0;

    public Contenedor(N[] array) {
        this.array = (N[]) new Object[longitud];
        this.contador = 0;
    }

    @Override
    public void apilar(N elemento) {
        //verificar el tamaño
        if (contador == longitud) {
            System.out.println("La pila se ha llenado");
        }
        array[contador] = elemento; //en un inicio, el elemento se insertara en la posicion 0, despues ira en aumenta
        contador++;
    }

    @Override
    public N desapilar() {
        //si el contador es menos qu la longitud, tiene espacio 
        if (contador <= longitud) {
            contador--; //reduce "la longitud" por ejemplo si antes era longitud de 2, ahora sera de 1
        }
        return array[contador];  //devolvera un array con longitud mas pequeña

    }

}
