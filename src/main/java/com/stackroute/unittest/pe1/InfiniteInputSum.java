package com.stackroute.unittest.pe1;

public class InfiniteInputSum {

    public int SumofNumbers(String a) {
        String result = "";

        String[] tokens = a.split(" ");
        int count = 0;
        for(String input: tokens) {
            count = count + Integer.parseInt(input);
        }
        return count;
    }
}
