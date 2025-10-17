package repositorio.producto;

public class Lacteo extends Producto {
    private int mililitros;
    private int proteina;

    public Lacteo(String nombre, double precio, int mililitros, int proteina) {
        super(nombre, precio);
        this.mililitros = mililitros;
        this.proteina = proteina;
    }

    public int getMililitros() {
        return mililitros;
    }

    public int getProteina() {
        return proteina;
    }
}
