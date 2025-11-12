package contando.palabras;
import java.util.*;

/*
 * Crea un programa que cuente cuantas veces se repite cada palabra
 * y que muestre el recuento final de todas ellas.
 * - Los signos de puntuación no forman parte de la palabra.
 * - Una palabra es la misma aunque aparezca en mayúsculas y minúsculas.
 * - No se pueden utilizar funciones propias del lenguaje que
 *   lo resuelvan automáticamente.
 */

public class Ejercicio8 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Ingrese una frase:");
        String mensaje = sc.nextLine();
        conteoPalabras(mensaje);
    }

    public static void conteoPalabras(String mensaje) {
        if (mensaje == null || mensaje.trim().isEmpty()) {
            System.out.println("El texto está vacío, por favor ingrese contenido.");
            return;
        }

        mensaje = mensaje.toLowerCase();  // ignorar mayúsculas/minúsculas
        List<String> palabras = new ArrayList<>();
        String palabra = "";

        // construir las palabras sin usar split()
        for (int i = 0; i < mensaje.length(); i++) {
            char c = mensaje.charAt(i);

            // solo letras o números
            if ((c >= 'a' && c <= 'z') || (c >= '0' && c <= '9') || c == 'á' || c == 'é' || c == 'í' || c == 'ó' || c == 'ú') {
                palabra += c;
            } else if (palabra.length() > 0) {
                palabras.add(palabra);
                palabra = "";
            }
        }

        if (palabra.length() > 0) palabras.add(palabra); // última palabra

        // ahora contamos las repeticiones manualmente
        List<String> palabrasUnicas = new ArrayList<>();
        List<Integer> conteos = new ArrayList<>();

        for (String p : palabras) {
            boolean encontrada = false;
            for (int i = 0; i < palabrasUnicas.size(); i++) {
                if (palabrasUnicas.get(i).equals(p)) {
                    conteos.set(i, conteos.get(i) + 1);
                    encontrada = true;
                    break;
                }
            }
            if (!encontrada) {
                palabrasUnicas.add(p);
                conteos.add(1);
            }
        }

        // Mostrar resultado
        System.out.println("Recuento de palabras:");
        for (int i = 0; i < palabrasUnicas.size(); i++) {
            System.out.println(palabrasUnicas.get(i) + " → " + conteos.get(i));
        }
    }
}
