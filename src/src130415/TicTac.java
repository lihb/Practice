package src130415;

import java.io.File;
import java.io.PrintStream;
import java.util.Arrays;
import java.util.Scanner;

public class TicTac {

	/**
	 * @param args
	 * @throws Exception 
	 */
	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(new File("d:\\ProgramDATA\\2013\\TicTac\\A-small-practice.in"));
		System.setOut(new PrintStream(new File("d:\\ProgramDATA\\2013\\TicTac\\A-small-practice.out")));
		int NumCase = in.nextInt();
		//in.nextLine();
		
		for(int curCase = 1 ;curCase <= NumCase;curCase++){
			String[] str = new String[10];
			Arrays.fill(str, "");
			for (int i = 0; i < 4; i++) {
				str[i] = in.next();
			}
			for (int i = 4; i < 8; i++) {
				for (int j = 0; j < 4; j++) {
					str[i] += str[j].charAt(i-4);
				}
			}
			
			for (int i = 0; i < 4; i++) {
				str[8] += str[i].charAt(i);
				str[9] += str[i].charAt(3-i);
			}
			
			System.out.print("Case #"+curCase+": ");
			int count_O = 0,count_X = 0,count =0;
			for (int i = 0; i < 10; i++) {
				count_O = 0;count_X = 0;
				String s = str[i];
				count_O = cal(s, 'O');
				count_X = cal(s, 'X');
				
				if(count_O == 4){
					System.out.println("O won");
					break;
				}else
				if(count_X == 4){
					System.out.println("X won");
					break;
				}
			}
			if(count_O < 4&&count_X < 4){
				count=0;
				for (int i = 0; i < 4; i++) {
					for (int j = 0; j < 4; j++) {
						if(str[i].charAt(j)=='.')
							count++;
					}
				}
				if(count == 0)
					System.out.println("Draw");
				else
					System.out.println("Game has not completed");
			}
		}

	}

	private static int cal(String str , char ch) {
		// TODO Auto-generated method stub
		int count = 0;
		for (int i = 0; i < 4; i++) {
			if(str.charAt(i)== ch||str.charAt(i)== 'T')
				count++;
		}
		return count;
		
	}

}
