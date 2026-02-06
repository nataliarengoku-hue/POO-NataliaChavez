package edu.natalia.chavez.v2actividad2.process;
/**
 * En esta clase se van a dividir dos numeros enteros usando restas repetidas
 */
public class Division extends Resta {
    public int apply(int op1, int op2){
        /**
         * Divide op1 entre op2 usando restas
         * @param op1 dividendo (número que se quiere dividir)
         * @param op2 divisor (número por el que se divide)
         * @return cociente de la división
         * @throws ArithmeticException si el divisor es cero
         */
        if (op2 == 0) throw new ArithmeticException("Division por cero no esta permitida");
        int cociente = 0;
        int acumulado = op1;
        while(acumulado >= op2){
            acumulado = super.apply(acumulado, op2);
            cociente++;
        }
        return cociente;
    }
}
