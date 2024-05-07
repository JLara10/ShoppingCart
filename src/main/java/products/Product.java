package products;

public abstract class Product {
    private final int ID;
    private static int sharedID;
    private Size size;
    private double price;
    private String name;
    private int inventory;

    public Product(int ID, Size size, double price, String name, int inventory) {
        this.ID = ID;
        this.size = size;
        this.price = price;
        this.name = name;
        this.inventory = inventory;
    }

    public int getID() {
        return ID;
    }

    public static void setSharedID(int sharedID) {
        Product.sharedID = sharedID;
    }

    public Size getSize() {
        return size;
    }

    public void setSize(Size size) {
        this.size = size;
    }

    public static int getSharedID() {
        return sharedID;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public int getInventory() {
        return inventory;
    }

    public void setInventory(int inventory) {
        this.inventory = inventory;
    }

    @Override
    public String toString() {
        return "Product {" +
                " Size= " + size +
                ", Price= " + price +
                ", Name= " + name +
                '}';
    }
}
