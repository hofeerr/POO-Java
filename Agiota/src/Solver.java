import java.util.Scanner;
import java.util.Locale;

public class Solver {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        Locale.setDefault(Locale.US);

        Agiota ag = new Agiota(0);

        while (true) {
            String line = scanner.nextLine();
            String ui[] = line.split(" ");
            System.out.println("$" + line);

            if (ui[0].equals("init")) {
                int balance = Integer.parseInt(ui[1]);
                ag = new Agiota(balance);
            } else if (ui[0].equals("end")) {
                break;
            } else if (ui[0].equals("addCli")) {
                String codename = ui[1];
                Integer limite = Integer.parseInt(ui[2]);
                ag.addCli(codename, limite);
            } else if (ui[0].equals("lend")) {
                String codename = ui[1];
                Integer value = Integer.parseInt(ui[2]);
                ag.lend(codename, value);
            } else if (ui[0].equals("receive")) {
                String codename = ui[1];
                Integer value = Integer.parseInt(ui[2]);
                ag.receive(codename, value);
            } else if (ui[0].equals("show")) {// km
                System.out.println(ag);
            } else if (ui[0].equals("kill")) {// gas
                String codename = ui[1];
                ag.kill(codename);
            } else {
                System.out.println("fail: comando invalido");
            }
        }
        scanner.close();
    }
}
