package products;

public class Food extends Product implements Perishable{
    public Food(int ID, Size size, double price, String name, int inventory) {
        super(ID, size, price, name, inventory);
    }

    @Override
    public boolean isPerishable() {
        return true;
    }
}
