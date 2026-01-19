package edu.natalia.chavez.actividad1.process;

import edu.natalia.chavez.actividad1.models.PurchaseItem;
import edu.natalia.chavez.actividad1.models.Vehicle;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * Clase que gestiona el proceso de venta de vehículos.
 * Administra los vehículos disponibles, artículos comprados, 
 * datos del cliente y generación de recibos.
 * 
 * @author Natalia Chavez
 * @version 1.0
 */
public class Venta {
    /** Nombre del cliente que realiza la compra */
    private String clientName;
    /** Lista de artículos comprados en la transacción */
    private List<PurchaseItem> purchasedItems;
    /** Fecha y hora de la transacción */
    private LocalDateTime transactionDate;
    /** Lista estática de vehículos disponibles para la venta */
    private static final List<Vehicle> availableVehicles = initializeVehicles();

    /**
     * Constructor que inicializa una venta con el nombre del cliente.
     * 
     * @param clientName el nombre del cliente
     */
    public Venta(String clientName) {
        this.clientName = clientName;
        this.purchasedItems = new ArrayList<>();
        this.transactionDate = LocalDateTime.now();
    }

    /**
     * Inicializa la lista estática de vehículos disponibles.
     * Crea instancias de diferentes modelos Toyota con sus colores.
     * 
     * @return lista de vehículos disponibles
     */
    private static List<Vehicle> initializeVehicles() {
        List<Vehicle> vehicles = new ArrayList<>();
        
        vehicles.add(new Vehicle("Sienna HEV", 997600, 
            Arrays.asList("Blanco", "Azul Oscuro", "Plata", "Rojo", "Gris Metálico"), "Toyota"));
        
        vehicles.add(new Vehicle("Hilux", 496400, 
            Arrays.asList("Blanco", "Plata", "Rojo", "Gris"), "Toyota"));
        
        vehicles.add(new Vehicle("Highlander HEV", 950900, 
            Arrays.asList("Azul Oscuro", "Rojo", "Negro", "Blanco Perlado", "Gris Metálico"), "Toyota"));
        
        vehicles.add(new Vehicle("Corolla", 425600, 
            Arrays.asList("Grafito", "Rojo", "Plata", "Blanco", "Negro", "Gris Metálico"), "Toyota"));
        
        vehicles.add(new Vehicle("Corolla Cross", 544000, 
            Arrays.asList("Azul", "Plata", "Negro", "Rojo", "Gris Metálico"), "Toyota"));
        
        return vehicles;
    }

    /**
     * Obtiene la lista de vehículos disponibles para la venta.
     * 
     * @return lista de vehículos disponibles
     */
    public List<Vehicle> getAvailableVehicles() {
        return availableVehicles;
    }

    /**
     * Añade un artículo de compra a la transacción.
     * Verifica que el color esté disponible para el vehículo.
     * 
     * @param vehicle el vehículo a comprar
     * @param color el color seleccionado
     * @throws IllegalArgumentException si el color no está disponible
     */
    public void addPurchaseItem(Vehicle vehicle, String color) {
        if (vehicle.getColors().contains(color)) {
            purchasedItems.add(new PurchaseItem(vehicle, color));
        } else {
            throw new IllegalArgumentException("Color no disponible para este vehículo.");
        }
    }

    /**
     * Obtiene la lista de artículos comprados en la transacción.
     * 
     * @return lista de artículos comprados
     */
    public List<PurchaseItem> getPurchasedItems() {
        return purchasedItems;
    }

    /**
     * Calcula el total de la compra sumando los precios de todos los artículos.
     * 
     * @return el monto total a pagar
     */
    public double calculateTotal() {
        return purchasedItems.stream()
            .mapToDouble(PurchaseItem::getUnitPrice)
            .sum();
    }

    /**
     * Genera un recibo de venta formateado con todos los detalles.
     * Incluye datos del cliente, fecha, vehículos comprados y total.
     * 
     * @return cadena con el recibo de venta formateado
     */
    public String generateReceipt() {
        StringBuilder receipt = new StringBuilder();
        receipt.append("\n╔════════════════════════════════════════════════════════════╗\n");
        receipt.append("║                    TICKET DE VENTA - TOYOTA                 ║\n");
        receipt.append("╚════════════════════════════════════════════════════════════╝\n");
        receipt.append("\nCliente: ").append(clientName).append("\n");
        receipt.append("Fecha: ").append(formatDate(transactionDate)).append("\n");
        receipt.append("\n────────────────────────────────────────────────────────────\n");
        receipt.append("VEHÍCULOS ADQUIRIDOS:\n");
        receipt.append("────────────────────────────────────────────────────────────\n");

        for (int i = 0; i < purchasedItems.size(); i++) {
            PurchaseItem item = purchasedItems.get(i);
            receipt.append((i + 1)).append(". ").append(item.toString()).append("\n");
        }

        receipt.append("────────────────────────────────────────────────────────────\n");
        receipt.append("TOTAL A PAGAR: $").append(String.format("%,.2f", calculateTotal())).append(" M.N.\n");
        receipt.append("────────────────────────────────────────────────────────────\n");
        receipt.append("\n¡Gracias por su compra!\n\n");

        return receipt.toString();
    }

    /**
     * Formatea una fecha y hora al formato dd/MM/yyyy HH:mm:ss.
     * 
     * @param dateTime la fecha y hora a formatear
     * @return cadena con la fecha formateada
     */
    private String formatDate(LocalDateTime dateTime) {
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm:ss");
        return dateTime.format(formatter);
    }

    /**
     * Obtiene el nombre del cliente.
     * 
     * @return el nombre del cliente
     */
    public String getClientName() {
        return clientName;
    }

    /**
     * Establece el nombre del cliente.
     * 
     * @param clientName el nuevo nombre del cliente
     */
    public void setClientName(String clientName) {
        this.clientName = clientName;
    }

    /**
     * Obtiene la fecha y hora de la transacción.
     * 
     * @return la fecha y hora de la transacción
     */
    public LocalDateTime getTransactionDate() {
        return transactionDate;
    }

    /**
     * Establece la fecha y hora de la transacción.
     * 
     * @param transactionDate la nueva fecha y hora de la transacción
     */
    public void setTransactionDate(LocalDateTime transactionDate) {
        this.transactionDate = transactionDate;
    }
}
