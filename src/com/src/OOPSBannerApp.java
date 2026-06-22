package com.src;

public class OOPSBannerApp {
    public static void main(String[] args) {
        String lines[]= {
                String.join("   ", " ***** ", " ***** ", "*******", " ******"),
        String.join("   ", "*     *", "*     *", "*      *", "*      "),
        String.join("   ", "*     *", "*     *", "*******", " ***** "),
        String.join("   ", "*     *", "*     *", "*      ", "      *"),
        String.join("   ", " ***** ", " ***** ", "*      ", "****** "),
        };
        for(String x:lines){
            System.out.println(x);
        }
    }
}
