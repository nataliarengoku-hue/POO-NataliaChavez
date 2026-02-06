package edu.natalia.chavez.actividad2.process;

/**
 * En esta clase se calcula la raiz n-esima de un numero
 */
public class Raiz {
    /**
     * Calcula la raiz entera de op1 con indice op2.
     * @param op1 radicando
     * @param op2 indice de la raiz
     * @return la raiz entera
     */
    public static int realizarOperacion(int op1, int op2){
        if (op2 == 0) throw new ArithmeticException("El indice cero no esta permitido");
        int raiz = 0;
        while(true){
            int potencia = 1;
            for(int i=0; i<op2; i++){
                potencia = Multiplicacion.realizarOperacion(potencia, raiz);
            }

            if(potencia > op1){
                return Resta.realizarOperacion(raiz, 1);
            }
            if(potencia == op1){
                return raiz;
            }
            raiz = Suma.realizarOperacion(raiz, 1);
        }
    }
}
