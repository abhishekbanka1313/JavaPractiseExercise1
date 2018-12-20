package com.stackroute.unittest.pe1;

import org.junit.Test;

import static org.junit.Assert.*;

import java.util.Scanner;

public class PalindromeNumberTest {

    @Test
    public void Positive25Greater() {
        PalindromeNumber p1 = new PalindromeNumber();

        String result = p1.CheckPalindrome(88488);

        assertEquals("YES is a palindrome sum of even is greater than 25",result);
    }

    @Test
    public void Positive25Lesser() {
        PalindromeNumber p1 = new PalindromeNumber();

        String result = p1.CheckPalindrome(848);

        assertEquals("YES is a palindrome sum of even is lesser than 25",result);
    }

    @Test
    public void Negative() {
        PalindromeNumber p1 = new PalindromeNumber();

        String result = p1.CheckPalindrome(-25);

        assertEquals("enter a positive number",result);
    }

    @Test
    public void NotaPalindrome() {
        PalindromeNumber p1 = new PalindromeNumber();

        String result = p1.CheckPalindrome(2422);

        assertEquals("NO is not a palindrome",result);
    }
}
