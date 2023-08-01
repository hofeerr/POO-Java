import java.util.ArrayList;
import java.util.Locale;
import java.util.Scanner;

import javax.sound.midi.Soundbank;

public class Solver {
    
    public static void main(String[] args) {
        ArrayList<Shape> lista = new ArrayList<Shape>();
        Scanner sc = new Scanner(System.in);
        double totalArea = 0;
        double totalPerimetro = 0;

        while(true){
            String line = sc.nextLine();
            System.out.println("$" + line);
            String ui[] = line.split(" ");
            if(line.equals("end")) {
                break;
            } else if(ui[0].equals("circulo")) {
                double x = Double.parseDouble(ui[1]);
                double y = Double.parseDouble(ui[2]);
                double r = Double.parseDouble(ui[3]);
                Ponto2D pc = new Ponto2D( x, y);
                Circulo a = new Circulo(pc, r);
                totalArea += a.area();
                totalPerimetro += a.perimeter();
                lista.add(a);

            } else if(ui[0].equals("retangulo")) {
                double x1 = Double.parseDouble(ui[1]);
                double y1 = Double.parseDouble(ui[2]);
                double x2 = Double.parseDouble(ui[3]);
                double y2 = Double.parseDouble(ui[4]);
                Ponto2D pInf = new Ponto2D(x1, y1);
                Ponto2D pSup = new Ponto2D(x2, y2);
                Retangulo b = new Retangulo(pInf, pSup);
                totalPerimetro += b.perimeter();                
                totalArea += b.area();
                lista.add(b);
                
            } else if(ui[0].equals("area")) {
                System.out.printf("area total: %.2f\n", totalArea);

                
            } else if(ui[0].equals("perimetro")) {//value value
                System.out.printf("perimetro total: %.2f\n", totalPerimetro);

    
            } else if(ui[0].equals("inside")) {//value value
                double p1 = Double.parseDouble((ui[1]));
                double p2 = Double.parseDouble((ui[2]));
                Ponto2D x = new Ponto2D(p1, p2);
                for(int i = 0; i < lista.size(); i++) {
                    System.out.println(lista.get(i).inside(x));
                }
                
            } else if(ui[0].equals("mostra")) {//value value  
                for(int i = 0; i < lista.size(); i++) {
                    System.out.println(lista.get(i));
                }

            }
            else {
                System.out.println("fail: comando invalido");
            }
        }
        sc.close();
        


    }

}