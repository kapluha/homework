/**
 * Created by Anry on 23.03.2015.
 */
public class TestShirt2 {
    public static void main(String[] args){
        Shirt myBlueShirt = new Shirt();
        Shirt.quantityInStock = 10;

        Shirt myRedShirt = new Shirt();
        myRedShirt.quantityInStock = 20;

        System.out.println("We have "+ myBlueShirt.quantityInStock + "shirt");
        System.out.println("We have "+ Shirt.quantityInStock + "shirt");
        System.out.println("We have "+ myRedShirt.quantityInStock + "shirt");
        char mySize = Shirt.convertShirtSize(36);
        System.out.println(mySize);
    }

}
