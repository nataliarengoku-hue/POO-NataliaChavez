package edu.natalia.chavez.actividad2.ui;

import java.util.Scanner;
import edu.natalia.chavez.actividad2.process.*;

public class CLI {
    /**
     * Muestra el menú de opciones y ejecuta la operación elegida por el usuario.
     */
    public static void showMenu(){
        Scanner scanner = new Scanner(System.in);
        int opcion;
        do {
            System.out.println("\nElige una opcion");
            System.out.println("1. Sumar");
            System.out.println("2. Restar");
            System.out.println("3. Multiplicar");
            System.out.println("4. Dividir");
            System.out.println("5. Módulo");
            System.out.println("6. Potencia");
            System.out.println("7. Raíz cuadrada");
            System.out.println("8. Logaritmo base 10");
            System.out.println("9. Salir");
            opcion = scanner.nextInt();

            int op1=0, op2=0;

            switch (opcion) {
                case 1:
                    System.out.println("Ingresa el primer operando:");
                    op1 = scanner.nextInt();
                    System.out.println("Introduce el segundo operando:");
                    op2 = scanner.nextInt();
                    System.out.printf("Resultado: %d\n", Suma.realizarOperacion(op1,op2));
                    break;
                case 2:
                    System.out.println("Ingresa el primer operando:");
                    op1 = scanner.nextInt();
                    System.out.println("Introduce el segundo operando:");
                    op2 = scanner.nextInt();
                    System.out.printf("Resultado: %d\n", Resta.realizarOperacion(op1,op2));
                    break;
                case 3:
                    System.out.println("Ingresa el primer operando:");
                    op1 = scanner.nextInt();
                    System.out.println("Introduce el segundo operando:");
                    op2 = scanner.nextInt();
                    System.out.printf("Resultado: %d\n", Multiplicacion.realizarOperacion(op1,op2));
                    break;
                case 4:
                    System.out.println("Ingresa el dividendo:");
                    op1 = scanner.nextInt();
                    System.out.println("Introduce el divisor:");
                    op2 = scanner.nextInt();
                    System.out.printf("Resultado: %d\n", Division.realizarOperacion(op1,op2));
                    break;
                case 5:
                    System.out.println("Ingresa el dividendo:");
                    op1 = scanner.nextInt();
                    System.out.println("Introduce el divisor:");
                    op2 = scanner.nextInt();
                    System.out.printf("Resultado: %d\n", Modulo.realizarOperacion(op1,op2));
                    break;
                case 6:
                    System.out.println("Ingresa la base:");
                    op1 = scanner.nextInt();
                    System.out.println("Introduce el exponente:");
                    op2 = scanner.nextInt();
                    System.out.printf("Resultado: %d\n", Potencia.realizarOperacion(op1,op2));
                    break;
                case 7:
                    System.out.println("Ingresa el número:");
                    op1 = scanner.nextInt();
                    System.out.printf("Resultado: %.2f\n", Raiz.realizarOperacion(op1));
                    break;
                case 8:
                    System.out.println("Ingresa el número:");
                    op1 = scanner.nextInt();
                    System.out.printf("Resultado: %.2f\n", Logaritmo.realizarOperacion(op1));
                    break;
                case 9:
                    System.out.println("Saliendo...");
                    break;
                default:
                    System.out.println("Esa opcion no existe, elige una opcion valida.");
            }
        } while(opcion != 9);
        scanner.close();
    }
}
