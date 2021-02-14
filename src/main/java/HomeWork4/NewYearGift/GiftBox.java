package HomeWork4.NewYearGift;

import java.util.ArrayList;
import java.util.List;

/**
 * @author Alexander Krasnov
 * @see Gifts abstract class for more info
 */
public class GiftBox {
    private String name;
    private List<Gifts> gifts;

    public GiftBox(String name) {
        this.name = name;
        gifts = new ArrayList<>();
    }

    public void addGift(Gifts gift) {
        gifts.add(gift);
    }

    public void getTotalWeight() {
        double weight = 0;
        for (Gifts gift : gifts) {
            weight += gift.getWeight();
        }
        System.out.println("Total weight of the giftBox '" + name + "' is " + weight + " gr");
    }

    public void getTotalPrice() {
        int price = 0;
        for (Gifts gift : gifts) {
            price += gift.getPrice();
        }
        System.out.println("Total price of the giftBox '" + name + "' is " + price + " rub");
    }

    public void getInfoAboutGifts() {
        int count = 0;
        System.out.println("\n******************\nThese giftBox with name '" + name + "' is consist of : \n");
        for (Gifts gift : gifts) {
            count++;
            System.out.println(count + ") " + gift.toString());
        }
        System.out.println("******************");
    }
}
