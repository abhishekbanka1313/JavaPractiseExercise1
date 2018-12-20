package com.stackroute.unittest.pe1;

import org.junit.Test;

import static org.junit.Assert.*;

import java.util.Scanner;

public class NumberLoopTest {

    @Test
    public void InputTest() {
        NumberLoop n1 =  new NumberLoop();
        Scanner sc = new Scanner("a");
        String result = n1.loopnumber(sc.nextInt());

        assertEquals("damn",result);
    }

    @Test
    public void PositiveNumber() {
        NumberLoop n1 = new NumberLoop();

        String result = n1.loopnumber(2);

        assertEquals("122",result);
    }

    @Test
    public void NonPositiveNumber() {
        NumberLoop n1 = new NumberLoop();

        String result = n1.loopnumber(-1);

        assertEquals("enter a positive number",result);
    }

}
