package repositorio.producto;

public class Fruta extends Producto {
    private double peso;
    private int unidades;

    public Fruta(String nombre, double precio, double peso, int unidades) {
        super(nombre, precio);
        this.peso = peso;
        this.unidades = unidades;
    }

    public int getUnidades() {
        return unidades;
    }


    public double getPeso() {
        return peso;
    }

}
