package src130311;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.PrintWriter;
import java.util.StringTokenizer;

public class Minimum_Scalar_Product {
	
	private static BufferedReader rd;
	private static PrintWriter wr;
	private static int count =1;
	private static StringTokenizer tokenizer;
	/**
	 * @param args
	 * @throws Exception 
	 */
	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		rd = new BufferedReader(new FileReader("d:\\programDATA\\Minimum Scalar Product\\A-large-practice.in"));
		wr = new PrintWriter(new FileWriter("d:\\programDATA\\Minimum Scalar Product\\A-large-practice.out"));
		int num;
		long[] v1,v2;
		String line =rd.readLine();
		
		while (true) {
			line = rd.readLine();
			if (line == null) break;
			else 
				 wr.print("Case #" + count++ + ": ");
			num = Integer.parseInt(line);
			
			v1 = new long[num];
			v2 = new long[num];
			tokenizer = new StringTokenizer(rd.readLine(), " ");
			for(int i = 0;tokenizer.hasMoreTokens();i++){
				v1[i] = Long.parseLong(tokenizer.nextToken());
			}
			
			tokenizer = new StringTokenizer(rd.readLine(), " ");
			for(int i = 0;tokenizer.hasMoreTokens();i++){
				v2[i] = Long.parseLong(tokenizer.nextToken());
			}
			long temp;
			for (int i = 0; i < num-1; i++) {
				for(int j = i+1;j < num;j++){
					if (v1[i] >= v1[j] ) {
						temp = v1[i];
						v1[i] = v1[j];
						v1[j] = temp;
					}
					if (v2[i] <= v2[j] ) {
						temp = v2[i];
						v2[i] = v2[j];
						v2[j] = temp;
					}
				}			
			}
			long result = 0;
			for(int i = 0;i < num;i++){
					result += v1[i]*v2[i];					
			}
			wr.println(result);
		}
		rd.close();
		wr.close();
	}


}
