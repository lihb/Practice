package src130312;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.PrintWriter;
import java.math.BigDecimal;
import java.math.BigInteger;
import java.text.DecimalFormat;
import java.text.NumberFormat;

public class Numbers {
	
	private static BufferedReader rd;
	private static PrintWriter wr;
	private static int count =1;
	/**
	 * @param args
	 * @throws Exception 
	 */
	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		rd = new BufferedReader(new FileReader("d:\\programDATA\\Numbers\\C-large-practice.in"));
		wr = new PrintWriter(new FileWriter("d:\\programDATA\\Numbers\\C-large-practice.out"));
		int num;
		String line =rd.readLine();
		
		while (true) {
			line = rd.readLine();
			if (line == null) break;
			else 
				 wr.print("Case #" + count++ + ": ");
			num = Integer.parseInt(line);
			calc(num);
		}
		rd.close();
		wr.close();
	}
	private static void calc(int num) {
		// TODO Auto-generated method stub
		/*double x = 3+Math.sqrt(5);
		double y = Math.pow(x, num); 
		NumberFormat format = NumberFormat.getInstance();
		format.setGroupingUsed(false);
		String result = format.format(y);
		//String result = String.valueOf(y);*/
		BigDecimal dec = new BigDecimal("5.2360679774997896964091736687313");
		String result = dec.pow(num).toPlainString();
		if(result.indexOf('.')!= -1)
			result  = result.substring(0, result.indexOf('.'));
		while(result.length() < 3){
			result = "0" + result;
		}
		result = result.substring(result.length()-3, result.length());
		wr.println(result);
	}

}
