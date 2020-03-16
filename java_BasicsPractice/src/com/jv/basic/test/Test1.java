package com.jv.basic.test;

import java.util.*;
public class Test1{
    public static void main(String[] args)
    {
        //String str = null;
        Scanner sc = new Scanner(System.in);
        while(sc.hasNext())
        {

            String str = sc.nextLine();
            List<String> strs2 =Arrays.asList(str.split(","));
            //List<String> strs2 = new ArrayList<String>(strs1);
            System.out.println(strs2);
            //String[] strs = str.split(",");
            byte max =0;
            String out = "";
            int index = 0;
            int length = strs2.size();
            System.out.println(strs2.size());
            for(int i = 0;i<length;i++)
            {
                max = 0;
            for(int j =0;j<strs2.size();j++)
            {

                //chs[i] = strs[i][strs[i].length()];
                byte temp = (byte)strs2.get(j).charAt(strs2.get(j).length()-1);
                if (temp>max)
                {
                max = temp;
                out = strs2.get(j);
                index = j;
                }
            }
            if(i==length-1)
            {
               System.out.print(out);
            }
          else
            {
                System.out.print(out+",");
            }
                //System.out.println(i);
            strs2.remove(index);
            }

        }


    }

}