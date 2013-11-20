package src130315;

import java.io.File;
import java.io.PrintStream;
import java.util.Scanner;

public class Remove_Max {

	/**
	 * @param args
	 * @throws Exception 
	 */
	private static int[] input;
	private static int[] out;
	
	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(new File("d:\\programDATA\\Remove_Max_from_Heap\\input.txt"));
		System.setOut(new PrintStream(new File("d:\\programDATA\\Remove_Max_from_Heap\\out.txt")));
		
		input = new int[9];
		for (int i = 0; i < 9; i++) {
			input[i] = in.nextInt();
		}
	
		if(input.length == 0 )
			System.out.println("The Heap is empty.");
		else {
			input[0] = input[8];
			input[8] = -8888;
			int parent = 0;
			int child = 1;
			while (child < 7) {
				if(input[child] < input[child+1]) 
					child = child + 1;
				if(input[parent] < input[child]){
					int temp = input[child];
					input[child] = input[parent];
					input[parent] = temp;
					//swap(input[child],input[parent]);
					parent = child;
					child = (child+1)*2-1;
				}else if(child == 8) break;
				
			}
			
		}
		for (int i = 0; i < input.length; i++) {
			System.out.println(input[i]+" ");
		}
	}
}
