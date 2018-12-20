package com.stackroute.unittest.pe1;

import org.junit.Test;
import static org.junit.Assert.*;

public class VowelConsonantTest {

    @Test
    public void normaltest() {
        VowelConsonant v1 = new VowelConsonant();

        String result = v1.vowelconsonant("aeiou");

        assertEquals("VowelVowelVowelVowelVowel",result);
    }

    @Test
    public void Consonanttest() {
        VowelConsonant v1 = new VowelConsonant();

        String result = v1.vowelconsonant("bcdf");

        assertEquals("ConsonantConsonantConsonantConsonant",result);
    }

    @Test
    public void numbertest() {
        VowelConsonant v1 = new VowelConsonant();

        String result = v1.vowelconsonant("1@!23");

        assertEquals("Not a letterNot a letterNot a letterNot a letterNot a letter",result);
    }
}
