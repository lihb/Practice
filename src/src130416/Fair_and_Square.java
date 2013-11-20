package src130416;

import java.io.File;
import java.io.PrintStream;
import java.math.BigInteger;
import java.util.Scanner;

import javax.swing.text.html.HTMLDocument.HTMLReader.IsindexAction;

public class Fair_and_Square {

	/**
	 * @param args
	 * @throws Exception 
	 */
	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		long start =System.currentTimeMillis();
		Scanner in = new Scanner(new File("d:\\ProgramDATA\\2013\\Fair and Square\\C-large-practice-1.in"));
		System.setOut(new PrintStream(new File("d:\\ProgramDATA\\2013\\Fair and Square\\C-large-practice1.out")));
		int NumCase = in.nextInt();
		in.nextLine();
		
		for(int curCase = 1 ;curCase <= NumCase;curCase++){
			long min,max;
			min = in.nextLong();
			max = in.nextLong();
			int count = 0;
			long sqrt_min = (long)Math.sqrt(min),sqrt_max = (long)Math.sqrt(max);
			if(min>1&&min<4) sqrt_min += 1;
			for (long i = sqrt_min; i <= sqrt_max; i++) {
				if (IsPalin(i)&&IsPalin(i*i)) {
					count ++;
					//System.out.print("("+i+","+(i*i)+")");
				}
			}
			/*for (long i = min; i <= max; i++) {
				for (long j = (int)Math.sqrt(i); j <= Math.sqrt(i)+1; j++) {
					if(i == j*j&&IsPalin(i)&&IsPalin(j)){
						count ++;
						//System.out.print("("+i+","+j+")");
					}
				}
			}*/
			System.out.println(" Case #"+curCase+": "+count);
		}
		long end = System.currentTimeMillis();
		System.out.println("运行时间："+(end-start)+"ms");
	}

	private static boolean IsPalin(long num) {
		// TODO Auto-generated method stub
		String s1  = String.valueOf(num);
		StringBuffer str = new StringBuffer(s1);
		String s2 = str.reverse().toString();
		if (s1.equals(s2))
			return true;	
		
		return false;
	}

}
