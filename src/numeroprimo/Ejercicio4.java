package numeroprimo;

public class Ejercicio4 {
    /*
     * Escribe un programa que se encargue de comprobar si un número es o no primo.
     * Hecho esto, imprime los números primos entre 1 y 100.
     */
    public static void main(String[] args) {
        for( int i = 1 ; i<=100 ; i++){
            int contador = 0;
            for(int j = 1 ; j <= i  ; j++){
                if(i%j == 0 ){
                    contador++;

                }
            }
            if(contador <= 2 ){
                System.out.println(i);
            }
        }
    }

}
