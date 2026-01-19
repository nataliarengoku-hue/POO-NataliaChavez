package edu.natalia.chavez.actividad1.ui;

import edu.natalia.chavez.actividad1.models.Vehicle;
import edu.natalia.chavez.actividad1.process.Venta;

import java.util.List;
import java.util.Scanner;

/**
 * Clase que implementa la interfaz de línea de comandos (CLI) para la aplicación.
 * Maneja la interacción con el usuario permitiendo la compra de vehículos.
 * 
 * @author Natalia Chavez
 * @version 1.0
 */
public class CLI {
    /** Escáner para leer entrada del usuario */
    private Scanner scanner;
    /** Instancia del proceso de venta */
    private Venta venta;

    /**
     * Constructor que inicializa el escáner y la interfaz.
     */
    public CLI() {
        this.scanner = new Scanner(System.in);
    }

    /**
     * Inicia la aplicación de ventas.
     * Solicita el nombre del cliente y gestiona el flujo de compra.
     */
    public void start() {
        System.out.println("\n╔════════════════════════════════════════════════════════════╗");
        System.out.println("║            BIENVENIDO A TOYOTA VENTA DE AUTOS              ║");
        System.out.println("╚════════════════════════════════════════════════════════════╝\n");

        String clientName = getClientName();
        venta = new Venta(clientName);

        boolean continueShopping = true;
        while (continueShopping) {
            displayVehicles();
            int vehicleChoice = selectVehicle();
            
            if (vehicleChoice == 0) {
                continueShopping = false;
            } else {
                Vehicle selectedVehicle = venta.getAvailableVehicles().get(vehicleChoice - 1);
                String selectedColor = selectColor(selectedVehicle);
                
                if (selectedColor != null) {
                    venta.addPurchaseItem(selectedVehicle, selectedColor);
                    System.out.println("\n✓ Vehículo agregado al carrito.\n");
                    
                    continueShopping = askContinueShopping();
                }
            }
        }

        if (!venta.getPurchasedItems().isEmpty()) {
            System.out.println(venta.generateReceipt());
        } else {
            System.out.println("\nNo se realizó ninguna compra. ¡Hasta luego!\n");
        }

        scanner.close();
    }

    /**
     * Solicita y valida el nombre del cliente.
     * 
     * @return el nombre del cliente ingresado
     */
    private String getClientName() {
        System.out.print("Ingrese su nombre: ");
        String name = scanner.nextLine().trim();
        while (name.isEmpty()) {
            System.out.print("El nombre no puede estar vacío. Ingrese su nombre: ");
            name = scanner.nextLine().trim();
        }
        return name;
    }

    /**
     * Muestra la lista de vehículos disponibles con sus colores.
     */
    private void displayVehicles() {
        List<Vehicle> vehicles = venta.getAvailableVehicles();
        System.out.println("\n════════════════════════════════════════════════════════════");
        System.out.println("                   VEHÍCULOS DISPONIBLES");
        System.out.println("════════════════════════════════════════════════════════════\n");

        for (int i = 0; i < vehicles.size(); i++) {
            Vehicle vehicle = vehicles.get(i);
            System.out.println((i + 1) + ". " + vehicle.toString());
            System.out.println("   Colores disponibles: " + String.join(", ", vehicle.getColors()));
            System.out.println();
        }
    }

    /**
     * Permite al usuario seleccionar un vehículo de la lista.
     * Devuelve 0 para finalizar la compra.
     * 
     * @return el índice del vehículo seleccionado (1-based) o 0 para finalizar
     */
    private int selectVehicle() {
        System.out.print("Seleccione el número del vehículo (0 para finalizar compra): ");
        int choice = 0;
        try {
            choice = Integer.parseInt(scanner.nextLine().trim());
            if (choice < 0 || choice > venta.getAvailableVehicles().size()) {
                System.out.println("Opción inválida. Intente de nuevo.");
                return selectVehicle();
            }
        } catch (NumberFormatException e) {
            System.out.println("Entrada inválida. Ingrese un número.");
            return selectVehicle();
        }
        return choice;
    }

    /**
     * Permite al usuario seleccionar el color para un vehículo específico.
     * 
     * @param vehicle el vehículo para el cual seleccionar el color
     * @return el color seleccionado
     */
    private String selectColor(Vehicle vehicle) {
        List<String> colors = vehicle.getColors();
        System.out.println("\nColores disponibles para " + vehicle.getModel() + ":");
        
        for (int i = 0; i < colors.size(); i++) {
            System.out.println((i + 1) + ". " + colors.get(i));
        }

        System.out.print("Seleccione el número del color: ");
        try {
            int choice = Integer.parseInt(scanner.nextLine().trim());
            if (choice < 1 || choice > colors.size()) {
                System.out.println("Opción inválida. Intente de nuevo.");
                return selectColor(vehicle);
            }
            return colors.get(choice - 1);
        } catch (NumberFormatException e) {
            System.out.println("Entrada inválida. Ingrese un número.");
            return selectColor(vehicle);
        }
    }

    /**
     * Pregunta al usuario si desea continuar comprando.
     * 
     * @return true si el usuario desea continuar, false en caso contrario
     */
    private boolean askContinueShopping() {
        System.out.print("¿Desea comprar otro vehículo? (s/n): ");
        String response = scanner.nextLine().trim().toLowerCase();
        
        if (response.equals("s") || response.equals("si")) {
            return true;
        } else if (response.equals("n") || response.equals("no")) {
            return false;
        } else {
            System.out.println("Respuesta inválida. Intente de nuevo.");
            return askContinueShopping();
        }
    }
}
