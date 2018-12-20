package com.stackroute.unittest.pe1;

import java.util.HashMap;
import java.util.InputMismatchException;
import java.util.Map;
import  java.util.regex.*;
import java.io.*;
import java.util.Scanner.*;


public class TomandJerry {
    public String TomorJerry(int a) throws InputMismatchException{

        int a1 = 0;
        String ans = "";
        try {
            a1 = a;
        }
        catch(InputMismatchException e) {
            throw new InputMismatchException("data type not match");
        }


        if(a1 <20 || a1 > 30)
            ans = "index out of range";
        else if(a1 >= 20 && a1 <= 30)
        {
            if(a1%2 == 1)
                ans = "Tom";
            else
                ans = "Jerry";
        }

        return ans;
    }
}
