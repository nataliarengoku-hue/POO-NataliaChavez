package edu.natalia.chavez.actividad3.tests;

import edu.natalia.chavez.actividad3.process.Strings;
import org.junit.Test;
import static org.junit.Assert.*;

public class Palindromo {
    @Test
    public void testEsPalindromoTrue() {
        assertTrue(Strings.esPalindromo("Anita lava la tina"));
    }

    @Test
    public void testEsPalindromoFalse() {
        assertFalse(Strings.esPalindromo("Hola mundo"));
    }
}
