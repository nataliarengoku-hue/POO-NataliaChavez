package edu.natalia.chavez.actividad2.process;
/**
 * Esta clase calcula la potencia de un numero usando multiplicaciones repetidas
 */
public class Potencia {
    /**
     * Eleva la base a la potencia del exponente.
     * @param base número base
     * @param exponente número exponente
     * @return resultado de base^exponente
     */
    public static int realizarOperacion(int base, int exponente){
        int resultado = 1;
        for(int i=0; i<exponente; i++){
            resultado = Multiplicacion.realizarOperacion(resultado, base);
        }
        return resultado;
    }
}
