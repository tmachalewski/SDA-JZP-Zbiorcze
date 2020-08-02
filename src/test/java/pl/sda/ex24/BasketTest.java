package pl.sda.ex24;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.fail;

public class BasketTest {

    @Test
    public void shouldThrowBasketFullException(){
        Assertions.assertThrows(BasketFullException.class, () -> {
            Basket b = new Basket();
            b.addToBasket(); //1
            b.addToBasket(); //2
            b.addToBasket(); //3
            b.addToBasket(); //4
            b.addToBasket(); //5
            b.addToBasket(); //6
            b.addToBasket(); //7
            b.addToBasket(); //8
            b.addToBasket(); //9
            b.addToBasket(); //10
            b.addToBasket(); //11
        });
    }

    @Test
    public void shouldThrowBasketEmptyException(){
        Basket b = new Basket();
        b.addToBasket();
        try {
            b.removeFromBasket();
        } catch (BasketEmptyException e) {
            fail("There were items to remove");
        }
    }

    @Test
    public void shouldAcceoptTenItems(){
        Basket b = new Basket();
        b.addToBasket(); //1
        b.addToBasket(); //2
        b.addToBasket(); //3
        b.addToBasket(); //4
        b.addToBasket(); //5
        b.addToBasket(); //6
        b.addToBasket(); //7
        b.addToBasket(); //8
        b.addToBasket(); //9
        b.addToBasket(); //10
    }


}
