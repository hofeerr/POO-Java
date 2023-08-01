public class Conta {
    private String titular;
    private Double saldo;

    Conta(String titular, Double saldo) {
        this.titular = titular;
        this.saldo = saldo;
    }

    public String toString() {
        return "titular:" + titular + "  saldo:" + saldo + "\n";
    }

    public void sacar(Double valor) {
        if(valor <=  saldo) {
            saldo -= valor;
        } else {
            System.out.println("limite indisponível");
        }
    }
}