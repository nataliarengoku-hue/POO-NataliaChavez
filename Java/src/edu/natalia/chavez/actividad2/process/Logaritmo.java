package edu.natalia.chavez.actividad2.process;
/**
 * En esta clase se calcula el logaritmo base 10 de un numero usando series matematicas
 */
public class Logaritmo {
    /**
     * Se calcula el logaritmo base 10 de un número positivo
     * @param numero número del cual se quiere el logaritmo
     * @return logaritmo base 10 aproximado
     * @throws ArithmeticException si el número es menor o igual a cero
     * En esta clase tampoco se usaran op1 y op2
     */
    public static double realizarOperacion(int numero){
        if(numero <= 0) throw new ArithmeticException("Número inválido para el logaritmo");
        double resultado = 0.0;
        double x = (numero - 1.0) / (numero + 1.0);
        for(int i=1; i<50; i+=2){
            resultado += (1.0/i) * Math.pow(x, i);
        }
        return 2 * resultado / Math.log(10); // log base 10
    }
}