import java.util.HashMap;
import java.util.Map;

public class Agiota {
    private int balance;
    private int nextTrid;
    Map<String,Client> repCli = new HashMap<>();
    Map<Integer, Transaction> repTr = new HashMap<>(); 
    
    Agiota(int balance){
        this.balance = balance;
        this.nextTrid = 0;
    }
    private void pushTransaction(String codename, int value) {
        Transaction x =  new Transaction(nextTrid, codename, value); // cria a transação
        repTr.put(nextTrid, x); // passa ela pro map de transações
        nextTrid ++; // aumneta o núremo de transação (para usar no próx id)
    
        this.balance = this.balance - value;
    }

    public void addCli(String codemane, int limit) {
        if(repCli.containsKey(codemane) == true) {
            System.out.println("fail: cliente ja existe");
        }

        else {
            Client a = new Client(codemane, limit);
            repCli.put(codemane, a);
        }
    }

    public Client getClient(String codenome) {
        return repCli.get(codenome);
        
    }

    public void kill(String codemane) {
        int tamanho = repTr.size();
        for(int i = 0; i < tamanho; i++) {
            if(repTr.get(i).getCodename().equals(codemane)) {
                repTr.remove(i);
                nextTrid --;
            }
        }
        repCli.remove(codemane);
    }

    public void  lend(String codename, int value) {
        if(repCli.containsKey(codename) == false){
            System.out.println("fail: cliente nao existe");
            return;
        }
        if(this.balance < value) {
            System.out.println("fail: fundos insuficientes");
            return;
        }
        if(repCli.get(codename).getLimite() - repCli.get(codename).getBalance() < value) {
            System.out.println("fail: limite excedido");
            return;
        }
        else {
            pushTransaction(codename, value); 
            int x = repCli.get(codename).getBalance() + value; // atualiza o balance 
            repCli.get(codename).setBalance(x);
        }
    }

    public void receive(String codename, int value) {
        if (repCli.get(codename).getBalance() < value) {
            System.out.println("fail: valor maior que a divida");
            return;
        }
        else {
            int novoBalance = repCli.get(codename).getBalance() - value;
            repCli.get(codename).setBalance(novoBalance);
            pushTransaction(codename, value * (-1));
        }   
    }

    public String toString() {
        String resp = "clients:\n";
        for(String c : repCli.keySet()) {
            resp += repCli.get(c).toString();
        }
        resp += "transactions:\n";
        for(Transaction x : repTr.values()) {
            resp += x; 
        }
        resp += "balance: " + this.balance;

        return resp;
    }
}