package com.example.designpatterns1;

import java.io.ObjectInputStream;
import java.io.Serializable;

public class Singleton implements Serializable, Cloneable {

    private static Singleton instance;
    private Singleton(){
        //to not break singleton pattern by Reflection API
        if(instance != null){
            throw new RuntimeException("You are trying to break Singleton Pattern");
        }
    }
    public  static Singleton getInstance(){
        synchronized(Singleton.class){
            if(instance == null){
                instance = new Singleton();
            }
        }

        return instance;
    }

//    @Override
    public Object readResolve(){
        return instance;
    }

    public Object clone() throws CloneNotSupportedException{
//        return super.clone();
        return instance;
    }

}
