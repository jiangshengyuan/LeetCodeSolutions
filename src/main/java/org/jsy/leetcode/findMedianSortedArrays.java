package org.jsy.leetcode;

import java.util.Arrays;

public class findMedianSortedArrays {
    public static void main(String[] args){
        int[] nums1={1,3};
        int[] nums2={2,4};
        double result=0;
        int[] nums=new int[nums1.length+nums2.length];
        if(nums1.length==0){
            if(nums2.length/2==0)
                result=(nums2[nums2.length/2-1]+nums2[nums2.length/2])/2;
            else result=nums2[nums2.length/2];
        }else if(nums2.length==0){
            if(nums1.length/2==0)
                result=(nums1[nums1.length/2-1]+nums1[nums1.length/2])/2;
            else result=nums1[nums1.length/2];
        }else {
            for(int i=0;i<nums1.length;i++){
                nums[i]=nums1[i];
            }
            for(int j=0;j<nums2.length;j++){
                nums[j+nums1.length]=nums2[j];
            }
            Arrays.sort(nums);
            if((nums.length%2)==0) result=(nums[nums.length/2-1]+nums[nums.length/2])/2.0;
            else result=nums[nums.length/2];
        }
        System.out.println(result);
    }
}
