package edu.natalia.chavez.actividad3.tests;

import edu.natalia.chavez.actividad3.process.Strings;
import org.junit.Test;
import static org.junit.Assert.*;

public class Vocales {
    @Test
    public void testContarVocales() {
        assertEquals(5, Strings.contarVocales("Murcielago"));
    }
}
