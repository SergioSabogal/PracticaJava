package repositorio.producto;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        /*
        * Para la tarea se pide implementar una clase llamada BolsaSupermercado que maneje tipos genéricos para guardar
        *  productos en una lista de máximo 5 elementos. El tipo List<T> debe ser genérico, por ejemplo podríamos tener
        * una bolsa que guarde productos de limpieza, otra bolsa para los lácteos otra para guardar frutas y otra para
        * productos no perecibles.
        *
        *
        * La clase BolsaSupermercado debe tener solo dos métodos, uno para agregar los productos addProducto cuyo
        * argumento sea del tipo del parámetro generic y el método getProductos que devuelve la lista de productos del
        *tipo generic.
        * Entonces como requerimiento vamos a tener 4 clases de productos Fruta, Limpieza,
        * Lacteo y NoPerecible, todas tiene en común dos atributos el nombre (string) y precio (double) que deben
        * heredar de la clase padre Producto, pero ademas cada una van a tener dos atributos propios adicionales,
        *
        * sus métodos getter y constructor para inicializar los 4 atributos (los 2 del padre y los 2 propios).
        * Los atributos adicionales de cada clase se detalla en el siguiente diagrame de clase:
        *
        * Para el ejemplo de la clase main se  pide crear un objeto bolsa para cada tipo de producto con 5 elementos,
        * se debe mostrar por cada bolsa el detalle completo de sus elementos, el precio, nombre y los atributos
        * adicionales sin realizar cast de ningún tipo, ni toString()
        * .*/

        BolsaSupermercado<Fruta> bolsaFruta = new BolsaSupermercado<>();
        BolsaSupermercado<Lacteo> bolsaLacteo =  new BolsaSupermercado<>();
        BolsaSupermercado<Limpieza> bolsaLimpieza = new BolsaSupermercado<>();
        BolsaSupermercado<NoPerecible> bolsaNoPerecible = new BolsaSupermercado<>();

        bolsaFruta.addProducto(new Fruta("Banano", 1400, 1, 15));
        bolsaFruta.addProducto(new Fruta("Naranja", 800, 2, 5));
        bolsaFruta.addProducto(new Fruta("Kiwi", 2500, 1, 4));
        bolsaFruta.addProducto(new Fruta("Sandia", 1500, 5, 1));
        bolsaFruta.addProducto(new Fruta("Tomate", 700, 4, 20));
        bolsaFruta.addProducto(new Fruta("Melon", 1500, 5, 2));

        bolsaLacteo.addProducto(new Lacteo("Yogurt", 1200, 230, 4));
        bolsaLacteo.addProducto(new Lacteo("Yogurt Griego", 5000, 140, 7));
        bolsaLacteo.addProducto(new Lacteo("Leche", 4500, 1000, 4));
        bolsaLacteo.addProducto(new Lacteo("Kumis", 2500, 220, 8));
        bolsaLacteo.addProducto(new Lacteo("Alpilitro", 35000, 1000, 6));


        bolsaNoPerecible.addProducto(new NoPerecible("Salchicha en lata", 6500,
                3432, LocalDate.of(2026, 10, 10)));
        bolsaNoPerecible.addProducto(new NoPerecible("Atun", 9000, 9392,
                LocalDate.of(2026, 5, 30)));
        bolsaNoPerecible.addProducto(new NoPerecible("Guizantes", 4500,
                65432, LocalDate.of(2028, 10, 10)));
        bolsaNoPerecible.addProducto(new NoPerecible("Frijol", 9000, 392,
                LocalDate.of(2029, 12, 31)));
        bolsaNoPerecible.addProducto(new NoPerecible("Miel", 6500,
                3432, LocalDate.of(2026, 10, 10)));
        bolsaNoPerecible.addProducto(new NoPerecible("Sardinas", 9000, 9392,
                LocalDate.of(2026, 5, 30)));



        bolsaLimpieza.addProducto(new Limpieza("Jabon de loza", 4500, "Limon", 750));
        bolsaLimpieza.addProducto(new Limpieza("Jabon liquido ropa", 9500, "Vainilla", 5000));
        bolsaLimpieza.addProducto(new Limpieza("Desengrasante", 11500, "Citrico", 750 ));
        bolsaLimpieza.addProducto(new Limpieza("Limpia vidrios", 2000, "Lavanda", 1000));
        bolsaLimpieza.addProducto(new Limpieza("Limpia pisos", 1500, "Floral", 500));


        System.out.println("\n\n---------------Bolsa Frutas----------------");
        for(Fruta prod:  bolsaFruta.getProductos()) {
            System.out.println("\t\t" + prod.getNombre());
            System.out.println("Precio: " + prod.getPrecio());
            System.out.println("Peso: " + prod.getPeso());
            System.out.println("Unidades: " + prod.getUnidades());
            System.out.println();
        }
        System.out.println("---------------------------------------------");

        System.out.println("\n\n---------------Bolsa No Perecederos----------------");
        for(NoPerecible prod:  bolsaNoPerecible.getProductos()) {
            System.out.println("\t\t" + prod.getNombre());
            System.out.println("Precio: " + prod.getPrecio());
            System.out.println("Lote: " + prod.getLote());
            System.out.println("Fecha de Vencimiento: " + prod.getVencimiento().toString());
            System.out.println();
        }
        System.out.println("---------------------------------------------");

        System.out.println("\n\n---------------Bolsa Lacteos----------------");
        for(Lacteo prod:  bolsaLacteo.getProductos()) {
            System.out.println("\t\t"+ prod.getNombre());
            System.out.println("Precio: " + prod.getPrecio());
            System.out.println("Mililitros: " + prod.getMililitros());
            System.out.println("Proteina gramos: " + prod.getProteina());
            System.out.println();
        }
        System.out.println("---------------------------------------------");

        System.out.println("\n\n---------------Bolsa Limpieza----------------");
        for(Limpieza prod:  bolsaLimpieza.getProductos()) {
            System.out.println("\t\t" + prod.getNombre());
            System.out.println("Precio: " + prod.getPrecio());
            System.out.println("Aroma: " + prod.getAroma());
            System.out.println("Contenido Mililitros: " + prod.getMililitros());
            System.out.println();
        }
        System.out.println("---------------------------------------------");
    }
}
