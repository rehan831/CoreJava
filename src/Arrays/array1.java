package Arrays;

import java.util.Arrays;


public class array1 {
	public static void main(String[]args) {
		//Find maximum  number in an array

		int nums[] = {500,890,500,600,800};
		
		int max = nums[0];
		for(int i = 1; i < nums.length; i++){
			
			if(nums[i] >max) {
				max = nums[i];
				
			}
		}
		System.out.println(max);
					
	   //  number in an array

			
		int rehan[] = {10,50,25,15};
		for(int j = 0; j < rehan.length; j++ ) {
			System.out.println("Element at index " + j + ": " + rehan[j]);
			
		}
		
		//reverse an array without creat a new array
int arr [] = {1,2,3,4,5};
for (int i = 0; i < arr.length /2; i++) {
	int temp = arr[i];
	arr[i]=arr[arr.length -1 -i];
	arr[arr.length -1 -i] = temp;
	
}
System.out.println(Arrays.toString(arr));
int[][] matrix = {
	    {1, 2, 3},
	    {4, 5, 6}
	};
	for (int i = 0; i < matrix.length; i++) {
	    for (int j = 0; j < matrix[i].length; j++) {
	        System.out.print(matrix[i][j] + " ");
	    }
	    System.out.println();
	}

	

		
	}

}
