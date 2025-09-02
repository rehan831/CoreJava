package Arrays;

public class newarray {
	int nums[] = { 500, 890, 500, 600, 800 };
	public int findMax() {
	int max = nums[0];

	for(
	int i = 1;i<nums.length;i++)
		
		if (nums[i] > max) {
			max = nums[i];
			
		}
		
		return max;
	}
	
	
}


