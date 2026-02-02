package edu.natalia.chavez.actividad3.process;
import java.util.*;
public class ListaEmpleados {
    // Se implementa una clase interna para poder representar a un empleado
    public static class Empleado {
        private String nombre;
        private int edad;
        private int salario;
        private String departamento;

        public Empleado(String nombre, int edad, int salario, String departamento) {
            this.nombre = nombre;
            this.edad = edad;
            this.salario = salario;
            this.departamento = departamento;
        }

        public String getNombre() { return nombre; }
        public int getEdad() { return edad; }
        public int getSalario() { return salario; }
        public String getDepartamento() { return departamento; }
    }

    /**
     * Devuelve el empleado con mayor salario
     */
    public static Empleado mayorSalario(List<Empleado> empleados) {
        Empleado mayor = empleados.get(0);
        for (Empleado e : empleados) { //e representa a cada empleado para despues obtener el salario del empleado y compararlo
            if (e.getSalario() > mayor.getSalario()) {
                mayor = e;
            }
        }
        return mayor;
    }

    /**
     * Devuelve la edad más comun entre los empleados
     */
    public static int edadMasComun(List<Empleado> empleados) {
        int edadComun = -1; // se usa -1 como el valor inicial porque no hay una edad definida todavía

        int maxFrecuencia = 0;

        for (Empleado e : empleados) {
            int contador = 0;
            for (Empleado otro : empleados) {
                if (e.getEdad() == otro.getEdad()) { // Aqui se compara la edad del empleado e con la edad de cada otro

                    contador++;
                }
            }
            if (contador > maxFrecuencia) { //Aqui se compara si contador es mayor a maxFrecuencia y si sí se guarda en edadComun
                maxFrecuencia = contador;
                edadComun = e.getEdad();
            }
        }
        return edadComun;
    }

    /**
     * Calcula el promedio de edad
     */
    public static int promedioEdad(List<Empleado> empleados) {
        int suma = 0;
        for (Empleado e : empleados) {
            suma += e.getEdad();
        }
        return suma / empleados.size();
    }

    /**
     * Calcula el promedio de salario
     */
    public static int promedioSalario(List<Empleado> empleados) {
        int suma = 0;
        for (Empleado e : empleados) {
            suma += e.getSalario();
        }
        return suma / empleados.size();
    }

    /**
     * Promedio de edad de empleados con salario mayor a 25,000
     */
    public static int promedioEdadMas25K(List<Empleado> empleados) {
        int suma = 0;
        int contador = 0;
        for (Empleado e : empleados) {
            if (e.getSalario() > 25000) {
                suma += e.getEdad();
                contador++;
            }
        }
        if (contador == 0) return 0;
        return suma / contador;
    }

    /**
     * Devuelve lista de empleados menores de 25 años
     */
    public static List<Empleado> menoresDe25(List<Empleado> empleados) {
        List<Empleado> resultado = new ArrayList<>();
        for (Empleado e : empleados) {
            if (e.getEdad() < 25) {
                resultado.add(e);
            }
        }
        return resultado;
    }

    /**
     * Cuenta cuántos empleados están en el departamento de sistemas
     */
    public static int contarSistemas(List<Empleado> empleados) {
        int contador = 0;
        for (Empleado e : empleados) {
            if (e.getDepartamento().equalsIgnoreCase("sistemas")) {
                contador++;
            }
        }
        return contador;
    }

    /**
     * Devuelve el empleado con mayor salario y más de 30 años
     */
    public static Empleado mayorSalarioMas30(List<Empleado> empleados) {
        Empleado mayor = null;
        for (Empleado e : empleados) {
            if (e.getEdad() > 30) {
                if (mayor == null || e.getSalario() > mayor.getSalario()) {
                    mayor = e;
                }
            }
        }
        return mayor;
    }

    /**
     * Devuelve el empleado con menor salario cuya edad sea la menos común
     */
    public static Empleado menorSalarioEdadMenosComun(List<Empleado> empleados) {
        // Primero buscamos encontrar la edad menos común
        int edadMenosComun = -1;
        int minFrecuencia = Integer.MAX_VALUE; //se inicia minFrecuencia con el valor mas grande para despues poder remplazarlo

        for (Empleado e : empleados) {
            int contador = 0;
            for (Empleado otro : empleados) {
                if (e.getEdad() == otro.getEdad()) {
                    contador++;
                }
            }
            if (contador < minFrecuencia) { // si el contador tiene una frecuencia menor que minFrecuencia se actualiza para tener un mejor control de las edades
                minFrecuencia = contador;
                edadMenosComun = e.getEdad();
            }
        }

        //Despues se busca al empleado que tenga la menor edad y menor salario
        Empleado menor = null;
        for (Empleado e : empleados) {
            if (e.getEdad() == edadMenosComun) { //empleados con la edad menos comun
                if (menor == null || e.getSalario() < menor.getSalario()) { // se cumple si al menos una de las dos opciones es verdadera (True)
                    menor = e;
                }
            }
        }
        return menor;
    }
}

