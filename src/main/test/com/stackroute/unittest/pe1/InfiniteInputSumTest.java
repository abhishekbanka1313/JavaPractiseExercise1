package com.stackroute.unittest.pe1;

import org.junit.Test;
import static org.junit.Assert.*;

public class InfiniteInputSumTest {

    @Test
    public void CheckforNormalInput() {
        InfiniteInputSum i1 = new InfiniteInputSum();

        int result = i1.SumofNumbers("1 3 5 7");

        assertEquals(16,result);
    }

    @Test
    public void CheckforNegativeInput() {
        InfiniteInputSum i1 = new InfiniteInputSum();

        int result = i1.SumofNumbers("1 -3 -5 7");

        assertEquals(0,result);
    }
}
