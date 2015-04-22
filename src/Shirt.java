public class Shirt {
    public int shirtID = 0;
    public String description = "-description-";

    public char colorCode = 'U';
    public double price = 0.0;
    public static int quantityInStock = 0;

    public void displayShirtInformation(){
        int localVariable = 0;
        System.out.println("Shirt ID:" + shirtID);
        System.out.println("Shirt description:" + description);
        System.out.println("Color Code: " + colorCode);
        System.out.println("Shirt price: " + price);
        System.out.println("Quantity in Stock: " + quantityInStock);
    }

    public static char convertShirtSize(int numericalSize){
        if (numericalSize < 10) {
            return 'S';
        } else if (numericalSize <14){
            return 'M';
        } else if (numericalSize<18){
            return 'L';
        } else {
            return 'X';
        }
    }
}