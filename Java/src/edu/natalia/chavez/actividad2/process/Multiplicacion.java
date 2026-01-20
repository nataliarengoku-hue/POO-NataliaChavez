package edu.natalia.chavez.actividad2.process;
/**
 * En esta clase se van a multiplicar dos numeros usando sumas repetidas
 */

public class Multiplicacion {
    /**
     * Se multiplica op1 por op2 usando un ciclo y sumas
     * @param op1 primer operando
     * @param op2 segundo operando
     * @return resultado de la multiplicacion
     */
    public static int realizarOperacion(int op1, int op2){
        int resultado = 0;
        for(int i=0; i<op2; i++){
            resultado = Suma.realizarOperacion(resultado, op1);
        }
        return resultado;
    }
}
