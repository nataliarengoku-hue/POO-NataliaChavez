package edu.natalia.chavez.actividad3.tests;

import edu.natalia.chavez.actividad3.process.Strings;
import org.junit.Test;
import static org.junit.Assert.*;

public class CadenaInvertida {
    @Test
    public void testInvertirCadena() {
        assertEquals("odnum aloh", Strings.invertirCadena("hola mundo"));
    }
}
