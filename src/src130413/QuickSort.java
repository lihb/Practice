package src130413;

import java.util.Arrays;
import java.util.Random;

public class QuickSort {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a[] =new int[15];
		Random random = new Random();
		for (int i = 0; i < a.length; i++) {
			a[i] = random.nextInt(30);
		}
		System.out.println(Arrays.toString(a));
		Sort(a,0,14);
		System.out.println(Arrays.toString(a));
	}

	private static void Sort(int[] a, int low, int high) {
		// TODO Auto-generated method stub
		int pos;
		if(low <= high){
			pos = Partition(a,low,high);
			Sort(a, low, pos-1);
			Sort(a, pos+1, high);
		}
	}
	
	/*记录第一个元素最终 的位置，也是作为划分的依据*/
	private static int Partition(int[] a, int i, int j) {
		// TODO Auto-generated method stub
		int pivot = a[i];
		while (i < j) {
			while(i<j&&a[j]>=pivot)
				j--;
			if( i < j)
				a[i++] = a[j];
			while(i<j&&a[i]<=pivot)
				i++;
			if(i < j)
				a[j--] = a[i];
		}
		a[i] = pivot;
		return i;
	}

}
