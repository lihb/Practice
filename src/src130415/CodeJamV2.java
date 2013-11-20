package src130415;

import java.io.File;
import java.io.PrintStream;
import java.util.Arrays;
import java.util.Scanner;

public class CodeJamV2 {

	/**
	 * @param args
	 */
	private static int NumCase;
	private static long count=0;
	private final static String str = "welcome to code jam";
	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(new File("d:\\ProgramDATA\\Welcome to Code Jam\\C-small-practice.in"));
		System.setOut(new PrintStream(new File("d:\\ProgramDATA\\Welcome to Code Jam\\C-small-practice2.out")));
		NumCase = in.nextInt();
		in.nextLine();
		for(int curCase = 1 ;curCase <= NumCase;curCase++){
			String inputStr = in.nextLine(); 
			int p_len = inputStr.length();
			int s_len = str.length();
			int array[] = new int[s_len];
			
			cal(inputStr,str,array,p_len,s_len,0,0,0);
			
			System.out.println("Case #"+curCase+": "+count);
			/*count = count % 10000;
			String out = "";
			if(count < 1000) out = "0" + count;
			if(count < 100) out = "00" + count;
			if(count < 10) out = "000" + count;
			System.out.println(out);*/
		}
	}
	private static void cal(String inputStr, String str2, int[] array,
			int p_len, int s_len, int print_arr_num, int p_start_num, int s_start_num) {
		// TODO Auto-generated method stub
		int pStartnum = p_start_num;
		int sStartnum = s_start_num;
		int printNum = print_arr_num;
		if(printNum == s_len){
			//System.out.println(Arrays.toString(array));
			count++;
		}
		for (int i = pStartnum; i < p_len; i++) {
			for (int j = sStartnum; j < s_len; j++) {
				if(inputStr.charAt(i) == str.charAt(j)){
					array[printNum] = i;
					pStartnum = i;
					sStartnum = j;
					cal(inputStr, str, array, p_len, s_len, printNum+1, pStartnum+1, sStartnum+1);
				}
			}
		}
		
	}
}
