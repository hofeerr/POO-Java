import java.text.DecimalFormat;

public class VendingMachine {
   private Slot[] slots;
   private float profit;
   private float cash;
   private int capacity;

   VendingMachine(int capacity) {
    this.capacity = capacity;
    this.cash = 0;
    this.slots = new Slot[this.capacity]; //criandos slots na máquina

    for(int i = 0; i < this.capacity; i++) {
        this.slots[i] = null; 
    }
   }

   Slot getSlot(int index) {
    if(this.slots[index] == null) {
        return null;
    }
    return this.slots[index];
    }

    public void setSlot(int index, Slot slot) { //
        this.slots[index] = slot;
    }

    public void clearSlot(int index) { // limpando index
        this.slots[index] = null;
    }

    public void insertCash(float cash) {
        this.cash += cash;
    }
    public float withdrawCash() {
        float value = this.cash;
        this.cash = 0;
        return value; 
    } 
    public float getCash() {
        return cash;
    }
    public float getProfit() {  // valor apurado de vendas
        return profit;
    }

    public void buySnack(int index) {
        if(this.cash >= this.slots[index].getPrice()) {
            if(this.slots[index].getQuantity() > 0) {
                this.slots[index].setQuantity(this.slots[index].getQuantity() -1);
                this.cash -= this.slots[index].getPrice();
                System.out.println("voce comprou um " + slots[index].getName());
            }
            else {
                System.out.println("fail espiral sem produtos");
            }
        }
        else {
            System.out.println("fail: saldo insuficiente");
        }
    }

    public String toString() {
        DecimalFormat value = new DecimalFormat("0.00");
        String cash = value.format(this.cash);
        String ret = "saldo: " +  cash + "\n";
        // for(Slot i : slots) {       
        for(int i = 0; i < this.capacity; i++) {
            ret += i + " ";
            if (slots[i] == null) {
                if(i <= this.capacity - 2) {
                    ret += "[   empty : 0 U : 0.00 RS]\n";
                }
                else {
                    ret += "[   empty : 0 U : 0.00 RS]";
                }
            }
            else {
                if(i <= this.capacity -2) {
                    ret += slots[i].toString() + "\n";
                }
                else {
                    ret += slots[i].toString();
                }
            }
        }
    return ret;
    }
}
