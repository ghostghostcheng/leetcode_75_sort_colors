package leetcode_75_sort_colors;

public class Solution {
    public static void sortColors(int[] nums) {
        //012
        
        if (nums.length < 2) {
            return;
        }    
        sortArray(nums, 0, nums.length - 1);
    }
    
    
    //Quick Sort:
    public static void sortArray(int[] nums, int start, int end) {
        if (start >= end) {
            return;
        }
        
        int leftIdx = start;
        int rightIdx = end;
        int pivotValue = nums[start];
        
        while (leftIdx != rightIdx) {
            while (nums[rightIdx] >= pivotValue && leftIdx < rightIdx) {
                rightIdx--;
            } 
            while (nums[leftIdx] <= pivotValue && leftIdx < rightIdx) {
                leftIdx++;
            }
            
            if (leftIdx < rightIdx) {           
                swap(nums, leftIdx, rightIdx);
            }
        }

        nums[start] = nums[leftIdx];
        nums[leftIdx] = pivotValue;
        
        sortArray(nums, start, leftIdx - 1);
        sortArray(nums, leftIdx + 1, end);
    }
    
    public static void swap(int[] nums, int start, int end) {
        int tmp = nums[start];
        nums[start] = nums[end];
        nums[end] = tmp;
    }
}
