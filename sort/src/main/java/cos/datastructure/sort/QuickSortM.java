package cos.datastructure.sort;

import java.util.Arrays;

/**
 * 算法的关键点：
 * 方式一、
 * 1） 如何对一个数组进行快速的拆分左右两部分？
 * 			*** 当pivot在最左边时，从右边数第一个小于pivot值的，进行替换。
 * 			*** 当pivot在最右边时，从左边数第一个大于pivot值的，进行替换。
 * 			*** 当游标碰撞时，拆分结束。
 * 
 * 2） 拆分完递归的写法
 * 
 * 方式二、
 * 1） 如果不适用pivot进行中间替换，如何对一个数组进行快速的拆分左右两部分?
 * 			*** 
 * 			*** 
 * 			*** 
 * 
 * @author caigerya
 *
 */
public class QuickSortM {
	public static void main(String[] args) {
		int array[] = new int[]{10,9,8,7,6};
		quickSort(array, 0, array.length - 1);
		System.out.println(Arrays.toString(array));
	}
	
	private static int quickSort(int array[], int left,int right) {
		
		int orgLeft = left;
		int orgRight = right;
		
		if(array.length == 1) {
			return 0;
		}
		
		int pivot = array[left];
		int pivotPos = left;
		while(left < right) {
			while(left < right ) {
				if(array[right] > pivot) {
					right--;
				} else {
					array[pivotPos] = array[right];
					array[right] = pivot;
					pivotPos = right;
					break;
				}
			}
			
			while(left < right ) {
				if(array[left] < pivot) {
					left++;
				} else {
					array[pivotPos] = array[left];
					array[left] = pivot;
					pivotPos = left;
					break;
				}
			}
		}
		
		if(left > orgLeft) {
			quickSort(array, orgLeft, left-1);
		}
		
		if(left < orgRight) {
			quickSort(array, left+1, orgRight);
		}

		return left;
	}
	
	
}
