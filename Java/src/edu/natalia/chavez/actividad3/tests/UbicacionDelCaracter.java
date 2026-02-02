package edu.natalia.chavez.actividad3.tests;

import edu.natalia.chavez.actividad3.process.Strings;
import org.junit.Test;
import static org.junit.Assert.*;

public class UbicacionDelCaracter {
    @Test
    public void testPrimeraUbicacionEncontrada() {
        assertEquals(2, Strings.primeraUbicacion("Hola", 'l'));
    }

    @Test
    public void testPrimeraUbicacionNoEncontrada() {
        assertEquals(-1, Strings.primeraUbicacion("Hola", 'z'));
    }
}
