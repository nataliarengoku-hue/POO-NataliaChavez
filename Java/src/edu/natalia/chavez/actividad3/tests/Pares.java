package edu.natalia.chavez.actividad3.tests;

import edu.natalia.chavez.actividad3.process.ListaEnteros;
import org.junit.Test;
import java.util.Arrays;
import static org.junit.Assert.*;

public class Pares {
    @Test
    public void testContarPares() {
        assertEquals(3, ListaEnteros.contarPares(Arrays.asList(1, 2, 3, 4, 5, 6)));
    }
}
