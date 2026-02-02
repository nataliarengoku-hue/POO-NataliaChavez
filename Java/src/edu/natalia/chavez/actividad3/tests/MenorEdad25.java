package edu.natalia.chavez.actividad3.tests;

import edu.natalia.chavez.actividad3.process.ListaEmpleados;
import edu.natalia.chavez.actividad3.process.ListaEmpleados.Empleado;
import org.junit.Test;
import java.util.Arrays;
import java.util.List;
import static org.junit.Assert.*;

public class MenorEdad25 {
    @Test
    public void testMenoresDe25() {
        List<Empleado> empleados = Arrays.asList(
            new Empleado("Juan", 30, 20000, "IT"),
            new Empleado("Ana", 20, 30000, "HR")
        );
        List<Empleado> resultado = ListaEmpleados.menoresDe25(empleados);
        assertEquals(1, resultado.size());
        assertEquals("Ana", resultado.get(0).getNombre());
    }
}
