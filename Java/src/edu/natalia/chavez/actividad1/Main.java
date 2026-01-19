package edu.natalia.chavez.actividad1;

import edu.natalia.chavez.actividad1.ui.CLI;

/**
 * Clase principal de la aplicación de venta de vehículos Toyota.
 * Esta clase inicializa la interfaz de línea de comandos (CLI) para 
 * permitir al usuario comprar vehículos.
 * 
 * @author Natalia Chavez
 * @version 1.0
 */
public class Main {
    /**
     * Método principal que inicia la aplicación.
     * 
     * @param args argumentos de línea de comandos (no utilizados)
     */
    public static void main(String[] args) {
        CLI cli = new CLI();
        cli.start();
    }
}
