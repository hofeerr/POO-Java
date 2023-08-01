public class Funcionario extends Pessoa{
    Double salario;


    Funcionario (String nome, Double salario) {
        super(nome); // chama o construtor de Pessoa super classe passando o nome
        this.salario = salario;
    }
    
    public String toString() {
        String resp = "";
        resp += super.toString();
        resp += "salário = " + salario + "\n";
        return resp;
    }

}
