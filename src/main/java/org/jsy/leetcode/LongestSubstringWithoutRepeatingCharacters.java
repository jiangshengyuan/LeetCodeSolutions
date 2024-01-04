package org.jsy.leetcode;

public class LongestSubstringWithoutRepeatingCharacters {//此算法代价过大
    public static int lengthOfLongestSubstring(String s) {
        int length=s.length();//"hhsjskd"
        int result=1;
        while(length>1){
            int repeat=0;
            for(int i=0;i<=(s.length()-length);i++){//用于判断所有子串是否有重复元素
                int j=i+length-1;
                for(int m=i;m<j;m++){//第m个元素和其之后元素对比
                    for(int n=m+1;n<=j;n++){//从第m+1个到最后一个元素和m比较
                        if(s.charAt(m)==s.charAt(n)){//判断两个元素是否相同，相同令repeat为1并跳出循环
                            repeat=1;
                            break;
                        }
                    }
                    if(repeat==1)//两种情况执行此条语句，无重复元素或者有重复元素提前退出循环
                        break;
                }
                if(repeat==0){//倒数第二轮之前
                    result=length;
                }else if(repeat==1&&i==(s.length()-length)){
                    break;
                }else{
                    repeat=0;
                }
            }
            if(result==length) break;
            else if(repeat==1){
                length--;
            }
        }
        return result;
    }
    public static void main(String[] args){
        System.out.print(lengthOfLongestSubstring("asdfghjkllkjhgzxcvbnmlkjhgdfsarqwtey")+"");
    }
}
