package com.example.levitin.calculapp;

public class Calc {
    static String execute(double lastNum, double nextNum, String operation)
    {

        switch(operation) {
            case "+": {
                return String.valueOf((lastNum + nextNum));
            }
            case "-":{
                return String.valueOf((lastNum - nextNum));
            }
            case "*":{
                return String.valueOf((lastNum * nextNum));
            }
            case "/":{
                return String.valueOf((lastNum / nextNum));
            }
            default : return "";
        }

    }
}
