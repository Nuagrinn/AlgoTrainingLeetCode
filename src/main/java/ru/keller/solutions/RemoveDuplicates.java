package ru.keller.solutions;

import java.util.Arrays;

public class RemoveDuplicates {

    public int removeDuplicates(int[] nums) {
        int finArrNumLen = nums.length;

        for (int i = 0; i <= finArrNumLen; i++) {
            for (int j = i + 1; j < finArrNumLen;) {
                if (nums[i] == nums[j]) {

                    for (int k = j; k < finArrNumLen-1; k++) {
                        nums[k] = nums[k+1];
                    }
                    finArrNumLen--;
                }
                else {
                    j++;
                }

            }
        }

        return finArrNumLen;

    }

    public static void main(String[] args) {

        int[] arr = {1,1,1,0,0,2};
        RemoveDuplicates rDmethod = new RemoveDuplicates();
        int arrFinLength = rDmethod.removeDuplicates(arr);

        System.out.println(arrFinLength);
        System.out.println(Arrays.toString(arr));


    }

}
