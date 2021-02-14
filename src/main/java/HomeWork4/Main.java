package HomeWork4;


import HomeWork4.NewYearGift.*;
import HomeWork4.ReplaceArray.ReplaceArray;


/**
 * @author Alexander Krasnov
 * @see ReplaceArray for more information about Task1
 * @see GiftBox for more about Task2
 */
public class Main {
    public static void main(String[] args) {
        new ReplaceArray();

        GiftBox giftBox = new GiftBox("Gift for sister");
        giftBox.addGift(new Candy("Candy1",20,50,"Apple"));
        giftBox.addGift(new Marshmallow("Marshmallow1",50,100,"Banana"));
        giftBox.addGift(new JellyBean("JellyBean1",38.8,30,"Red"));
        giftBox.getInfoAboutGifts();
        giftBox.getTotalWeight();
        giftBox.getTotalPrice();
    }


}

