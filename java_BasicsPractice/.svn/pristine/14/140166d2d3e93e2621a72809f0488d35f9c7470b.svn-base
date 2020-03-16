package com.jv.basic.Integer;

public class IntegerTest {

    public static void main(String[] args) {
        IntegerTest it = new IntegerTest();
        int result1 = 0;
        result1 = it.findAllOne(1);
        System.out.println(result1);
        //System.out.println(it.findNumberOfOne(1));
    }


    public int findAllOne(int n){

        int result = 0;
        for (int i = 0; i <=n; i++) {
            result = result + findNumberOfOne(i);
            //System.out.println(findNumberOfOne(i));
           //System.out.println(result);
        }
        return result;
    }
    public int findNumberOfOne(int n){

        String s = Integer.toString(n);
        char[] chars = s.toCharArray();
        int result = 0;
        for(int i = 0;i<chars.length;i++){
            if(chars[i]=='1')
                result++;
        }
        return result;

    }
}
