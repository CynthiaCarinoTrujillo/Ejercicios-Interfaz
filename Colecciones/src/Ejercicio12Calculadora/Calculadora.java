
package Ejercicio12Calculadora;

/**
 *
 * @author cynthia.cartru
 */
public class Calculadora <N extends Number> {
    
    //operaciones con num1 y num2
    private N num1;
    private N num2;

    public Calculadora(N num1, N num2) {
        this.num1 = num1;
        this.num2 = num2;
    }
    
    public double sumar(N num1, N num2){
        //num 1 y num2 son objetos que debemos convertir
        return num1.doubleValue()+num2.doubleValue();
    }
    
    public double restar(N num1, N num2){
        return num1.doubleValue()-num2.doubleValue();
    }
    
    public double multiplicar(N num1, N num2){
        if (num1.doubleValue() == 0 | num2.doubleValue() ==0){
            System.out.println("Uno de los numeros es 0"); 
        }             
            return num1.doubleValue() * num2.doubleValue();
    }
    
    public double dividir (N num1, N num2){
        if (num1.doubleValue() == 0 | num2.doubleValue() ==0){
            System.out.println("Uno de los numeros es 0"); 
        } 
        return num1.doubleValue()/num2.doubleValue();
    }
    
}
