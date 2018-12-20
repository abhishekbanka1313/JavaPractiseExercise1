package com.stackroute.unittest.pe1;

public class GuessNumber {
    public String GuessTheNumber(int original,int guessed) {
        String output = "";

        if(original < guessed) {
            output = output + "The number guessed is greater";
        }
        else if(original > guessed) {
            output = output + "The number guessed is lesser";
        }
        else {
            output = output + "Congrats , you guessed the correct number";
        }

        return output;
    }
}
