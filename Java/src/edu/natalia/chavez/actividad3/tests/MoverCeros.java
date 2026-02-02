package edu.natalia.chavez.actividad3.tests;

import edu.natalia.chavez.actividad3.process.ListaEnteros;
import org.junit.Test;
import java.util.Arrays;
import java.util.List;
import static org.junit.Assert.*;

public class MoverCeros {
    @Test
    public void testMoverCerosDerecha() {
        List<Integer> numeros = Arrays.asList(0, 1, 0, 3, 12);
        List<Integer> resultado = ListaEnteros.moverCerosDerecha(numeros);
        assertEquals(Arrays.asList(1, 3, 12, 0, 0), resultado);
    }
}
