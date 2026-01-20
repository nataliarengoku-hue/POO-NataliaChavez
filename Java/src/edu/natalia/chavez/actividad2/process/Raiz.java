package edu.natalia.chavez.actividad2.process;
/**
 * Esta clase calcula la raiz cuadrada de un numero usando aproximaciones
 */

public class Raiz {
    /**
     * Se calcula la raíz cuadrada de un número positivo
     * Se usa el método de Newton para aproximarse al resultado
     * @param numero número del cual se quiere sacar la raíz
     * @return raíz cuadrada aproximada
     * @throws ArithmeticException si el número es negativo
     * En esta clase tampoco se usaran op1 ni op2 para no confundir al autor
     * @author Natalia Chavez
     */
    public static double realizarOperacion(int numero){
        if(numero < 0) throw new ArithmeticException("Número negativo");
        double aproximacion = numero / 2.0;
        for(int i=0; i<20; i++){
            aproximacion = (aproximacion + numero/aproximacion) / 2.0;
        }
        return aproximacion;
    }
}