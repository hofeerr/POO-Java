import java.text.DecimalFormat;

public class Slot {
    private String name;
    private float price;
    private int quantity;

    Slot(String name, int quantity, float price) {
        this.name = name;
        this.price = price;
        this.quantity = quantity;
    }

    public String getName() {
        return name;
    }

    public int getQuantity() {
        return quantity;
    }

    public float getPrice() {
        return price;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public void setPrice(float price) {
        this.price = price;
    }

    public String toString() {
        String ret = "";
        DecimalFormat value = new DecimalFormat("0.00");
        String price = value.format(this.price);
        ret += "[ " + getName() + " : " + getQuantity() + " U" + " : " + price + " RS]";
        return ret;
    }
}