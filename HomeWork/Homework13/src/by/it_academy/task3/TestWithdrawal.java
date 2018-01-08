package by.it_academy.task3;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class TestWithdrawal extends Assert {
    Manager manager = new Manager();
    Atm atm;
    @Before
    public void before(){
        atm = new Atm();
        atm.setNum20(10);
        atm.setNum50(10);
        atm.setNum100(10);
    }

    @Test
    public void test1(){
        manager.withdrawal(atm,1070);
        boolean check = atm.getNum100()==0&&atm.getNum50()==9&&atm.getNum20()==9;
        assertTrue(check);
    }

    @Test
    public void test2(){
        manager.withdrawal(atm,1110);
        boolean check = atm.getNum100()==0&&atm.getNum50()==9&&atm.getNum20()==7;
        assertTrue(check);
    }

    @Test
    public void test3(){
        manager.withdrawal(atm,1700);
        boolean check = atm.getNum100()==0&&atm.getNum50()==0&&atm.getNum20()==0;
        assertTrue(check);
    }
}
