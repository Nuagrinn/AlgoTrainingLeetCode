package ru.keller.solutions;

import java.util.Arrays;

public class ContainsDuplicates {

    public static boolean containsDuplicate(int[] nums) {

        mergeSort(nums);

        for(int i = 0; i < nums.length - 1; i++) {
            if(nums[i] == nums[i+1]) {
                return true;
            }
        }
        return false;

    }


    public static void mergeSort(int[] arr) {
        if (arr.length <= 1) return;

        int mid = arr.length / 2;
        int[] left = Arrays.copyOfRange(arr, 0, mid);
        int[] right = Arrays.copyOfRange(arr, mid, arr.length);

        mergeSort(left);
        mergeSort(right);

        merge(left, right, arr);
    }

    private static void merge(int[] left, int[] right, int[] arr) {
        int i = 0, j = 0, k = 0;

        while (i < left.length && j < right.length) {
            if (left[i] <= right[j]) {
                arr[k++] = left[i++];
            } else {
                arr[k++] = right[j++];
            }
        }

        while (i < left.length) {
            arr[k++] = left[i++];
        }

        while (j < right.length) {
            arr[k++] = right[j++];
        }
    }

    public static void main(String[] args) {

//        int[] nums = {1,2,3,};
        int[] nums = {1,1,2,2,3,4};
//        int[] nums = {0};
        System.out.println(containsDuplicate(nums));

    }

}
