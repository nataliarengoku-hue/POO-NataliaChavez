package edu.natalia.chavez.actividad2.process;
/**
 * En esta clase se calcula el logaritmo de un numero usando divisiones repetidas
 */
public class Logaritmo {
    /**
     * Calcula el logaritmo de op1 en base op2.
     * @param op1 argumento
     * @param op2 base
     * @return resultado del logaritmo entero
     */
    public static int realizarOperacion(int op1, int op2){
        if(op2 <= 1) throw new ArithmeticException("La base debe ser mayor que 1");
        if(op1 <= 0) throw new ArithmeticException("El argumento debe ser mayor que 0");
        
        int logaritmo = 0;
        // Mientras op1 sea mayor o igual a la base, se puede seguir dividiendo
        while(op1 >= op2){
            op1 = Division.realizarOperacion(op1, op2);
            logaritmo = Suma.realizarOperacion(logaritmo, 1);
        }
        return logaritmo;
    }
}
