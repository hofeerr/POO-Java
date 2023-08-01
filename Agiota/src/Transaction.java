public class Transaction {
    private String codename;
    private int id;
    private int value;

    Transaction(int id, String codename, int value){
        this.id = id;
        this.codename = codename;
        this.value = value;
    }
    
    public String getCodename() {
        return codename;
    }

    public int getId() {
        return id;
    }

    public int getValue() {
        return value;
    }

    public void setCodename(String codename) {
        this.codename = codename;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setValue(int value) {
        this.value = value;
    }

    public String toString() {
        return "- id:" + getId() + " " + getCodename() + ":" + getValue() + "\n";
    }

}