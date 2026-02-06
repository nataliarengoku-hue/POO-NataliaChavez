package edu.natalia.chavez.v2actividad2.process;
/**
 * En esta clase se van a multiplicar dos numeros usando sumas repetidas
 */

public class Multiplicacion extends Suma {
    /**
     * Se multiplica op1 por op2 usando un ciclo y sumas
     * @param a primer operando
     * @param b segundo operando
     * @return resultado de la multiplicacion
     */
    @Override
    public int apply(int a, int b){
        int producto = 0;
        for(int i=0;i<b;i++){
            producto = super.apply(producto, a);
        }
        return producto;
    }
}
