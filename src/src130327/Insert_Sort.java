package src130327;

import java.util.Random;

public class Insert_Sort {

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
		System.out.println("\n\n");
		
		for(int i = 1;i < a.length;i++){
			int key = a[i];
			int j =i - 1;
			while(j >= 0 && a[j] > key){
				a[j + 1] = a[j];
				j--;
			}
			a[j + 1] = key;	
		}
		for (int i = 0; i < a.length; i++) {
			System.out.print(a[i] + " ");
		}
	}

}
