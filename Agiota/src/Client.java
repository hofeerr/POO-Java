public class Client {
    private int balance;
    private String codename;
    private int limite;

    Client(String codename, int limite) {
        this.balance = 0;
        this.codename = codename;
        this.limite = limite;
    }

    public int getBalance() {
        return balance;
    }
    
    public String getName() {
        return codename;
    }

    public int getLimite() {
        return limite;
    }

    public void setBalance(int balance) {
        this.balance = balance;
    }

    public void setLimite(int limite) {
        this.limite = limite;
    }

    public void setName(String codename) {
        this.codename = codename;
    }

    public String toString() {
        return "- " + getName() + ":" + getBalance()  + "/" + getLimite() + "\n";
    }
}

