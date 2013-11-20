package src130324;

import java.io.File;
import java.io.PrintStream;
import java.util.Scanner;

public class Ocean_View {

	/**
	 * @param args
	 * @throws Exception 
	 */
	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(new File("d:\\programDATA\\Ocean View\\C-large-practice.in"));
		System.setOut(new PrintStream(new File("d:\\programDATA\\Ocean View\\C-large-practice.out")));
		int Numcase = in.nextInt();
		for (int curr = 1; curr <= Numcase; curr++) {
			int NumHouse = in.nextInt();
			int house[] =new int[NumHouse];
			in.nextLine();
			for (int i = 0; i < house.length; i++) {
				house[i] = in.nextInt();
			}
			/*int count = 0;
			if (NumHouse > 1) {
				for (int i = 0; i < house.length-1; i++) 
					if(house[i+1] <= house[i] )
						count++;
			}
			System.out.println("Case #"+curr+": " + count);*/
			int[] a = new int[NumHouse];
			for (int i = 0; i <NumHouse; i++) {
				a[i] = 1;
				for(int j = 0;j < i;j++){
					if(house[i] > house[j] && a[j] + 1 > a[i])
						a[i] = a[j] + 1;
				}
			}
			int max = Integer.MIN_VALUE;
			for (int i = 0; i < a.length; i++) {
				if(max < a[i]) max = a[i];
			}
			System.out.println("Case #"+curr+": " + (NumHouse-max));
		}
	}

}
