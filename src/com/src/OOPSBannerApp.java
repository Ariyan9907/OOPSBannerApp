package com.src;

import java.util.HashMap;

public class OOPSBannerApp {

    public static HashMap<Character,String[]> createPattern(){
        HashMap<Character, String[]> map = new HashMap<Character,String[]>();
        map.put('o',getOPattern());
        map.put('p',getPPattern());
        map.put('s',getSPattern());

        return map;
    }


    public static String[] getOPattern() {
        return new String[]{
                " **** ",
                "*    *",
                "*    *",
                "*    *",
                " **** "
        };
    }

    public static String[] getPPattern() {
        return new String[]{
                "***** ",
                "*    *",
                "***** ",
                "*     ",
                "*     "
        };
    }

    public static String[] getSPattern() {
        return new String[]{
                " ****",
                "*    ",
                " *** ",
                "    *",
                "**** "
        };
    }

    public static void main(String[] args) {

        HashMap<Character, String[]> map = createPattern();
        String s="oops";

        for(int i=0;i<5;i++){
            StringBuilder line = new StringBuilder();
            for(Character ch:s.toCharArray()){
                line.append(map.get(ch)[i]);
                line.append(" ");
            }
            System.out.println(line);

        }
    }
}