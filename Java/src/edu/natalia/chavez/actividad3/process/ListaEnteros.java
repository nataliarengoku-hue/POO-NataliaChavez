package edu.natalia.chavez.actividad3.process;

import java.util.*;
public class ListaEnteros {
    //Aqui van a ir los metodos que reciban una lista de números enteros como parámetro
    /**
     * Se recorren todos los ceros de una lista hacia la derecha
     * @param numeros Lista de enteros que contiene los numeros junto con ceros
     * @return Nueva lista que tiene los ceros al final
     */
    public static List<Integer> moverCerosDerecha(List<Integer> numeros) {
        List<Integer> resultado = new ArrayList<>(); //lista donde se guaradaran los numeros que no sean cero
        int contadorDeCeros = 0;
        for (int n : numeros) {
            if (n != 0) {
                resultado.add(n);
            } else {
                contadorDeCeros++;
            }
        }
        for (int i = 0; i < contadorDeCeros; i++) resultado.add(0);
        return resultado;
    }

    /**
     * Se cuenta la cantidad de numeros pares
     * @param numeros Lista de enteros
     * @return Cantidad de pares encontrados
     */
    public static int contarPares(List <Integer> numeros) {
        int contador = 0;
        for (int n : numeros) if (n % 2 == 0) contador++;
        return contador;
    }
}
