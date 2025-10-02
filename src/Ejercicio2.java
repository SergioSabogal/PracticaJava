import java.util.Arrays;

public class Ejercicio2 {
    public static void main(String[] args) {
        /*
         * Escribe una función que reciba dos palabras (String) y retorne
         * verdadero o falso (Bool) según sean o no anagramas.
         * - Un Anagrama consiste en formar una palabra reordenando TODAS
         *   las letras de otra palabra inicial.
         * - NO hace falta comprobar que ambas palabras existan.
         * - Dos palabras exactamente iguales no son anagrama.
         */

        System.out.println(esAnagrama("amor","roma"));
        System.out.println(esAnagrama("amor","mora"));
        System.out.println(esAnagrama("amor","amor"));


    }

    public static boolean esAnagrama(String palabra1, String palabra2){
        if(palabra1.toLowerCase().equals(palabra2.toLowerCase())){
            return false;
        }
        char[] wordOne = palabra1.toCharArray();
        char[] wordTwo = palabra2.toCharArray();
        Arrays.sort(wordOne);
        Arrays.sort(wordTwo);
        //return Arrays.equals(wordOne, wordTwo);
        return Arrays.equals(wordOne, wordTwo);
    }
}
