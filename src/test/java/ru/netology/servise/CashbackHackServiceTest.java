package ru.netology.servise;

import org.testng.annotations.Test;

import static org.testng.AssertJUnit.assertEquals;

public class CashbackHackServiceTest {

    @Test
    public void AmountLessThan1000() {
        CashbackHackService service = new CashbackHackService();
        int amount = 900;
        int expect = 100;
        int actual = service.remain(amount);
        assertEquals(actual, expect);
    }

    @Test
    public void AmountMoreThan1000() {
        CashbackHackService service = new CashbackHackService();
        int amount = 1200;
        int expect = 800;
        int actual = service.remain(amount);
        assertEquals(actual, expect);
    }

    @Test
    public void Amount1000() {
        CashbackHackService service = new CashbackHackService();
        int amount = 1000;
        int expect = 0;
        int actual = service.remain(amount);
        assertEquals(actual, expect);
    }
}