package leetcode_75_sort_colors;

public class Question {
	public static void main(String args[]) {
		int[] nums = {1,2,2,1,0};
		
		Solution.sortColors(nums);
		
		for (int i = 0; i < nums.length; i++) {
			System.out.print(nums[i] + ", ");
		}
	}
}
