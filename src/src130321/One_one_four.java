package src130321;

import java.io.File;
import java.io.PrintStream;
import java.util.Scanner;
/**
 * 假定在一个谋生的国度，有5种不同的硬币单位15、23、29、41和67（分）。寻找所有组合成18元8分（即1808分）的可能组合。
 * 假定对于所有面值的硬币你都有足够的硬币。
 * @author lhb
 *
 */
public class One_one_four {
	
	
	/**
	 * @param args
	 * @throws Exception 
	 */
	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(new File("D:\\ProgramDATA\\Algorithms\\one\\input.txt"));
		System.setOut(new PrintStream(new File("D:\\programDATA\\Algorithms\\one\\output.txt")));
		
		int sum;
		int[] coins = new int[5];
		//int j = in.nextInt();
		for (int i = 0; i < coins.length; i++) {
			coins[i] = in.nextInt();
		}
		
		sum = in.nextInt();
		
		for (int i1 = 0; i1 < sum/coins[0]; i1++) 
			for (int i2 = 0; i2 < sum/coins[1]; i2++)
				for (int i3 = 0; i3 < sum/coins[2]; i3++)
					for (int i4 = 0; i4 < sum/coins[3]; i4++)
						for (int i5 = 0; i5 < sum/coins[4]; i5++)
							if(coins[0]*i1 + coins[1]*i2 + coins[2]*i3 + coins[3]*i4 + coins[4]*i5 == sum ){
								System.out.println(i1 + " "+i2+ " "+i3+ " "+i4+ " "+i5);
							}
		
	}

}
