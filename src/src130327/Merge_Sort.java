package src130327;

import java.util.Arrays;
import java.util.Random;

public class Merge_Sort {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] a = new int[20];
		Random random = new Random();
		for (int i = 0; i < a.length; i++) {
			a[i] = random.nextInt(50);
			System.out.print(a[i] + " ");
		}
		System.out.println("");
		Merge_Sort(a,0,19);
		System.out.println(Arrays.toString(a));
	}

	private static void Merge_Sort(int[] a, int p, int r) {
		// TODO Auto-generated method stub
		if(p < r){
			int q = (p+r)/2;
			Merge_Sort(a,p,q);
			Merge_Sort(a,q+1,r);
			Merge(a,p,q,r);
		}
	}

	private static void Merge(int[] data, int left, int center, int right) {
		// TODO Auto-generated method stub
		   int [] tmpArr=new int[data.length];  
		    int mid=center+1;  
		    //index记录中间数组的索引  
		    int index=left;  
		    int tmp=left;  
		    while(left<=center&&mid<=right){  
		        //从两个数组中取出最小的放入中间数组  
		        if(data[left]<=data[mid]){  
		            tmpArr[index++]=data[left++];  
		        }else{  
		            tmpArr[index++]=data[mid++];  
		        }  
		    }  
		    //剩余部分依次放入中间数组  
		    while(mid<=right){  
		        tmpArr[index++]=data[mid++];  
		    }  
		    while(left<=center){  
		        tmpArr[index++]=data[left++];  
		    }  
		    //将中间数组中的内容复制回原数组  
		    while(tmp<=right){  
		        data[tmp]=tmpArr[tmp++];  
		    }  
		   // System.out.println(Arrays.toString(data));  
		}  
		  

}
