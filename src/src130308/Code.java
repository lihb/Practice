package src130308;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.PrintWriter;
import java.util.Scanner;

public class Code {
	/*private static BufferedReader rd;
	
	static String str = "yhesocvxduiglbkrztnwjpfmaq";
	static char[] map = str.toCharArray();
	
	public static void main(String[] args) throws Exception{
		
		rd = new BufferedReader(new FileReader("d:\\A-small-practice.in"));
		PrintWriter wr = new PrintWriter(new FileWriter("d:\\result.out"));
		String line = rd.readLine();
		int count = 1;
		while(true){
			line = rd.readLine();
			if(line == null) break;
			String outline = "";
			wr.print("Case #" + count++ + ": ");
			for (int i = 0; i < line.length(); i++) {
				if(line.charAt(i)!=' '){
					char b = line.charAt(i);
					b = map[b - 'a'];
					outline += b;
				}else {
					outline += ' ';
				}
			}
			wr.println(outline);
		}
		rd.close();
		wr.close();
		
	}*/
	public static void main(String[] args) {
	      Scanner s = new Scanner("123 asdf sd 45 789 sdf asdfl,sdf.sdfl,asdf    ......asdfkl    las");
     	  s.useDelimiter(" |,|\\.");
	      while (s.hasNext()) {
	           System.out.println(s.next());
	      }
	}
}
