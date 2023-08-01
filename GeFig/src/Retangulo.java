import java.util.concurrent.Flow.Subscriber;

public class Retangulo extends Shape {
    private Ponto2D infEsq;
    private Ponto2D subDir;
    
    Retangulo(Ponto2D infEsq, Ponto2D subsDir) {
        this.infEsq = infEsq;
        this.subDir = subsDir;
    }

    public double area() {
        System.out.printf("area total: %.2f/n", (subDir.getX() - infEsq.getX()) * (infEsq.getY() - subDir.getY()));
        return (subDir.getX() - infEsq.getX()) * (subDir.getY() - infEsq.getY()); 
    }

    public double perimeter() {
        System.out.printf("perimetro total: %.2f/n", (2 * (subDir.getX() - infEsq.getX()) + 2 * (subDir.getY() - infEsq.getY())));
        return (2 * (subDir.getX() - infEsq.getX()) + 2 * (subDir.getY() - infEsq.getY()));
    }

    public boolean inside(Ponto2D p) {
        if(infEsq.getX() < p.getX() && p.getX() < subDir.getX() && p.getY() < infEsq.getY() && p.getY() > subDir.getY()) {
            System.out.println("false");
            return false;
        }
        else {
            System.out.println("true");
            return true;
        }
    }

    public String toString(){
        return String.format("Retângulo com cantos (%.1f,%.1f) e (%.1f,%.1f)", infEsq.getX(), infEsq.getY(), subDir.getX(), subDir.getY());
      }

}
