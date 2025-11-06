package invertir.cadenas;

import javax.swing.*;

public class ejercicio7 {
    /*
     * Crea un programa que invierta el orden de una cadena de texto
     * sin usar funciones propias del lenguaje que lo hagan de forma automática.
     * - Si le pasamos "Hola mundo" nos retornaría "odnum aloH"
     */


    public static void main(String[] args) {

        String cadena1 = JOptionPane.showInputDialog("Ingresa una cadena");
        System.out.println(invertirCadena(cadena1));

    }


    public static String invertirCadena(String cadena){
       char[] cadenaC = new char[cadena.length()];
       cadenaC = cadena.toCharArray() ;
       char[] cadenaInversa = new char[cadena.length()];
       int j  =0 ;
       for (int i =cadenaC.length-1 ; i >= 0 ; i-- ) {
           cadenaInversa[j] = cadenaC[i];
           j++;
       }
       return new String(cadenaInversa);
    }



}
