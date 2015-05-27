package examenañopasado;

public class Triangulo extends SuperClase {

    float lado;

    public Triangulo() {
    }

    public Triangulo(float base, float altura) {
        super(base, altura);
    }

    public Triangulo(float lado) {
        this.lado = lado;
    }
    @Override
    public void area(){
       float area=super.getBase()*super.getAltura()/2;
        System.out.println(area);
    }
}
