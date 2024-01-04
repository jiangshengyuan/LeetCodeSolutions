package org.jsy.leetcode;

public class main {
    public static void main(String[] args){
        Singleton s1= Singleton.getInstance();
        Singleton s2= Singleton.getInstance();
        if(s1==s2)
            System.out.println("此类是单例模式");
        else
            System.out.println("此类不是单例模式");
    }
}
