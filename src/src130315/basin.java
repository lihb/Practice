package src130315;

import java.io.*;
import java.util.*;

public class basin {

	public static int currBas, H, W;
	public static int[][] alt;
	public static char[][] grid;
	
	public static void main(String[] args) throws Exception{
		
		Scanner In = new Scanner(new File("d:\\programDATA\\Watersheds\\B-small-practice.in"));
		System.setOut(new PrintStream(new File("d:\\programDATA\\Watersheds\\small-output1.out")));
		
		int numCases = In.nextInt();
		
		for(int currCase = 1;currCase <= numCases;currCase++){
			
			H = In.nextInt(); W = In.nextInt();
			alt = new int[H][W];
			grid = new char[H][W];
			currBas = -1;
			
			for(int i = 0;i < H;i++)
				for(int j = 0;j < W;j++)
					alt[i][j] = In.nextInt();
			
			for(int i = 0;i < H;i++) Arrays.fill(grid[i], ' ');
			
			
			for(int i = 0;i < H;i++)
				for(int j = 0;j < W;j++)
					if(grid[i][j] == ' ')
						traverse(i, j);
			
			System.out.println("Case #"+currCase+":");
			for(int i = 0;i < H;i++){
				for(int j = 0;j < W;j++)
					System.out.print(grid[i][j]+" ");
				System.out.println();
			}
			
		}
	}
	
	public static char traverse(int x, int y){
	
		if(grid[x][y] != ' ') return grid[x][y];
		
		int[] coord = {-1, -1};
		int min = Integer.MAX_VALUE;
		
		if((x-1) >= 0 && alt[x-1][y] < alt[x][y] && alt[x-1][y] < min){ coord[0] = x-1; coord[1] = y; min = alt[x-1][y]; }
		if((y-1) >= 0 && alt[x][y-1] < alt[x][y] && alt[x][y-1] < min){ coord[0] = x; coord[1] = y-1; min = alt[x][y-1]; }
		if((y+1) < W && alt[x][y+1] < alt[x][y] && alt[x][y+1] < min){ coord[0] = x; coord[1] = y+1; min = alt[x][y+1]; }
		if((x+1) < H && alt[x+1][y] < alt[x][y] && alt[x+1][y] < min){ coord[0] = x+1; coord[1] = y; min = alt[x+1][y]; }
		
		if(min == Integer.MAX_VALUE){
			currBas++;
			return grid[x][y] = (char)(currBas+'a');
		}
		
		return grid[x][y] = traverse(coord[0], coord[1]);
	
	}
}
