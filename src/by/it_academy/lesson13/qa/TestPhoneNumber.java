package by.it_academy.lesson13.qa;

import org.junit.Assert;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;


public class TestPhoneNumber extends Assert {

    @Test
    public void testPhoneNumber(){
        boolean result = Main.checkPhoneNumber("+3753()3765829+++3");
        assertTrue(result);
    }

    @Test
    public void testPhoneNumber2(){
        boolean result = Main.checkPhoneNumber("+3753()3gh15829+++3");
        assertFalse(result);
    }
    @Test
    public void testPhoneNumber3(){
        boolean result = true;
        try{
        result = Main.checkPhoneNumber(null);}
        catch (Exception e){
            result = false;
        }
        assertFalse(result);
    }

    @Rule
    public ExpectedException thrown = ExpectedException.none();

    @Test
    public void testPhoneNumber4(){
        thrown.expect(NullPointerException.class);
        Main.checkPhoneNumber(null);
    }
}
