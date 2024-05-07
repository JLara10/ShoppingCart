package products;

public class Main {
    public static void main(String[] args) {
        User juan = new User();

        Product hat = new Hat(1, Size.S, 2.00, "Snapback", 5);
        Product shirt = new Shirt(2, Size.M, 25.00, "T-shirt", 10);

        juan.addToCart(hat, 3);
        juan.addToCart(shirt, 5);
        juan.removeFromCart(hat, 2);
        System.out.println(juan.getCart().getProducts());
        System.out.println(juan.getCart().cartQty());
        System.out.println(juan.getCart().subTotal());
        System.out.println(juan.getCart().totalAfterTax());
        juan.getCart().checkOut();
        juan.getCart().checkSaleDay(Special.FRI);
        Food fries = new Fries(1, Size.L, 6.00, "French Fries", 15);
        System.out.println(fries.isPerishable());
    }
}
