package ru.keller.solutions;


import java.util.Arrays;
import java.util.List;

public class RotateArray {

    public static void rotate(int[] nums, int k) {

        if (k == 0 || k == nums.length){
            return;
        }else if(k > nums.length) {
            k = k % nums.length;
        }

        int[] rotatedNums = new int[nums.length];
        for(int i = 0, j = nums.length - k; i < k; i++, j++){
            rotatedNums[i] = nums[j];
        }
        for(int i = 0, j = k; i < nums.length - k; i++, j++) {
            rotatedNums[j] = nums[i];
        }

        System.arraycopy(rotatedNums, 0, nums, 0, nums.length);


    }

    public static void main(String[] args) {
        int[] arr = {1,};
        int k  = 1;
        short x = 10;
        short y = 3;
//        rotate(arr,k);
//        System.out.println(Arrays.toString(arr));
        System.out.println(x/y);

    }
}
