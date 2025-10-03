public class Ejercicio3 {
    /*
     * Escribe un programa que imprima los 50 primeros números de la sucesión
     * de Fibonacci empezando en 0.
     * - La serie Fibonacci se compone por una sucesión de números en
     *   la que el siguiente siempre es la suma de los dos anteriores.
     *   0, 1, 1, 2, 3, 5, 8, 13...
     */

    public static void main(String[] args) {
        int[] arrayFibonacci = new int[50];
        arrayFibonacci[0] = 0;
        arrayFibonacci[1] = 1;
        int aux = 0;
        for(int i = 2; i < arrayFibonacci.length; i++){
            aux = arrayFibonacci[i-2] +  arrayFibonacci[i-1] ;
            arrayFibonacci[i] = aux;
        }

        for(int elemento: arrayFibonacci){
            System.out.print(elemento + " - ");
        }
    }
}
