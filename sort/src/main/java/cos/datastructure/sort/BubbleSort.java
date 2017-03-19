package cos.datastructure.sort;

import java.util.Arrays;

/**
 * 归纳：
 * 	1） 第一趟，使得最大值存在倒数第一位置。比较n-1次
 *  2） 第二趟，使得次大值存在倒数第二位置。比较n-2次
 *  ...
 *  4) 第N-1趟，使得最小值存在第一个位置。比较1次。
 *  核心
 *  1) 总共计算多少趟。N-1趟。for(int i=1 ; i < n ; i++)   //循环N-1趟
 *  2）第i趟比较次数。N-i次。for(int j=1;j <= n-i;j++) //第i趟比较次数为N-i次
 * @author caigerya
 */
public class BubbleSort {
    public static void main( String[] args ) {
    	int[] array = new int[]{25,24,23,22,21,20,19,18,17,16,15,14,13,12,11,10,9,8,7,6,5,4,3,2,1};
    	int[] sorted = bubble(array);
    	System.out.println(Arrays.toString(sorted));
    }
    private static int[] bubble(int[] sorted) {
    	for (int i = 1; i < sorted.length ; i++) {//n-1趟
			for (int j = 1; j <= sorted.length-i; j++) {//n-i次
				if(sorted[j] < sorted[j-1]) {
					int max = sorted[j-1];
					sorted[j-1] = sorted[j];
					sorted[j] = max;
				}
			}
		}
    	return sorted;
    }
}
