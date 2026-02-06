package edu.natalia.chavez.v2actividad2.process;

public class Calculadora {
    public Operacion operacion;
    public void setOperacion(int opcion) {
        this.operacion = getOperacion(opcion);
    }

    private Operacion getOperacion(int opcion){
        return switch(opcion){
            case 1 -> new Suma();
            case 2 -> new Resta();
            case 3 -> new Multiplicacion();
            case 4 -> new Division();
            case 5-> new Modulo();
            case 6 -> new Potencia();
            case 7 -> new Logaritmo();
            case 8 -> new Raiz();
            default -> throw new IllegalArgumentException("Opcion no valida");
        };
    }
}
