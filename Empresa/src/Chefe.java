public class Chefe extends Funcionario {
    String departamento;
    Chefe(String nome, Double salario, String departamento) {
        super(nome, salario);
        this.departamento =  departamento;
    }

    public String toString() {
        String resp = "";
        resp += super.toString();
        resp += "dep: " + departamento + "\n";
        return resp;
    }
}
