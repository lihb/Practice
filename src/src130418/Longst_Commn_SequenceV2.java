package src130418;

import java.util.Arrays;

public class Longst_Commn_SequenceV2 {

	/**
	 * @param args
	 * 改进版本，不需要方向数组。
	 */
	private static final String STRX = "ABCBDAB";
	private static final String STRY = "BDCABA";
	//private static final String STRX = "10010101";
	//private static final String STRY = "010110110";
	private static String comString = "";
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a[][] = new int[STRX.length()+1][STRX.length()+1];
		a = LCS_length(STRX,STRY);//计算a数组
		
		comString = Print(a,STRX,a.length-1,a[0].length-1);
		System.out.println("common:"+comString);
		
	}

	private static int[][] LCS_length(String X, String Y) {
		// TODO Auto-generated method stub
		int a[][] = new int[X.length()+1][Y.length()+1];
		char b[][] = new char[X.length()][Y.length()];
		for (int i = 0; i < X.length(); i++) {
			a[i][0] = 0;
		}
		for (int j = 0; j < Y.length(); j++) {
			a[0][j] = 0;
		}
		for (int i = 1; i < X.length()+1; i++) {
			for (int j = 1; j < Y.length()+1; j++) {
				if(X.charAt(i-1) == Y.charAt(j-1)){
					a[i][j] = a[i-1][j-1] + 1;
					b[i-1][j-1] = '↖';
				}
				else
				{
					if(a[i-1][j]>=a[i][j-1]){
						a[i][j] = a[i-1][j];
						b[i-1][j-1] = '↑';
					}else {
						a[i][j] = a[i][j-1];
						b[i-1][j-1] = '←';
					}
				}
			}
		}
		for (int i = 0; i < b.length; i++) {
			System.out.println(Arrays.toString(b[i]));
		}
		for (int i = 0; i < a.length; i++) {
			System.out.println(Arrays.toString(a[i]));
		}
		
		return a;
	}
	
	private static String Print(int[][] a,String X, int i, int j) {
		// TODO Auto-generated method stub
		if (i== 0||j== 0) {
			return comString;
		}
		if(a[i-1][j-1]== a[i-1][j]&&a[i-1][j-1]== a[i][j-1]){
			Print(a, X, i-1, j-1);
			comString += X.charAt(i-1);
		}
		else 
			if ((a[i-1][j-1] != a[i-1][j]||a[i-1][j-1] != a[i][j-1])&&a[i-1][j]>=a[i][j-1]) {
				Print(a, X, i-1, j);
			}
		else
			Print(a, X, i, j-1);
		return comString;
	}
	

}
