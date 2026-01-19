package edu.natalia.chavez.actividad1.models;

import java.util.List;

/**
 * Clase que representa un vehículo disponible para la venta.
 * Almacena información sobre el modelo, precio, marca y colores disponibles.
 * 
 * @author Natalia Chavez
 * @version 1.0
 */
public class Vehicle {
    /** Modelo del vehículo */
    private String model;
    /** Precio del vehículo */
    private double price;
    /** Lista de colores disponibles para el vehículo */
    private List<String> colors;
    /** Marca del fabricante del vehículo */
    private String brand;

    /**
     * Constructor que inicializa un vehículo con sus atributos.
     * 
     * @param model el modelo del vehículo
     * @param price el precio del vehículo
     * @param colors lista de colores disponibles
     * @param brand la marca del vehículo
     */
    public Vehicle(String model, double price, List<String> colors, String brand) {
        this.model = model;
        this.price = price;
        this.colors = colors;
        this.brand = brand;
    }

    /**
     * Obtiene el modelo del vehículo.
     * 
     * @return el modelo del vehículo
     */
    public String getModel() {
        return model;
    }

    /**
     * Establece el modelo del vehículo.
     * 
     * @param model el nuevo modelo del vehículo
     */
    public void setModel(String model) {
        this.model = model;
    }

    /**
     * Obtiene el precio del vehículo.
     * 
     * @return el precio del vehículo
     */
    public double getPrice() {
        return price;
    }

    /**
     * Establece el precio del vehículo.
     * 
     * @param price el nuevo precio del vehículo
     */
    public void setPrice(double price) {
        this.price = price;
    }

    /**
     * Obtiene la lista de colores disponibles para el vehículo.
     * 
     * @return lista de colores disponibles
     */
    public List<String> getColors() {
        return colors;
    }

    /**
     * Establece los colores disponibles para el vehículo.
     * 
     * @param colors la nueva lista de colores disponibles
     */
    public void setColors(List<String> colors) {
        this.colors = colors;
    }

    /**
     * Obtiene la marca del vehículo.
     * 
     * @return la marca del vehículo
     */
    public String getBrand() {
        return brand;
    }

    /**
     * Establece la marca del vehículo.
     * 
     * @param brand la nueva marca del vehículo
     */
    public void setBrand(String brand) {
        this.brand = brand;
    }

    /**
     * Retorna una representación en cadena del vehículo.
     * Formato: "Marca Modelo - $precio"
     * 
     * @return representación en cadena del vehículo
     */
    @Override
    public String toString() {
        return brand + " " + model + " - $" + String.format("%,.2f", price);
    }
}
