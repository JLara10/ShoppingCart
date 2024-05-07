package products;

public class Soda extends Food implements Perishable{
    private int inventory;

    public Soda(int ID, Size size, double price, String name, int inventory, int inventory1) {
        super(ID, size, price, name, inventory);
        this.inventory = inventory1;
    }

    @Override
    public boolean isPerishable() {
        return true;
    }
}
