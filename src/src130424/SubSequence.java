package src130424;

import java.util.Scanner;

public class SubSequence {

	/**
	 * @param args
	 * 判断一个序列是不是另一个序列的子序列
	 */
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Scanner in = new Scanner(System.in);
		String parent_str = "abadefghbca";
		String sub_str = "bdfbt";
		
		boolean flag = Cal(parent_str,sub_str);
		
		System.out.println(flag);
	}

	private static boolean Cal(String parent_str, String sub_str) {
		// TODO Auto-generated method stub
		int m = parent_str.length(), n = sub_str.length();
		int pos;
		for (int i = 0; i < n; i++) {
			/*for (int j = 0; j < m; j++) {
				if(sub_str.charAt(i) == parent_str..charAt(j)){
					System.out.print(j+" ");
					break;
				}
			}*/
			pos = parent_str.indexOf(sub_str.charAt(i), i);
			if (pos == -1) 
				return false;	
			else
				System.out.print(pos+" ");
		}
		return true;
	}

}
