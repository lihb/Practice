package src130408;

import java.util.Arrays;
import java.util.Random;

import src130327.Insert_Sort;

public class XianXingBiao {

	/**
	 * @param args
	 * 线性表的相关操作
	 */
	private static final int MAX = 100;
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a[] =new int[MAX];
		int length = 20;
		//Random random  = new Random();
		for (int i = 0; i < length; i++) {
			a[i] = i+1;
		}
		int num = 16;
		System.out.println(Arrays.toString(a));
		Insert(a,num,length);
		System.out.println(Arrays.toString(a));
	}

	private static void Insert(int[] a, int num,int length) {
		// TODO Auto-generated method stub
		int i; //记录要插入的位置
		for (i = 0; i < length; i++) {
			if(num < a[i])
				break;
		}
		
		for (int j = length; j >= i ; j--) {
			a[j+1] = a[j];
		}
		length++;
		a[i] = num;
	}

}
