package examenañopasado;


import java.util.ArrayList;

public class ExamenAñoPasado {

    public static void main(String[] args) {
        SuperClase sup=new SuperClase();
        Triangulo tri = new Triangulo();
        tri.area();

        Rectangulo rec=new Rectangulo();
        rec.perimetro();
        
        ArrayList<SuperClase>array=new ArrayList();
        array.add(tri);
        array.add(rec);
        
        SuperClase su=new Triangulo();
       
        
    }

}
