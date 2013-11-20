package src130318;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintStream;
import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Scanner;

public class Codejam {
	private static int NumCase;
	private final static String str = "welcome to code jam";
	public static void main(String[] args) throws Exception{
		Scanner in = new Scanner(new File("d:\\ProgramDATA\\Welcome to Code Jam\\C-small-practice.in"));
		System.setOut(new PrintStream(new File("d:\\ProgramDATA\\Welcome to Code Jam\\C-small-practice.out")));
		NumCase = in.nextInt();
		in.nextLine();
		int[] count = new int[str.length()];
		char ch_b,ch_m,ch_l;
		for(int curCase = 1 ;curCase <= NumCase;curCase++){
				String inputStr = in.nextLine();
				Arrays.fill(count, 0);
				
				for(int i = 0,j = 0; i< str.length(); i++){
					if(i == 0){
						ch_m = str.charAt(i);ch_l = str.charAt(i+1);
						for(; j < inputStr.indexOf(ch_l); j++)
							if(ch_m == inputStr.charAt(j)) 
								count[i]++;
						if(count[i] == 0) break; 
					}else if (i-1>=0&&i+1<=str.length()-1) {
						ch_b = str.charAt(i-1);ch_m = str.charAt(i);ch_l = str.charAt(i+1);
						for(; j < inputStr.lastIndexOf(ch_l); j++)
							if(ch_m == inputStr.charAt(j)) 
								count[i]++;
						if(count[i] == 0) break; 
					}else if (i == str.length()-1) {
						ch_b = str.charAt(i-1);ch_m = str.charAt(i);
						for(; j < inputStr.length(); j++)
							if(ch_m == inputStr.charAt(j)) 
								count[i]++;
						if(count[i] == 0) break; 
					}
					
						
					/*char ch = str.charAt(i);
					for(int j = 0;j < inputStr.length();j++){
						if(ch == inputStr.charAt(j)&&(inputStr.indexOf(str.charAt(i+1),j) != -1))
							count[i]++;
					}*/
				}
				long result = 1;
				for(int i = 0;i < count.length;i++){
					result *= count[i];
				}
				System.out.print("Case #"+curCase+": ");
				result = result%10000;	
				String out = "";
				if(result < 1000) out = "0" + result;
				if(result < 100) out = "00" + result;
				if(result < 10) out = "000" + result;
				System.out.println(out);
		}

		
		
	}

}
