package repositorio.producto;

public class Producto {
    protected String nombre;
    protected double precio;

    protected Producto(String nombre, double precio){
        this.nombre = nombre;
        this.precio = precio;
    }

    public void mostrarInfo(){
        System.out.println("Producto: " + this.nombre + "\nPrecio: "+this.precio );
    }

    public String getNombre() {
        return nombre;
    }

    public double getPrecio() {
        return precio;
    }
}
