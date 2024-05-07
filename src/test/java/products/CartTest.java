package products;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CartTest {

    @Test
    void subTotalTest() {
            double expected = 50.00;
            Product hat = new Hat(1, Size.M, 5.00, "baseball cap", 15);
            User user = new User();
            user.addToCart(hat, 10);
            double actual = user.getCart().subTotal();
            Assertions.assertEquals(expected, actual);

    }
}