package edu.natalia.chavez.actividad3.process;

    public class Strings {
        /**
         * Se verifica si un texto es palindromo
         * Se van a ignorar espacios y mayusculas
         */
        public static boolean esPalindromo(String texto) {
            texto = texto.replace(" ", "").toLowerCase(); // se quitan espacios y se convierte a minusculas el texto
            int inicio = 0;
            int fin = texto.length() - 1; //nos permite saber el indice final ya que al contarse los caracteres no se empiezan a contar desde el 0, cosa que en el indice si pasa, por eso se resta 1

            while (inicio < fin) { //se comparan las letras desde los extremos hacia el centro por medio de sus indices
                if (texto.charAt(inicio) != texto.charAt(fin)) {
                    return false; // si no coinciden las letras, no es palíndromo
                }
                inicio++;
                fin--;
            }
            return true;
        }

        /**
         * Se cuentan las vocales en un texto.
         */
        public static int contarVocales(String texto) {
            int contador = 0;
            texto = texto.toLowerCase(); //se convierte a minusculas el texto

            for (int i = 0; i < texto.length(); i++) {
                char letra = texto.charAt(i);
                if (letra == 'a' || letra == 'e' || letra == 'i' || letra == 'o' || letra == 'u') {
                    contador++;
                }
            }
            return contador;
        }

        /**
         * Se devuelve una cadena invertida sin usar reverse
         */
        public static String invertirCadena(String texto) {
            String resultado = "";
            for (int i = texto.length() - 1; i >= 0; i--) {
                resultado += texto.charAt(i); // Sirve para agregar cada letra al revés
            }
            return resultado;
        }

        /**
         * Se devuelve la primera ubicacion de un caracter dentro de una cadena
         * Si no existe se devuelve -1.
         */
        public static int primeraUbicacion(String texto, char c) {
            for (int i = 0; i < texto.length(); i++) {
                if (texto.charAt(i) == c) {
                    return i; // devuelve la ubicacion donde se encontro
                }
            }
            return -1; // devuelve -1 si no se encontró
        }
    }
