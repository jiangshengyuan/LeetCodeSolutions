package org.jsy.leetcode;

public class quicksort {
    public static void quicksortorder(int[] order, int begin0, int end0){
        if(begin0<(end0-1)){
            int baseposition=begin0;
            int temp;
            boolean turn=true;
            int begin=begin0,end=end0;
            while(begin<=end){
                if(turn){
                    if(order[baseposition]>order[end]){
                        temp=order[end];
                        order[end]=order[baseposition];
                        order[baseposition]=temp;
                        baseposition=end;
                        end--;
                        turn=false;
                    }
                    else end--;
                }
                else{
                    if(order[baseposition]<order[begin]){
                        temp=order[begin];
                        order[begin]=order[baseposition];
                        order[baseposition]=temp;
                        baseposition=begin;
                        begin++;
                        turn=true;
                    }
                    else begin++;
                }
            }
            quicksortorder(order,begin0,baseposition-1);
            quicksortorder(order,baseposition+1,end0);
        }
        else return;
    }
    public static void main(String[] args){
        int[] order={45,48,6,26,4,1,61,6,2,6,6,62,6,62,62,626};
        for (int i:order) {
            System.out.print(i+" ");
        }
        System.out.println();
        quicksortorder(order,0,order.length-1);
        for (int i:order) {
            System.out.print(i+" ");
        }
    }
}
