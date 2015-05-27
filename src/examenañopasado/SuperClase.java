
package examenañopasado;

public class SuperClase {
    
    private String cor;
    private float base=5,altura=5;

    public SuperClase() {
    }

    public SuperClase(float base, float altura) {
        this.base = base;
        this.altura = altura;
    }

    public float getBase() {
        return base;
    }

    public float getAltura() {
        return altura;
    }
    
    
    public void area(){
       float area=base*altura;
    }
    public void perimetro(){
        
    }
    
    
    
}
