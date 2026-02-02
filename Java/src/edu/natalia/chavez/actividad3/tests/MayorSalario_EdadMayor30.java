package edu.natalia.chavez.actividad3.tests;

import edu.natalia.chavez.actividad3.process.ListaEmpleados;
import edu.natalia.chavez.actividad3.process.ListaEmpleados.Empleado;
import org.junit.Test;
import java.util.Arrays;
import java.util.List;
import static org.junit.Assert.*;

public class MayorSalario_EdadMayor30 {
    @Test
    public void testMayorSalarioMas30() {
        List<Empleado> empleados = Arrays.asList(
            new Empleado("Juan", 25, 50000, "IT"),
            new Empleado("Ana", 35, 30000, "HR"),
            new Empleado("Pedro", 40, 40000, "Sales")
        );
        assertEquals("Pedro", ListaEmpleados.mayorSalarioMas30(empleados).getNombre());
    }
}
