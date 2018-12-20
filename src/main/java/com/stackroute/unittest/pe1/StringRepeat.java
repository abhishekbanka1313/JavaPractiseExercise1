package com.stackroute.unittest.pe1;

public class StringRepeat {
    public String stringrepeat(String s, int n) {
        String answer = "";
        if(n < 0)
            return "enter non negative number";
        answer = answer + s;
        int n1 = n;
        for(int i = 1; i < n; i++)
        {
            answer = answer + s.substring(s.length()-n1,s.length());
        }
        return answer;
    }
}
