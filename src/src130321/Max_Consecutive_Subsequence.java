package src130321;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;
/**
 * 求最大连续子序列
 * @author lhb
 *
 */

public class Max_Consecutive_Subsequence {

	/**
	 * @param args
	 * @throws Exception 
	 */
	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(new File("D:\\ProgramDATA\\Max_Consecutive_Subsequence\\input.txt"));
		//System.out.println("请输入8个实数：");
		double[] input = new double[8];
		
		for (int i = 0; i < input.length; i++) {
			input[i] = in.nextDouble();
		}
		
		double globe_max = 0,suffix_max = 0;
		for (int i = 0; i < input.length; i++) { 
			/**方法1**/
			/*if(input[i]+suffix_max > globe_max){
				suffix_max = suffix_max +input[i];
				globe_max = suffix_max;
			}else if(input[i]+suffix_max > 0)
						suffix_max = suffix_max +input[i];
			     else   suffix_max = 0;*/
			/**方法2**/
			suffix_max = (suffix_max <= 0) ? input[i] : input[i]+suffix_max;
			globe_max = (globe_max < suffix_max) ? suffix_max : globe_max;
		}
		System.out.println(globe_max);
	}

}
