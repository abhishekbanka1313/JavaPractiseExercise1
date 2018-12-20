package com.stackroute.unittest.pe1;

import java.util.*;

public class SortedNumberSum {
    public String SortedNumberEven(String A) {
        String input = "";
        int sumtocheck = 0;
        input = A;
        String output = "";
        List<Integer> l1 = new ArrayList<Integer>();
        for(int i = 0; i < input.length(); i++) {
            Character temporary = input.charAt(i);
            int value = Character.getNumericValue(temporary);
            if(value%2 == 0)
                sumtocheck = sumtocheck + value;
            l1.add(value);
        }
        Collections.sort(l1,Collections.<Integer>reverseOrder());


        for(int i = 0; i < l1.size(); i++) {
            output = output + Integer.toString(l1.get(i));
        }

        output = output + "Sum of even numbers :"+sumtocheck;
        if(sumtocheck > 15)
            output = output + "True";
        else
            output = output + "False";

        return output;
    }
}
