package src130313;

import java.io.File;
import java.io.PrintStream;
import java.util.Arrays;
import java.util.Scanner;
/**
 * 2009年 google code jam资格赛
 * @author lhb
 *
 */

public class Alien_language {
	
	/**
	 * @param args
	 * @throws Exception 
	 */
	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(new File("D:\\ProgramDATA\\Alien Language\\A-small-practice.in"));
		System.setOut(new PrintStream(new File("d:\\programDATA\\Alien Language\\A-small-practice.out")));
		
		/*得到参数*/
		int L = in.nextInt(), D = in.nextInt(), N = in.nextInt();
		/*得到可行的字符数组*/
		String[] Dict = new String[D];
		for (int i = 0; i < Dict.length; i++) {
			Dict[i] = in.next();
		}		
		in.nextLine();
		/* 初始化候选的字符串*/
		
		for(int cur = 0;cur < N;cur++){
			String str = in.nextLine();
			
			String[] choices = new String[L];
			Arrays.fill(choices, "");        //数组初始化
			
			for (int i = 0,j = 0; i < str.length(); i++,j++) {
				if (str.charAt(i) == '(') {
					for (i += 1;  j< str.length()&&str.charAt(i) != ')'; i++) {
						choices[j] += str.charAt(i);
					}
				}else
					choices[j] += str.charAt(i);
			}
			int count = 0;
			for (int i = 0; i < D; i++) {
				if (Valid(Dict[i],choices)) 
					count++;
			}
			System.out.println("Case #"+(cur+1)+": "+count);
	    }
   }

	private static boolean Valid(String word, String[] choices) {
		// TODO Auto-generated method stub
		for (int i = 0; i < word.length(); i++) 
			if(choices[i].indexOf(word.charAt(i)) == -1)
				return false;
		return true;
	}
		
		
}
