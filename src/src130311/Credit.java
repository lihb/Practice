package src130311;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.StringTokenizer;

import javax.sql.rowset.CachedRowSet;

public class Credit {
	
	private static BufferedReader rd;
	private static PrintWriter wr;
	private static int count =1;
	/**
	 * @param args
	 * @throws Exception 
	 */
	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		int totalMoney,num=5;
		int[] items ;
		rd = new BufferedReader(new FileReader("d:\\programDATA\\credits\\A-large-practice.in"));
		wr = new PrintWriter(new FileWriter("d:\\programDATA\\credits\\A-large-practice.out"));
		String line =rd.readLine();
		while (true) {
			line = rd.readLine();
			if(line == null) 
				break;
			else 
				totalMoney = Integer.parseInt(line);
			num = Integer.parseInt(rd.readLine());
			items = new int[num];
			String itemsLine = rd.readLine();
			StringTokenizer tokenizer = new StringTokenizer(itemsLine," ");
			for(int i = 0; tokenizer.hasMoreTokens();i++){
				items[i] = Integer.parseInt(tokenizer.nextToken());
			}
			Calc(totalMoney,num,items);
		}
		rd.close();
		wr.close();

	}

	private static void Calc(int totalMoney, int num, int[] items) throws IOException {
		// TODO Auto-generated method stub
		for(int i = 0 ;i < num-1 ;i++){
			for(int j = i+1; j < num;j++){
				if(items[i] + items[j] == totalMoney){
					wr.print("Case #"+ (count++) +": ");
					//System.out.print("Case #"+ (count++) +": ");
					wr.println((i+1)+" "+(j+1));
					//System.out.println((i+1)+" "+(j+1));
				}
					
			}
		}
		
	}

}
