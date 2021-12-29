package week1.day2.Assignments;

import java.util.Arrays;

public class MissingElementInArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
int[] arr = {1,2,3,4,7,6,8};
Arrays.sort(arr);
for(int i = 0; i < arr.length ; i++) {
}
         int sumwithoutmiss = 0;
         for (int i = 1; i<=8 ;i++) {
        	 sumwithoutmiss = sumwithoutmiss + i ;
         }
		int sumwithmiss = 0;
		for(int e : arr) {
			sumwithmiss = sumwithmiss + e ;
		}
		System.out.println("Missing Element In Array is = " +(sumwithoutmiss - sumwithmiss));
	}

}
