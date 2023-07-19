package ru.netology;

import org.testng.annotations.Test;

import static org.testng.Assert.*;

public class CashbackHackServiceTest {


    @Test
    public void testRemain() {
        CashbackHackService service = new CashbackHackService();
        int amount = 800;
        int expected = 200;
        int actual = service.remain(amount);
       assertEquals(actual, expected);
    }
    @Test
    public void testRemain1() {
        CashbackHackService service = new CashbackHackService();
        int amount = 1000;
        int expected = 0;
        int actual = service.remain(amount);
        assertEquals(actual, expected);
    }
}