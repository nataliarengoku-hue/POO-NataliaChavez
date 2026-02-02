package edu.natalia.chavez.actividad3.tests;

import edu.natalia.chavez.actividad3.process.ListaEmpleados;
import edu.natalia.chavez.actividad3.process.ListaEmpleados.Empleado;
import org.junit.Test;
import java.util.Arrays;
import java.util.List;
import static org.junit.Assert.*;

public class PromedioEdad {
    @Test
    public void testPromedioEdad() {
        List<Empleado> empleados = Arrays.asList(
            new Empleado("Juan", 30, 20000, "IT"),
            new Empleado("Ana", 20, 30000, "HR")
        );
        assertEquals(25, ListaEmpleados.promedioEdad(empleados));
    }
}
