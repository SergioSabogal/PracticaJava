package calculararea;

public class Rectangulo implements Poligono {

    private float base;
    private float altura;

    public Rectangulo(float base, float altura){
        this.base = base;
        this.altura = altura;
    }

    @Override
    public float calcularArea() {
        float area = (base*altura);
        return area;
    }
}
