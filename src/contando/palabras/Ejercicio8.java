package contando.palabras;

import javax.swing.*;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

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






    }



    public String conteoPalabras(String mensaje){
        List<String> palabras = new ArrayList<>();
        StringBuilder palabraActual = new StringBuilder();

        for (int i = 0 ; i < mensaje.length(); i++){
            if(mensaje.charAt(i) != ' '){
                char c = mensaje.charAt(i);
                palabraActual.append(c);
            }
            else if( mensaje.charAt(i) == ' '){
                palabras.add(new String(palabraActual) );
                palabraActual.setLength(0);
            }else {
                palabras.add(new String(palabraActual) );
            }
        }

        Collections.sort(palabras);
        for(int i = 0 ; i < palabras.size(); i++){
           if (palabras.get(i).equalsIgnoreCase(palabras.get(i+1))){

           }
        }

    }
}
