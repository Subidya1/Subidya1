package week1.day2.classroom.arrays;

import java.util.Arrays;

public class FindSecondLargest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] data = {3,2,11,4,6,7};
		
		Arrays.sort(data);
	int	indexOfSecondLargest = data.length-2;
	System.out.println(data[indexOfSecondLargest]);
				
	}

}
