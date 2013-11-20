package src130311;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.PrintWriter;
import java.util.StringTokenizer;

public class T9spelling {
	
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
		rd = new BufferedReader(new FileReader("d:\\programDATA\\T9 Spelling\\C-large-practice.in"));
		wr = new PrintWriter(new FileWriter("d:\\programDATA\\T9 Spelling\\C-large-practice.out"));
		String line =rd.readLine();
		
		while (true) {
			line = rd.readLine();
			if(line == null) break;
			else
			    wr.print("Case #" + count++ + ": ");
			String result = "";
			String s= "";
			for(int i = 0;i < line.length();i++){
				char c = line.charAt(i);
				if(c == 'a') s = "2";
				else if(c == 'b') s= "22";
				else if(c == 'c') s= "222";
				else if(c == 'd') s= "3";
				else if(c == 'e') s= "33";
				else if(c == 'f') s= "333";
				else if(c == 'g') s= "4";
				else if(c == 'h') s= "44";
				else if(c == 'i') s= "444";
				else if(c == 'j') s= "5";
				else if(c == 'k') s= "55";
				else if(c == 'l') s= "555";
				else if(c == 'm') s= "6";
				else if(c == 'n') s= "66";
				else if(c == 'o') s= "666";
				else if(c == 'p') s= "7";
				else if(c == 'q') s= "77";
				else if(c == 'r') s= "777";
				else if(c == 's') s= "7777";
				else if(c == 't') s= "8";
				else if(c == 'u') s= "88";
				else if(c == 'v') s= "888";
				else if(c == 'w') s= "9";
				else if(c == 'x') s= "99";
				else if(c == 'y') s= "999";
				else if(c == 'z') s= "9999";
				else if(c == ' ') s= "0";
				
				if(result != ""){
					if(result.charAt(result.length()-1) == s.charAt(s.length()-1))
						result += " " + s;
					else 
						result += s;
					
				}
				else
					result += s;
			}
			wr.println(result);
		}
		rd.close();
		wr.close();
	}

}
