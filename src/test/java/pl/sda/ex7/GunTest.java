package pl.sda.ex7;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class GunTest {

    @Test
    public void shouldAllowSpecifiedNumberOfBullets(){
        Gun gun = new Gun(2);
        boolean bulletLoadedSuccesfully;
        bulletLoadedSuccesfully = gun.loadBullet("1");
        assertEquals(true, bulletLoadedSuccesfully, "1st bullet should be loaded");
        bulletLoadedSuccesfully = gun.loadBullet("2");
        assertEquals(true, bulletLoadedSuccesfully, "2nd bullet should be loaded");
        bulletLoadedSuccesfully = gun.loadBullet("3");
        assertEquals(false, bulletLoadedSuccesfully, "3rd bullet wont be loaded because it is over limit");
    }

    @Test
    public void showcase(){
        Gun gun = new Gun(2);
        System.out.println(gun.loadBullet("1"));
        System.out.println(gun.loadBullet("2"));
        System.out.println(gun.loadBullet("3"));

        gun.shoot();
        gun.shoot();
        gun.shoot();

    }
}
