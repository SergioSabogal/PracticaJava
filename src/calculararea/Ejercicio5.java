package calculararea;

import java.util.ArrayList;
import java.util.List;

public class Ejercicio5 {
    /*
     * Crea una única función (importante que sólo sea una) que sea capaz
     * de calcular y retornar el área de un polígono.
     * - La función recibirá por parámetro sólo UN polígono a la vez.
     * - Los polígonos soportados serán Triángulo, Cuadrado y Rectángulo.
     * - Imprime el cálculo del área de un polígono de cada tipo.
     */

    public static void main(String[] args) {
        List<Poligono> listFiguras = new ArrayList<>();

        listFiguras.add(new Rectangulo(5,10));
        listFiguras.add(new Cuadrado(12));
        listFiguras.add(new Triangulo(5, 7));

        listFiguras.forEach();

    }


    public static void calculaAreaPoligono(Poligono p){
        System.out.println("El area de la fiura" + p +" es: " +p.calcularArea());
    }
}
