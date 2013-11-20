package src130324;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintStream;
import java.text.DecimalFormat;
import java.util.Scanner;

import javax.swing.text.html.MinimalHTMLWriter;

public class Baby_Height {

	/**
	 * @param args
	 * @throws Exception 
	 */
	public static void main(String[] args) throws Exception {
		
		// TODO Auto-generated method stub
		Scanner in = new Scanner(new File("d:\\programDATA\\Baby Height\\B-small-practice.in"));
		System.setOut(new PrintStream(new File("d:\\programDATA\\Baby Height\\B-small-practice.out")));
		int Numcase = in.nextInt();
		for (int curr = 1; curr <= Numcase; curr++) {
			in.nextLine();
			String  sex = in.findInLine("B|G");
			int M_feet = Integer.parseInt(in.findInLine("\\d{1,}"));
			int M_inch = Integer.parseInt(in.findInLine("\\d{1,}"));
			int F_feet =Integer.parseInt(in.findInLine("\\d{1,}"));
			int F_inch = Integer.parseInt(in.findInLine("\\d{1,}"));
			
			double sum = (M_feet*12+M_inch) + (F_feet*12+F_inch);
			if(sex.equals("B"))
				sum += 5;
			else
				sum -=5;
			sum = sum / 2;
			int min,max;
			min = (int)(Math.ceil(sum) - 4);
			max = (int)(Math.floor(sum) + 4);
			int min_feet = min/12;int min_inch = min%12;
			int max_feet = max/12;int max_inch = max%12;
			System.out.print("Case #"+curr+": ");
			System.out.println(min_feet + "'" + min_inch + "\"" +" to "+ max_feet + "'" + max_inch + "\"");

	    }
    }

}
