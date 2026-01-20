package edu.natalia.chavez.actividad2.process;
/**
 * Esta clase calcula el residuo de una division usando restas repetidas
 */
public class Modulo {
    /**
     * Obtiene el residuo de dividir op1 entre op2
     * @param op1 dividendo
     * @param op2 divisor
     * @return residuo de la división
     * @throws ArithmeticException si el divisor es cero
     */
    public static int realizarOperacion(int op1, int op2){
        if(op2 == 0) throw new ArithmeticException("División por cero");
        int acumulado = op1;
        while(acumulado >= op2){
            acumulado = Resta.realizarOperacion(acumulado, op2);
        }
        return acumulado;
    }
}