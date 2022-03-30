package gift;

public class Cake extends Gift {

    private String filling;

    public Cake() {}

    public Cake(String name, float weight, float price, String filling) {
        super(name, weight, price);
        this.filling = filling;
    }

    public String getFilling() {
        return filling;
    }

    public void setFilling(String filling) {
        this.filling = filling;
    }

    @Override
    public String toString() {
        return "Cake [" + super.toString() + ", filling = " + filling + "]";

    }
}
