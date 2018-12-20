package com.stackroute.unittest.pe1;

import org.junit.Test;

import static org.junit.Assert.*;

public class StringRepeatTest {

    @Test
    public void positivecheck() {
        StringRepeat s1 = new StringRepeat();

        String result = s1.stringrepeat("abhishek",2);

        assertEquals("abhishekek",result);
    }

    @Test
    public void negativecheck() {
        StringRepeat s1 = new StringRepeat();

        String result = s1.stringrepeat("abhishek",-2);

        assertEquals("enter non negative number",result);
    }

    @Test
    public void zerocheck() {
        StringRepeat s1 = new StringRepeat();

        String result = s1.stringrepeat("abhishek",0);

        assertEquals("abhishek",result);
    }


}
