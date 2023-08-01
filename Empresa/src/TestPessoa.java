import java.util.ArrayList;

public class TestPessoa {
    public static void main(String[] args){
        Pessoa p = new Pessoa("PIPI");
        System.out.println(p);
        Funcionario f = new Funcionario("stevam", 100.08);
        System.out.println(f);
        Chefe cf =  new Chefe("Alsa", 158.88, "Financeiro");
        ArrayList<Pessoa> pessoas =  new ArrayList<Pessoa>();

        pessoas.add(f);
        pessoas.add(p);
        pessoas.add(cf);
    }
}
