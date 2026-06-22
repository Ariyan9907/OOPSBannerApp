package com.src;

public class OOPSBannerApp {
    static class CharacterPattern{
        private char charater;
        private String[] pattern;

        CharacterPattern(char charater,String[] pattern){
            this.charater=charater;
            this.pattern=pattern;
        }

        char getCharater(){
            return charater;
        }

        String[] getPattern(){
            return pattern;
        }
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

        CharacterPattern op=new CharacterPattern('o',getOPattern());
        CharacterPattern pp=new CharacterPattern('p',getPPattern());
        CharacterPattern sp=new CharacterPattern('s',getSPattern());

        String[] o = op.getPattern();
        String[] p = pp.getPattern();
        String[] s = sp.getPattern();

        for (int i = 0; i < o.length; i++) {
            System.out.println(
                            o[i] + "   " +
                            o[i] + "   " +
                            p[i] + "   " +
                            s[i]
            );
        }
    }
}