package com.jv.basic.stream;

import com.jv.basic.com.jv.domain.Student;
import com.jv.basic.com.jv.domain.User;

import java.io.*;
import java.util.ArrayList;

public class ObjectStreamTest {
        public static void main(String[] args) throws Exception{

        ArrayList<Student> arr2= new ArrayList<Student>();
        ObjectInputStream in =
                new ObjectInputStream
                        (new FileInputStream("C:\\Users\\jl\\Desktop\\java需要阅读资料\\user2.txt"));

        arr2 = (ArrayList<Student>) in.readObject();
        System.out.println(arr2.get(0));
        in.close();


    }
    }

//    public static void main(String[] args) throws Exception {
//        ObjectOutputStream out =
//                new ObjectOutputStream
//                        (new FileOutputStream("C:\\Users\\jl\\Desktop\\java需要阅读资料\\user5.txt"));
//        ObjectOutputStream ob =
//                new ObjectOutputStream
//                        (new FileOutputStream("C:\\Users\\jl\\Desktop\\java需要阅读资料\\user4.txt"));
//
//        User u1 = new User("金威", 25);
//        User u2 = new User("蒋璐", 25);
//        ArrayList<User> arr = new ArrayList<>();
//        arr.add(u1);
//        arr.add(u2);
//        //FileOutputStream file = new FileOutputStream("Student.txt");
//        //ObjectOutputStream ob = new ObjectOutputStream(file);
//        out.writeObject(arr);
//    }





//    public static void main(String[] args) throws Exception{
//        ObjectOutputStream out =
//                new ObjectOutputStream
//                        (new FileOutputStream("C:\\Users\\jl\\Desktop\\java需要阅读资料\\user2.txt"));
//        Student u1 = new Student();
//        u1.setName("金威");
//        u1.setAge(25);
//        Student u2 = new Student();
//        u2.setName("蒋璐");
//        u2.setAge(24);
//        ArrayList<Student>arr = new ArrayList<>();
//        arr.add(u1);
//        arr.add(u2);
//
//        out.writeObject(out);
//        System.out.println("Users已序列化输出");
//        out.close();
////        ArrayList<Student> arr2= new ArrayList<Student>();
////        ObjectInputStream in =
////                new ObjectInputStream
////                        (new FileInputStream("C:\\Users\\jl\\Desktop\\java需要阅读资料\\user1.txt"));
////        arr2 = (ArrayList<Student>)in.readObject();
////        System.out.println(arr2.get(0));
////        System.out.println(arr2.get(1));
////        out.close();
//
//
//    }
//    }



