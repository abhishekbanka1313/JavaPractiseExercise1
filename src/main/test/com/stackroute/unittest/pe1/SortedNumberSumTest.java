package com.stackroute.unittest.pe1;

import org.junit.Test;
import static org.junit.Assert.*;

public class SortedNumberSumTest {

    @Test
    public void CheckingForFalse() {
        SortedNumberSum s1 = new SortedNumberSum();

        String result = s1.SortedNumberEven("234534");

        assertEquals("544332Sum of even numbers :10False",result);
    }

    @Test
    public void CheckingForTrue() {
        SortedNumberSum s1 = new SortedNumberSum();

        String result = s1.SortedNumberEven("234534888");

        assertEquals("888544332Sum of even numbers :34True",result);
    }
}
