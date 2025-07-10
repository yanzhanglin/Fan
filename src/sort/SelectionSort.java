package sort;

import java.util.Arrays;

public class SelectionSort {
    public static int[] selectionSort (int[] nums){
        int n = nums.length;
        for (int i = 0;i < n-1;i++){
            int minIndex = i;
            for (int j = i;j < n;j++){
                if (nums[minIndex] > nums[j]){
                    minIndex = j;
                }
            }
            int temp = nums[i];
            nums[i] = nums[minIndex];
            nums[minIndex] = temp;
        }
        return nums;
    }

    public static void main(String[] args){
        int[] nums = {1,9,9,10,25,11,7,200,80,75,0};
        System.out.println(Arrays.toString(nums));
        int[] sortNums = selectionSort(nums);
        System.out.println(Arrays.toString(sortNums));

    }

}
