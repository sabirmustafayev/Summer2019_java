package day27_CustomMethods;

import java.util.Arrays;

public class quizqeustions {
	public static void main(String[] args) {
		
		char[]array= {'D','C','A','B'};
		Arrays.sort(array);
		
		for (char each : array) {
			System.out.println(each + " ");
			if (each == 'D') {
				continue;
			}
		}
		
		
		
		int[] arr = {15,30,45,60,75};
		arr[2] = arr[4];
		arr[4] = 90;
		System.out.println(Arrays.toString(arr));
	}

}
