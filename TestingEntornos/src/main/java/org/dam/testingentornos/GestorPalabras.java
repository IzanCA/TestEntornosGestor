public class GestorPalabras {
    public boolean esPalindromo(String palabra) throws intComoString, SimbolException, LenghtMenor2, stringVacioException {
        String palabraFormateada = palabra.replaceAll("\s+", "").toLowerCase();
        if (palabraFormateada.length() == 0) {
            throw new stringVacioException("Has introducido un string vacío");
        } else if (palabraFormateada.length() < 2) {
            throw new LenghtMenor2("La longitud es menor a 2");
        } else {
            for (int i = 0; i < palabraFormateada.length(); i++) {
                if (Character.isDigit(palabraFormateada.charAt(i))) {
                    throw new intComoString("Has introducido un entero");
                } else if (!Character.isLetterOrDigit(palabraFormateada.charAt(i))) {
                    throw new SimbolException("Has introducido un símbolo");
                }
            }
        }

        for (int i = 0; i < palabraFormateada.length() / 2; i++) {

            if (palabraFormateada.charAt(i) != palabraFormateada.charAt(palabraFormateada.length() - i - 1)) {
                return false;
            }
        }

        return true;
    }

    public int contarVocales(String palabra) {
        int contador = 0;
        for (int i = 0; i < palabra.length(); i++) {
            char caracter = Character.toLowerCase(palabra.charAt(i));
            if (caracter == 'a' || caracter == 'e' || caracter == 'i' || caracter == 'o' || caracter == 'u'
                    || caracter == 'á' || caracter == 'é' || caracter == 'í' || caracter == 'ó' || caracter == 'ú') {
                contador++;
            }
        }
        return contador;
    }

    public String invertirPalabra(String palabra) {
        StringBuilder resultado = new StringBuilder();
        for (int i = palabra.length() - 1; i >= 0; i--) {
            resultado.append(palabra.charAt(i));
        }
        return resultado.toString();
    }
}
