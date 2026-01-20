package edu.natalia.chavez.actividad1.models;

/**
 * Clase que representa un artículo de compra en la transacción.
 * Contiene información del vehículo, color seleccionado y precio unitario.
 * 
 * @author Natalia Chavez
 * @version 1.0
 */
public class PurchaseItem {
    /** Vehículo incluido en la compra */
    private Vehicle vehicle;
    /** Color seleccionado para el vehículo */
    private String selectedColor;
    /** Precio unitario del vehículo */
    private double unitPrice;

    /**
     * Constructor que crea un artículo de compra con un vehículo y color específico.
     * 
     * @param vehicle el vehículo a comprar
     * @param selectedColor el color seleccionado del vehículo
     */
    public PurchaseItem(Vehicle vehicle, String selectedColor) {
        this.vehicle = vehicle;
        this.selectedColor = selectedColor;
        this.unitPrice = vehicle.getPrice();
    }

    /**
     * Obtiene el vehículo del artículo de compra.
     * 
     * @return el vehículo
     */
    public Vehicle getVehicle() {
        return vehicle;
    }

    /**
     * Establece el vehículo del artículo de compra.
     * 
     * @param vehicle el nuevo vehículo
     */
    public void setVehicle(Vehicle vehicle) {
        this.vehicle = vehicle;
    }

    /**
     * Obtiene el color seleccionado del vehículo.
     * 
     * @return el color seleccionado
     */
    public String getSelectedColor() {
        return selectedColor;
    }

    /**
     * Establece el color seleccionado del vehículo.
     * 
     * @param selectedColor el nuevo color seleccionado
     */
    public void setSelectedColor(String selectedColor) {
        this.selectedColor = selectedColor;
    }

    /**
     * Obtiene el precio unitario del vehículo.
     * 
     * @return el precio unitario
     */
    public double getUnitPrice() {
        return unitPrice;
    }

    /**
     * Establece el precio unitario del vehículo.
     * 
     * @param unitPrice el nuevo precio unitario
     */
    public void setUnitPrice(double unitPrice) {
        this.unitPrice = unitPrice;
    }

    /**
     * Retorna una representación en cadena del artículo de compra.
     * Formato: "Marca Modelo (Color) - $precio"
     * 
     * @return representación en cadena del artículo
     */
    @Override
    public String toString() {
        return vehicle.getBrand() + " " + vehicle.getModel() + 
               " (" + selectedColor + ") - $" + String.format("%,.2f", unitPrice);
    }
}
