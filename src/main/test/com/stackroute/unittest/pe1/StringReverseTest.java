package com.stackroute.unittest.pe1;

import org.junit.Test;
import static org.junit.Assert.*;

public class StringReverseTest {
    @Test
    public void TestingReverse() {
        StringReverse s1 = new StringReverse();

        String result = s1.stringrevrse("abhishek");

        assertEquals("kehsihba",result);
    }

    @Test
    public void TestingReverseWithSpecialCharacters() {
        StringReverse s1 = new StringReverse();

        String result = s1.stringrevrse("abhi@567");

        assertEquals("765@ihba",result);
    }
}
