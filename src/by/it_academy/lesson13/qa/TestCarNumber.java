package by.it_academy.lesson13.qa;

import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class TestCarNumber extends Assert {

    Main main;

    @Before
    public void before(){
       main = new Main();
    }

    @After
    public void after(){
        main = null;
        System.out.println("Всё хорошо");
    }


    @Test
    public void testCarNumber(){
        boolean result = Main.checkCarNumber("6511 IY-4");
        assertTrue(result);
    }
    @Test
    public void testCarNumber2(){
        boolean result = Main.checkCarNumber("6111 IY-7");
        assertTrue(result);
    }
    @Test
    public void testCarNumber3(){
        boolean result = Main.checkCarNumber("6511 32-4");
        assertFalse(result);
    }

}
