package products;

public class Shirt extends Clothing{
    private int inventory;

    public Shirt(int ID, Size size, double price, String name, int inventory) {
        super(ID, size, price, name, inventory);
        this.inventory = inventory;
    }
}
