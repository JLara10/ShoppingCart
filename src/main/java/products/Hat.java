package products;

public class Hat extends Clothing{
    private int inventory;

    public Hat(int ID, Size size, double price, String name, int inventory) {
        super(ID, size, price, name, inventory);
        this.inventory = inventory;
    }
}
