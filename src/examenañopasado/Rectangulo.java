
package examenañopasado;

public class Rectangulo extends SuperClase{

    public Rectangulo() {
    }

    public Rectangulo(float base, float altura) {
        super(base, altura);
    }
    @Override
    public void perimetro(){
        float perimetro=2*super.getBase()+2*super.getAltura();
        System.out.println(perimetro);
    }

   
}
