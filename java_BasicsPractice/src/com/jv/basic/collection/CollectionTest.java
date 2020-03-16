package com.jv.basic.collection;

import com.jv.basic.com.jv.domain.User;

import java.util.*;

public class CollectionTest {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<Integer>();
        list.add(11);
        list.add(22);
        list.add(33);
        Collections.addAll(list,55,66,77);
        for (Integer i:list)
            System.out.println(i);


//        Iterator<Integer> it = list.iterator();
//        while(it.hasNext()){
//            System.out.println(it.next());

//        HashSet<Integer> set = new HashSet<>();
//        set.add(55);
//        set.add(66);
//        set.add(55);
//        for (Integer i :set)
//            System.out.println(i);

        User u1 = new User("科比", 40);
        User u2 = new User("詹姆斯", 36);
        User u3 = new User("科比", 40);

        HashSet<User> set = new HashSet<>();
        set.add(u1);
        set.add(u2);
        set.add(u3);
        for (User i :set)
            System.out.println(i);



    }
}
