package cos.datastructure.sort;

import java.util.Arrays;

public class InsertSort {
	public static void main(String[] args) {
		int[] toSorted = new int[]{9,8,7,6,5,4,3,2,1};
		for (int i = 1; i < toSorted.length; i++) {
			for (int j = i; j > 0; j--) {
				if(toSorted[j] < toSorted[j-1]) {
					toSorted[j] = toSorted[j] + toSorted[j-1];
					toSorted[j-1] = toSorted[j] - toSorted[j-1];
					toSorted[j] = toSorted[j] - toSorted[j-1];
				}
			}
		}
		System.out.println(Arrays.toString(toSorted));
	}
}
