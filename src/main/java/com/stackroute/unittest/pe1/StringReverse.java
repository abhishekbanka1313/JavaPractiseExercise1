package com.stackroute.unittest.pe1;

public class StringReverse {
    public String stringrevrse(String s) {
        String s2 = "";
        for(int i = 0; i < s.length(); i++)
            s2 = s2 + s.substring(s.length()-(i+1),s.length()-(i));
        //System.out.println(s2);
        return s2;
    }
}
