
package Ejercicio12_37;

/**
 *
 * @author cyn
 */
public class Prueba {
    
    public static void main(String[] args) {
        //crear jugadores
        Jugador j1=new Jugador("Juan Carlos", "12432b","Portero",1.76);
        Jugador j2=new Jugador("Gabriel Marquez", "12432GM","Defensa", 1.80);
        Jugador j3=new Jugador("Hector Mendez", "4598HM", "Centrocampista", 1.89);
        Jugador j4=new Jugador("Joaquin Sanchez", "324JSa", "Delantero", 1.78);
        Jugador j5=new Jugador("Enrique Rodriguez", "299ERak2", "Defensa", 1.79);
        
        PlantillaEquipo.altaJugador(10, j1);
        PlantillaEquipo.altaJugador(9, j2);
        PlantillaEquipo.altaJugador(4, j3);
        PlantillaEquipo.altaJugador(1, j4);
        PlantillaEquipo.altaJugador(8, j5);
        
        PlantillaEquipo.mostrar();
        
        String posicionelegida="DEFENSA";
        String posicionelegida2="defensa";
        posicionelegida2=posicionelegida2.toUpperCase();
        PlantillaEquipo.mostrarMismaPosicion(posicionelegida2);
        
    }
}
