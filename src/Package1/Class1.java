package Package1;

import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;

public class Class1 {

	public static void main(String[] args) {
		// arr[] = {8, 3, 2, 4, 9, 14, 59} , m = 3 Output: Minimum Difference is 2
		int[] arr = { 8, 3, 2, 4, 9, 14, 59 };
		int m = 3;
		int max = 0, min = 0;
		Arrays.sort(arr);
		String x = Arrays.toString(arr);
		System.out.println(x);
		HashSet<Integer> maxlist = new HashSet<Integer>();
		HashSet<Integer> minlist = new HashSet<Integer>();
		// [2, 3, 4, 8, 9, 14, 59]

		for (int i = 0; i <= arr.length - m; i++) {
			for (int j = i; j < i + m; j++) {
				if (arr[i] > arr[j]) {
					max = arr[i];
				} else {
					max = arr[j];
				}
				if (arr[i] < arr[j]) {
					min = arr[i];
				} else {
					min = arr[j];
				}
			}
			maxlist.add(max);
			minlist.add(min);
			System.out.println("max: " + max);
			System.out.println("min: " + min);
			max = 0;
			min = 0;
		}

		System.out.println("Collections.max(maxlist): " + Collections.min(maxlist));
		System.out.println("Collections.min(minlist): " + Collections.min(minlist));
		int y=Collections.min(minlist);
		int x1=Collections.min(maxlist);
		
		System.out.println("output: "+(x1-y));
	}

}
