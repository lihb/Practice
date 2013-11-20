package src130327;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintStream;
import java.util.Scanner;

public class Dancing {

	/**
	 * @param args
	 * @throws Exception 
	 */
	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(new File("d:\\programDATA\\Dancing With the Googlers\\B-small-practice.in"));
		System.setOut(new PrintStream(new File("d:\\programDATA\\Dancing With the Googlers\\B-small-practice.out")));
		int Numcase = in.nextInt();
		for (int curr = 1; curr <= Numcase; curr++) {
			in.nextLine();
			int N = in.nextInt();
			int S = in.nextInt();
			int P = in.nextInt();
			int a[] = new int[N];
			int y =0;//用于记录最大值
			int remainder = 0;//余数
			int quotient = 0;//商
			for (int i = 0; i < a.length; i++) {
				a[i] = in.nextInt();
			}
			for (int i = 0; i < a.length; i++) {
				quotient = a[i] / 3;
				remainder = a[i] % 3;
				if(quotient >= P) y++;
				else if(quotient+1 == P){
					if(remainder == 2){
						
					}
					if(remainder == 1){
						
					}
					if(remainder == 0){
						
					}
				}
			}
		}
	}

}
