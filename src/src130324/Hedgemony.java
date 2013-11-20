package src130324;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintStream;
import java.text.DecimalFormat;
import java.util.Scanner;

public class Hedgemony {

	/**
	 * @param args
	 * @throws Exception 
	 */
	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(new File("d:\\programDATA\\Hedgemony\\a-large-practice.in"));
		System.setOut(new PrintStream(new File("d:\\programDATA\\Hedgemony\\a-large-practice.out")));
		int Numcase = in.nextInt();
		
		for (int curr = 1; curr <= Numcase; curr++) {
			int length = in.nextInt();
			float a[] = new float[length];
			for (int i = 0; i < length; i++) {
				a[i] = in.nextInt();
			}
			//float temp;
			//temp= a[1];a[1] = a[2];a[2] = temp;
			for (int i = 1; i < a.length-1; i++) {
				if (a[i] > (a[i-1]+a[i+1])/2) 
					a[i] = (a[i-1]+a[i+1])/2;
			}
			String out = new DecimalFormat("#####.000000").format(a[length-2]);
			System.out.println("Case #"+curr+": " + out);
		}

	}

}
