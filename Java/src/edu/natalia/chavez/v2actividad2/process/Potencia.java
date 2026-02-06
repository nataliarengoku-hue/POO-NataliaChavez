package edu.natalia.chavez.v2actividad2.process;
/**
 * Esta clase calcula la potencia de un numero usando multiplicaciones repetidas
 */
public class Potencia extends Multiplicacion{
    /**
     * Eleva la base a la potencia del exponente.
     * @param a número base
     * @param b número exponente
     * @return resultado de base^exponente
     */
    @Override
    public int apply(int a, int b){
        int potencia = 1;
        for(int i=0;i<b;i++){
            potencia = super.apply(potencia, a);
        }
        return potencia;
    }
}
