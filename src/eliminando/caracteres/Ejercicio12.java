package eliminando.caracteres;

import java.util.Scanner;

public class Ejercicio12 {
    /*
     * Crea una función que reciba dos cadenas como parámetro (str1, str2)
     * e imprima otras dos cadenas como salida (out1, out2).
     * - out1 contendrá todos los caracteres presentes en la str1 pero NO
     *   estén presentes en str2.
     * - out2 contendrá todos los caracteres presentes en la str2 pero NO
     *   estén presentes en str1.
     */
    static void main() {
        String stringInput = "";
        String stringInput2 = "";
        String stringOutput ="";
        String stringOutput2 = "";

        Scanner sc = new Scanner(System.in);
        System.out.println("Ingrese el texto pertenenciente a la cadena 1: ");
        stringOutput = sc.nextLine();
        System.out.println("Ingrese el texto pertenente a la cadena 2: ");
        stringInput2 = sc.nextLine();

        char aux  ;
        boolean isPar = false;
        for (int i = 0; i < stringInput.length(); i++) {
            for (int j = 0; j < stringInput2.length(); j++) {
                if (stringInput.charAt(i) == stringInput2.charAt(j)) {
                     isPar = false;
                     break;
                }else {
                    isPar = true;
                }
            }

            if (isPar) {
                aux = stringOutput.charAt(i);
                stringOutput += aux;
            }

        }

        System.out.println("Mensaje de salida:  " +  stringOutput);

    }
}
