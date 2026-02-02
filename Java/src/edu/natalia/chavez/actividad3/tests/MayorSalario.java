package edu.natalia.chavez.actividad3.tests;

import edu.natalia.chavez.actividad3.process.ListaEmpleados;
import edu.natalia.chavez.actividad3.process.ListaEmpleados.Empleado;
import org.junit.Test;
import java.util.Arrays;
import java.util.List;
import static org.junit.Assert.*;

public class MayorSalario {
    @Test
    public void testMayorSalario() {
        List<Empleado> empleados = Arrays.asList(
            new Empleado("Juan", 30, 20000, "IT"),
            new Empleado("Ana", 25, 30000, "HR"),
            new Empleado("Pedro", 40, 25000, "Sales")
        );
        assertEquals("Ana", ListaEmpleados.mayorSalario(empleados).getNombre());
    }
}
