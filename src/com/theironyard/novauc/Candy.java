kpackage com.theironyard.novauc;

/**
 * Created by jerieshasmith on 2/7/17.
 */
public class Candy {
String flavor;
int amount;
String name;
String company;
boolean isSweet;

    public String getFlavor() {
        return flavor;
    }

    public void setFlavor(String flavor) {
        this.flavor = flavor;
    }

    public int getAmount() {
        return amount;
    }

    public void setAmount(int amount) {
        this.amount = amount;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCompany() {
        return company;
    }

    public void setCompany(String company) {
        this.company = company;
    }

    public boolean isSweet() {
        return isSweet;
    }

    public void setSweet(boolean sweet) {
        isSweet = sweet;
    }

    public Candy(String flavor, int amount, String name, String company, boolean isSweet) {
        this.flavor = flavor;
        this.amount = amount;
        this.name = name;
        this.company = company;
        this.isSweet = isSweet;
    }
}
}
