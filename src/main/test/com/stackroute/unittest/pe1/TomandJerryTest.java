package com.stackroute.unittest.pe1;

import org.junit.Test;

import static org.junit.Assert.*;

import java.util.Scanner;

public class TomandJerryTest {

    @Test
    public void JerryTest() {
        //Arrange
        TomandJerry t1 = new TomandJerry();
        //Act
        String result =  t1.TomorJerry(24);
        //Assert
        assertEquals("Jerry",result);

    }

    @Test
    public void TomTest() {

        TomandJerry t1 = new TomandJerry();

        String result1 =  t1.TomorJerry(23);

        assertEquals("Tom",result1);

    }

    @Test
    public void OutofBoundTest() {

        TomandJerry t1 = new TomandJerry();

        Scanner sc = new Scanner("34");

        String result = t1.TomorJerry(sc.nextInt());

        assertEquals("index out of range",result);
    }

    @Test
    public void Typetest() {
        TomandJerry t1 = new TomandJerry();

        Scanner sc = new Scanner("hello");

        String result = t1.TomorJerry(sc.nextInt());

        assertEquals("data type not match",result);

    }

}
