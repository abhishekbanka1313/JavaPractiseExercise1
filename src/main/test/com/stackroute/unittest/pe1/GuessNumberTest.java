package com.stackroute.unittest.pe1;


import org.junit.Test;
import static org.junit.Assert.*;

public class GuessNumberTest {

    @Test
    public void CheckingforGreaterNumber() {
        GuessNumber g1 = new GuessNumber();

        String result = g1.GuessTheNumber(2,4);

        assertEquals("The number guessed is greater",result);
    }

    @Test
    public void CheckingforLesserNumber() {
        GuessNumber g1 = new GuessNumber();

        String result = g1.GuessTheNumber(2,1);

        assertEquals("The number guessed is lesser",result);
    }

    @Test
    public void CheckingforEqualNumber() {
        GuessNumber g1 = new GuessNumber();

        String result = g1.GuessTheNumber(2,2);

        assertEquals("Congrats , you guessed the correct number",result);
    }
}
