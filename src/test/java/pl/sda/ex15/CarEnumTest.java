package pl.sda.ex15;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class CarEnumTest {
    @Test
    public void isFasterThanShouldWorkCorrectly(){
        CarEnum ce1 = CarEnum.BMW;
        CarEnum ce2 = CarEnum.OPEL;

        assertEquals(true, ce1.isFasterThan(ce2));
        assertEquals(false, ce2.isFasterThan(ce1));

    }
}
