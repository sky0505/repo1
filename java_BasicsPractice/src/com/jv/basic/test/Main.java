package com.jv.basic.test;

import java.util.*;
public class Main {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        while(sc.hasNextLine()){
            System.out.println(transfer(sc.nextLine()));
        }


    }

    public static String transfer(String str) {
        StringBuffer strbuff = new StringBuffer();
        for (int i = 0; i < str.length(); i++) {
            char b = str.charAt(i);
            if (b >= 'a' && b <= 'c')
                b = '2';
            if (b >= 'd' && b <= 'f')
                b = '3';
            if (b >= 'g' && b <= 'i')
                b = '4';
            if (b >= 'j' && b <= 'l')
                b = '5';
            if (b >= 'm' && b <= 'o')
                b = '6';
            if (b >= 'p' && b <= 's')
                b = '7';
            if (b >= 't' && b <= 'v')
                b = '8';
            if (b >= 'x' && b <= 'z')
                b = '9';
            if (b >= 'A' && b <= 'Y')
                b= (char)((Integer.valueOf(Character.toLowerCase(b)))+1);

            if (b =='z')
                b = 'a';
            strbuff.append(b);
        }
        return strbuff.toString();
    }
}





