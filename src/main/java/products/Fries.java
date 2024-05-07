package products;

public class Fries extends Food implements Perishable{
    private int inventory;

    public Fries(int ID, Size size, double price, String name, int inventory) {
        super(ID, size, price, name, inventory);
        this.inventory = inventory;
    }

    @Override
    public boolean isPerishable(){
        return true;
    }
}
