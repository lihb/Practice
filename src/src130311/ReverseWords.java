package src130311;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.PrintWriter;
import java.util.StringTokenizer;

public class ReverseWords {
	
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
		rd = new BufferedReader(new FileReader("d:\\programDATA\\Reverse Words\\B-small-practice.in"));
		wr = new PrintWriter(new FileWriter("d:\\programDATA\\Reverse Words\\B-small-practice.out"));
		String[] words;
		String line =rd.readLine();
		while (true) {
			line = rd.readLine();
			if(line == null) 
				break;
			else{
				wr.print("Case #" + count++ + ": ");
				tokenizer = new StringTokenizer(line, " ");
				words = new String[tokenizer.countTokens()];
				for(int i = 0; tokenizer.hasMoreTokens();i++){
					words[i] = tokenizer.nextToken();
				}
				for (int i = words.length-1; i >= 0; i--) {
					if(i != 0)
						wr.print(words[i]+" ");
					else 
						wr.print(words[i]);
				}
				wr.println();
			}
			
		}
		rd.close();
		wr.close();
	}

}
