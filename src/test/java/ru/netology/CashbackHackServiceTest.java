package ru.netology;

import org.testng.annotations.Test;
import org.testng.Assert;

public class CashbackHackServiceTest {

    //Для amount=0 остаток будет 1000
    @Test
    public void shouldRemainWhenAmountZero() {
        CashbackHackService service = new CashbackHackService();
        int actual = service.remain(0);
        int expected = 1000;
        Assert.assertEquals(actual, expected);
    }

    //Для amount=500 остаток будет 500
    @Test
    public void shouldRemainWhenAmountLessBoundary() {
        CashbackHackService service = new CashbackHackService();
        int actual = service.remain(500);
        int expected = 500;
        Assert.assertEquals(actual, expected);
    }

    //Для amount=1000 остаток будет 0
    @Test
    public void shouldRemainWhenAmountEqualsBoundary() {
        CashbackHackService service = new CashbackHackService();
        int actual = service.remain(1000);
        int expected = 0;
        Assert.assertEquals(actual, expected);
    }

    //Для amount=1500 остаток будет 500
    @Test
    public void shouldRemainWhenAmountGreaterBoundary() {
        CashbackHackService service = new CashbackHackService();
        int actual = service.remain(1500);
        int expected = 500;
        Assert.assertEquals(actual, expected);
    }
}
