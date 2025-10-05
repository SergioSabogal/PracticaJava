package calculararea;

public class Cuadrado implements Poligono{
    private float lado;
    public Cuadrado(float lado){
        this.lado = lado;
    }

    @Override
    public float calcularArea() {
        float area = lado*4;
        return area;
    }
}
