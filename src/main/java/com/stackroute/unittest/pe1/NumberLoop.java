package com.stackroute.unittest.pe1;
import java.util.HashMap;
import java.util.InputMismatchException;
import java.util.Map;
import java.util.Scanner;
import  java.util.regex.*;
import java.io.*;
import java.util.Scanner.*;

public class NumberLoop {
    public String loopnumber(int a) {
        String answer = "";
        int a1 = 0;

        try {
            a1 = a;
        }
        catch (InputMismatchException e) {
            System.out.println("Enter positive integer");
        }
        if(a1 <= 0)
            return "enter a positive number";

        for(int i = 1; i <= a; i++) {
            for(int j = 1; j <= i; j++)
                answer = answer + Integer.toString(i);
        }

        return answer;
    }
}
