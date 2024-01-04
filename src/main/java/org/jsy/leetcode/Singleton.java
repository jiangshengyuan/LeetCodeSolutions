package org.jsy.leetcode;

public class Singleton {
    private Singleton(){}
    private static Singleton singleinstance=new Singleton();
    public static Singleton getInstance(){
        return singleinstance;
    }
}
