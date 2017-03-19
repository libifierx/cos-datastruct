package cos.datastructure.sort;

import java.util.Arrays;

public class QuickSort {

	/**
	 * 快速排序
	 * 
	 * 基本思想:
	 * 1) 
	 * 
	 */
	public static void quickSort(int[] sortData, int left, int right) {
		System.out.print("====="+ sortData[left]);
		System.out.println(Arrays.toString(sortData));
		
		int pivot = sortData[left];
		int i = left;
		int j = right;
		while (true) {
			while ((++i) < right -1  && sortData[i] <  pivot) {
				//
			}
			
			while ((--j) > left && sortData[j] > pivot) {
				//
			}
			
			if (i >= j) {
				break;
			}
			int temp = sortData[i];
			sortData[i] = sortData[j];
			sortData[j] = temp;
			
			System.out.println("~~"+Arrays.toString(sortData));
		}
		System.out.print("---->");
		System.out.println(Arrays.toString(sortData));
		sortData[left] = sortData[j];
		sortData[j] = pivot;
		
		System.out.print("---->");
		System.out.println(Arrays.toString(sortData));

		if (left < j) {
			quickSort(sortData, left, j);
		}

		if (right > i) {
			quickSort(sortData, i, right);
		}
	}

	public static void main(String[] args) {
		int[] pData = new int[] { 49,38,65,97,76,13,27};
		quickSort(pData, 0, pData.length);
		System.out.println(Arrays.toString(pData));

	}

}
