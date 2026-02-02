package edu.natalia.chavez.actividad3.tests;

import edu.natalia.chavez.actividad3.process.ListaEmpleados;
import edu.natalia.chavez.actividad3.process.ListaEmpleados.Empleado;
import org.junit.Test;
import java.util.Arrays;
import java.util.List;
import static org.junit.Assert.*;

public class Sistemas {
    @Test
    public void testContarSistemas() {
        List<Empleado> empleados = Arrays.asList(
            new Empleado("Juan", 30, 20000, "Sistemas"),
            new Empleado("Ana", 20, 30000, "HR"),
            new Empleado("Pedro", 35, 40000, "sistemas")
        );
        assertEquals(2, ListaEmpleados.contarSistemas(empleados));
    }
}
