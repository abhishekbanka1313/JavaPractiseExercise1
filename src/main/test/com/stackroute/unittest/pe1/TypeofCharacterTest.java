package com.stackroute.unittest.pe1;

import org.junit.Test;
import static org.junit.Assert.*;

public class TypeofCharacterTest {
    @Test
    public void CheckingforLowerCaseAlphabet() {

        TypeofCharacter t1 = new TypeofCharacter();

        String result = t1.GuessingCharacter('a');

        assertEquals("Lowercase letter",result);
    }

    @Test
    public void CheckingforUpperCaseAlphabet() {

        TypeofCharacter t1 = new TypeofCharacter();

        String result = t1.GuessingCharacter('A');

        assertEquals("Uppercase Letter",result);
    }

    @Test
    public void CheckingforSpecialCharacter() {

        TypeofCharacter t1 = new TypeofCharacter();

        String result = t1.GuessingCharacter('@');

        assertEquals("Special character",result);
    }

    @Test
    public void CheckingforInteger() {

        TypeofCharacter t1 = new TypeofCharacter();

        String result = t1.GuessingCharacter('4');

        assertEquals("Integer",result);
    }
}
