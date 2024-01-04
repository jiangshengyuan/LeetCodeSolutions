package org.jsy.leetcode;

import java.util.*;

public class LongestSubstringWithoutRepeatingCharacters1 {
    public static void main(String[] args){
        String s="faieuiurfhhuhrge";
        int result=0;
        HashMap<Character,Integer> temp=new HashMap<>();
        for(int i=0;i<s.length();i++){
            if(temp.containsKey(s.charAt(i))){
                Integer temp0=temp.get(s.charAt(i));
                i= temp0;
                temp.clear();
            }else {
                temp.put(s.charAt(i),i);
                if(temp.size()>result)
                    result=temp.size();
            }
        }
        System.out.println(result);
    }
}
