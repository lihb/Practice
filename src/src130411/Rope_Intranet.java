package src130411;

import java.io.File;
import java.io.PrintStream;
import java.util.Arrays;
import java.util.Scanner;

public class Rope_Intranet {

	/**
	 * @param args
	 * @throws Exception 
	 */
	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(new File("d:\\programDATA\\Rope Intranet\\A-large-practice.in"));
		System.setOut(new PrintStream(new File("d:\\programDATA\\Rope Intranet\\A-large-practice.out")));
		int Numcase = in.nextInt();
		for(int currCase =1;currCase <= Numcase; currCase++){
			in.nextLine();
			int N = in.nextInt();
			int[][] wires = new int[N][2];
			int count = 0;
			for (int i = 0; i < N; i++) {
				for (int j = 0; j < 2; j++) {
					wires[i][j] = in.nextInt();
				}
				//System.out.println(Arrays.toString(wires[i]));
			}
			for (int i = 0; i < N-1; i++) {
				for (int j = i+1; j < N; j++) {
					if((wires[i][0] > wires[j][0]&&wires[i][1] < wires[j][1])||(wires[i][0] < wires[j][0]&&wires[i][1] > wires[j][1]))
						count++;
				}
			}
			System.out.println("Case #"+currCase+": "+count);
			
		}
		
	}

}
