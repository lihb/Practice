package src130322;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintStream;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;
import java.util.logging.SimpleFormatter;

public class one {

	/**
	 * @param args
	 * @throws FileNotFoundException 
	 * @throws ParseException 
	 */
	public static void main(String[] args) throws FileNotFoundException, ParseException {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(new File("d:\\programDATA\\\\in_1.txt"));
		System.setOut(new PrintStream(new File("d:\\ProgramDATA\\\\out_1.txt")));
		int Numcases = in.nextInt();
		in.nextLine();
		SimpleDateFormat sdf = new SimpleDateFormat("HH:MM:SS");
		Date date1 =null;
		Date date2 =null;
		for (int cur = 1; cur <= Numcases; cur++) {
			String str = in.nextLine();
			String s1 = str.substring(0, str.indexOf(' '));
			String s2 = str.substring(str.indexOf(' ')+1,str.length());
			System.out.println(s1+"---"+s2);
			date1 = sdf.parse(s1);
			date2 = sdf.parse(s2);
			//System.out.println(date1 - date2);
			
			
		}
		
		
	}

}
