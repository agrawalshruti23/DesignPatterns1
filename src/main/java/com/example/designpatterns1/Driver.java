package com.example.designpatterns1;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.lang.reflect.Constructor;

public class Driver {
    public static void main(String[] args) throws Exception, CloneNotSupportedException {

        Singleton obj = Singleton.getInstance();
        System.out.println(obj.hashCode());

        //breaking using Reflection API

        /*
        //method1
        Constructor<Singleton> constructor = Singleton.class.getDeclaredConstructor();
        constructor.setAccessible(true);
        Singleton obj2 = constructor.newInstance();

        //        Singleton obj2 = Singleton.getInstance();
        System.out.println(obj2.hashCode());

        //method2
        //using enum
        Samosa s1 = Samosa.INSTANCE;
        System.out.println(s1.hashCode());

        Constructor<Samosa> constructor1 = Samosa.class.getDeclaredConstructor();
        constructor1.setAccessible(true);
        Samosa s2 = constructor1.newInstance();
        System.out.println(s2.hashCode());
        */


        //Using serialization we can break singleton Design pattern
        /*Singleton obj2 = Singleton.getInstance();
        ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("abc.ob"));
        oos.writeObject(obj2);
        System.out.println("serialization done");

        ObjectInputStream ois = new ObjectInputStream(new FileInputStream("abc.ob"));
        Singleton obj3 = (Singleton) ois.readObject();
        System.out.println(obj3.hashCode());*/

        Singleton s2 = (Singleton) obj.clone();
        System.out.println(s2.hashCode());


    }
}
