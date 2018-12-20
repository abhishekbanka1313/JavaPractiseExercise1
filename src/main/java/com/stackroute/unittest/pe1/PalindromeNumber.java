package com.stackroute.unittest.pe1;
import java.util.HashMap;
import java.util.InputMismatchException;
import java.util.Map;
import java.util.Scanner;
import  java.util.regex.*;
import java.io.*;
import java.util.Scanner.*;


public class PalindromeNumber {

    public String CheckPalindrome(int z) {
        String answer = "";
        int ev_sum = 0;
        int z1 = z;
        int reversed = 0;

        if(z < 0)
            return "enter a positive number";

        while(z != 0)
        {
            if((z%10)%2 == 0)
            {
                ev_sum = ev_sum + (z%10);
            }
            reversed = (reversed*10) + (z%10);
            z = z/10;
        }

        if(z1 == reversed)
        {
            answer = answer + "YES is a palindrome";
            if(ev_sum > 25)
                answer = answer + " sum of even is greater than 25";
            else
                answer = answer + " sum of even is lesser than 25";
        }

        else
            answer = answer + "NO is not a palindrome";

        return answer;
    }
}
