package repositorio.producto;

import java.util.ArrayList;
import java.util.List;

public class BolsaSupermercado<T> {
    private List<T> listProductos;
    final static int MAX_LIST = 5;
    public BolsaSupermercado(){
        this.listProductos = new ArrayList<>();
    }

    /*
    *  La clase BolsaSupermercado debe tener solo dos métodos, uno para agregar los productos addProducto cuyo
    * argumento sea del tipo del parámetro generic y el método getProductos que devuelve la lista de productos del
    *tipo generic
    * */

    public void addProducto(T t){
        if (listProductos.size() < 5){
            this.listProductos.add(t);
        }else {
            System.out.println("La bolsa "+ t.getClass().getSimpleName() +" ya esta llena ");
            System.out.println();
        }

    }

    public List<T> getProductos(){
        return listProductos;
    }

}
