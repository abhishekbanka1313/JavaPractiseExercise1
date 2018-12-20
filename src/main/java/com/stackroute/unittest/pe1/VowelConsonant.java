package com.stackroute.unittest.pe1;

import java.util.*;
import java.util.HashMap;
import java.util.InputMismatchException;
import java.util.Map;
import  java.util.regex.*;
import java.io.*;
import java.util.Scanner.*;


public class VowelConsonant {
    public String vowelconsonant(String input) {
        String answer = "";
        for (int i = 0; i < input.length(); i++) {
            if (input.charAt(i) < 'a') {
                answer = answer + "Not a letter";
                continue;
            }
            switch (input.charAt(i)) {
                case 'a':
                    answer = answer + "Vowel";
                    break;
                case 'e':
                    answer = answer + "Vowel";
                    break;
                case 'i':
                    answer = answer + "Vowel";
                    break;
                case 'o':
                    answer = answer + "Vowel";
                    break;
                case 'u':
                    answer = answer + "Vowel";
                    break;
                case 'A':
                    System.out.println("Vowel");
                    break;
                case 'E':
                    answer = answer + "Vowel";
                    break;
                case 'I':
                    answer = answer + "Vowel";
                    break;
                case 'O':
                    answer = answer + "Vowel";
                    break;
                case 'U':
                    answer = answer + "Vowel";
                    break;
                default:
                    answer = answer + "Consonant";
                    break;

            }
        }
        return answer;
    }
}

