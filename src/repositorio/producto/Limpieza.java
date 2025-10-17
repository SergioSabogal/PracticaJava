package repositorio.producto;

public class Limpieza extends Producto{
    private String aroma;
    private double mililitros;

    public Limpieza(String nombre, double precio, String aroma, double mililitros) {
        super(nombre, precio);
        this.aroma = aroma;
        this.mililitros = mililitros;
    }

    public String getAroma() {
        return aroma;
    }

    public double getMililitros() {
        return mililitros;
    }
}
