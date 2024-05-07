package products;

public class Sweater extends Clothing {
    private int inventory;

    public Sweater(int ID, Size size, double price, String name, int inventory) {
        super(ID, size, price, name, inventory);
        this.inventory = inventory;
    }
}
