package src130315;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintStream;
import java.util.Arrays;
import java.util.Scanner;

public class Watersheds {

	/**
	 * 2009年 google code jam资格赛
	 * @param args
	 * @throws Exception 
	 */
	private static int H, W, curBase;
	private static int[][] input;
	private static char[][] result;
	
	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(new File("d:\\programDATA\\Watersheds\\B-small-practice.in"));
		System.setOut(new PrintStream(new File("d:\\programDATA\\Watersheds\\B-small-practice.out")));
		int T = in.nextInt();
		for (int cur = 0; cur < T; cur++) {
			H = in.nextInt(); W = in.nextInt();
			input = new int[H][W];
			result = new char[H][W];
			curBase = -1;
			
			/*初始化输入数组*/
			for (int i = 0; i < H; i++) {
				for (int j = 0; j < W; j++) {
					input[i][j] = in.nextInt();
				}
			}
			/*初始化结果数组*/
			for (int i = 0; i < H; i++) Arrays.fill(result[i], ' ');
			
			for (int i = 0; i < H; i++) 
				for (int j = 0; j < W; j++) 
					if(result[i][j] == ' ')
						calc(i,j);

			
			System.out.println("Case #"+(cur+1)+":");
			
			for (int i = 0; i < H; i++) {
				for (int j = 0; j < W; j++) {
					System.out.print(result[i][j]+" ");
				}
				System.out.println();
			}
		}
	}

	private static char calc(int x, int y) {
		// TODO Auto-generated method stub
		if(result[x][y] != ' ') return result[x][y];
		
		int[] coord = {-1,-1};
		int min = Integer.MAX_VALUE;
		
		if(x - 1 >= 0 && input[x - 1][y] < input[x][y] && input[x - 1][y] < min) {coord[0] = x - 1;coord[1] = y;min = input[x - 1][y];}
		if(y - 1 >= 0 && input[x][y - 1] < input[x][y] && input[x][y - 1] < min) {coord[0] = x;coord[1] = y - 1;min = input[x][y - 1];}
		if(x + 1 < H && input[x + 1][y] < input[x][y] && input[x + 1][y] < min) {coord[0] = x + 1;coord[1] = y;min = input[x + 1][y];}
		if(y + 1 < W && input[x][y + 1] < input[x][y] && input[x][y + 1] < min) {coord[0] = x;coord[1] = y + 1;min = input[x][y + 1];} 
		
		if(min == Integer.MAX_VALUE){
			curBase++;
			return result[x][y] = (char)(curBase + 'a');
		}
		return result[x][y] = calc(coord[0],coord[1]);
	}

}
