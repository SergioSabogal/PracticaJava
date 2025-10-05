package fizzbuzz;

public class Ejercicio1 {
    public static void main(String[] args) {
        /*
         * Escribe un programa que muestre por consola (con un print) los
         * números de 1 a 100 (ambos incluidos y con un salto de línea entre
         * cada impresión), sustituyendo los siguientes:
         * - Múltiplos de 3 por la palabra "fizz".
         * - Múltiplos de 5 por la palabra "buzz".
         * - Múltiplos de 3 y de 5 a la vez por la palabra "fizzbuzz".
         */

        var numero  = 0;

        for (int i= 0; i<100; i++ ){
            numero = i;
            if((numero % 3 == 0) & (numero % 5 == 0)){
                System.out.println("Fizzbuzz");
            } else if ((numero % 3 == 0 )) {
                System.out.println("Fizz");
            } else if (numero % 5 == 0) {
                System.out.println("Buzz");
            }else {
                System.out.println(numero);
            }
        }

    }
}
