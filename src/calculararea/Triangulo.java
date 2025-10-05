package calculararea;

public class Triangulo implements Poligono {
    private float base;
    private float altura;

    public Triangulo(float base, float altura){
        this.base = base;
        this.altura = altura;
    }

    @Override
    public float calcularArea() {
        float area = (base*altura)/2;
        return area;
    }
}
