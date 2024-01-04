package org.jsy.leetcode;

public class shellsort {
    public static void shellsort(int[] order){
        int gap=1;
        int temp;
        int len=order.length;
        while(gap<order.length/3){
            gap=gap*3+1;
        }
        while(gap>=1){
            for(int i=gap;i<len;i++){
                for(int j=i-gap;j>=0;j-=gap){
                    for(int m=j;m<=i-gap;m+=gap){
                        if(order[m]>order[m+gap]){
                            temp=order[m+gap];
                            order[m+gap]=order[m];
                            order[m]=temp;
                        }
                    }
                }
            }
            gap/=3;
        }
    }
    public static void main(String[] args){
        int[] order={45,48,6,26,4,1,61,6,2,6,6,62,6,62,62,626};
        for (int i:order) {
            System.out.print(i+" ");
        }
        System.out.println();
        shellsort(order);
        for (int i:order) {
            System.out.print(i+" ");
        }
        System.out.println();
    }
}
