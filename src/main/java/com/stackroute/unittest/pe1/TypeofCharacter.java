package com.stackroute.unittest.pe1;

import java.util.Scanner;

public class TypeofCharacter {
    public String GuessingCharacter(char a) {
        String answer = "";

        Character a1 = a;

        if(a1.charValue() > 47 && a1.charValue() < 58) {
            answer = answer + "Integer";
        }
        else if(a1.charValue() > 64 && a1.charValue() < 91) {
            answer = answer + "Uppercase Letter";
        }
        else if(a1.charValue() > 96 && a1.charValue() < 123) {
            answer = answer + "Lowercase letter";
        }
        else {
            answer = answer + "Special character";
        }
        return answer;
    }
}
