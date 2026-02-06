package edu.natalia.chavez.v2actividad2.process;

public class Suma extends Operacion{
    /**
     * Este metodo recibe dos operandos enteros y devuelve su suma
     * @return la suma de op1 y op2
     * @param a primer operando
     * @param b segundo operando
     *
     **/
    @Override
    public int apply(int a, int b){
        return a+b;
    }
}
