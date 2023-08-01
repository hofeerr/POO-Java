import java.math.*;

public class Circulo extends Shape{
    private double raio;
    private Ponto2D centro;

    Circulo(Ponto2D centro, double raio) {
        this.centro = centro;
        this.raio = raio;
    }

    public double area(){
        System.out.printf("area total: %.2f/n", (Math.pow(this.raio, 2) * Math.PI));
        return Math.pow(this.raio, 2) * Math.PI;

    }
    public double perimeter() {
        System.out.printf("perimetro total: %.2f/n", (Math.PI * 2 * raio ));
        return Math.PI * 2 * raio;
    }

    public boolean inside(Ponto2D p) {
        if(Math.abs(centro.getX() - p.getX()) < raio && Math.abs(centro.getY() - p.getY()) < raio){
            System.out.println("true");
            return true;
        }
        else {
            System.out.println("false");
            return false;
        }
    }

    public String toString(){
        return String.format("Círculo com centro em (%.1f,%.1f) e raio %.1f", centro.getX(), centro.getY(), raio);
    }
}
