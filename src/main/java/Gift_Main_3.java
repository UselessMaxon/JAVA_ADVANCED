import gift.Cake;
import gift.Candy;
import gift.Gift;
import gift.Marshmallow;

public class Gift_Main_3 {

    public static void main(String[] args) {

        Candy candy1 = new Candy("Snickers", 200F, 100.45F, "black");

        Candy candy2 = new Candy();
        candy2.setName("Pop");
        candy2.setWeight(350);
        candy2.setPrice(249.99F);
        candy2.setColor("orange");

        Marshmallow marshmallow1 = new Marshmallow("Haribo",300F, 124.99F, "cylinder");

        Cake cake1 = new Cake("Gingerbread", 400F, 199.99F, "ginger");

        Gift box[] = {candy1, candy2, marshmallow1, cake1};

        float totalWeight = 0, totalPrice = 0;
        for (Gift someGift : box) {
            totalWeight += someGift.getWeight();
            totalPrice += someGift.getPrice();

            System.out.println(someGift.toString());
        }

        System.out.println("\nОбщий вес подарка: " + totalWeight + " грамм \nОбщая цена подарка: " + totalPrice + " руб.");
    }
}
