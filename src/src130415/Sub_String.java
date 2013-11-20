package src130415;

import java.util.Arrays;


public class Sub_String {

	/**
	 * @param args
	 * @throws Exception 
	 */
	private static int count = 0;
	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		//Scanner in = new Scanner(new File("d:\\ProgramDATA\\Welcome to Code Jam\\C-small-practice.in"));
		String parString  = "welcoooooooooome to code jam";
		String subString = "welcome to code jam";		
		int p_len = parString.length();
		int s_len = subString.length();
		int array[] = new int[s_len];
		printf(parString,subString,array,p_len ,s_len,0,0,0);
		//System.out.println(count);

	}

	private static void printf(String parString, String subString, int[] array,
			int p_len, int s_len, int print_arr_num,int p_start_num, int s_start_num) {
		// TODO Auto-generated method stub
		int pStartnum = p_start_num;
		int sStartnum = s_start_num;
		int printNum = print_arr_num;
		if(printNum == s_len){
			System.out.println(Arrays.toString(array));
			//count++;
		}
		for (int i = pStartnum; i < p_len; i++) {
			for (int j = sStartnum; j < s_len; j++) {
				if(parString.charAt(i) == subString.charAt(j)){
					array[printNum] = i;
					pStartnum = i;
					sStartnum = j;
					printf(parString, subString, array, p_len, s_len, printNum+1, pStartnum+1, sStartnum+1);
				}
			}
		}
				
		
	}

}
