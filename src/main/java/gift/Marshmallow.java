package gift;

public class Marshmallow extends Gift {

    private String shape;

    public Marshmallow() {}

    public Marshmallow(String name, float weight, float price, String shape) {
        super(name, weight, price);
        this.shape = shape;
    }

    public String getShape() {
        return shape;
    }

    public void setShape(String shape) {
        this.shape = shape;
    }

    @Override
    public String toString() {
        return "Marshmallow [" + super.toString() + ", shape = " + shape + "]";
    }
}
