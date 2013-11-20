package src130325;

public class KMP_alg {

	/**
	 * @param args
	 */
	private static final String INPUT = "xyxxyxyxyyxyxyxyyxyxyxx";
	private static final String SUB_STR = "xyxyyxyxyxx";
	private static int[] next; 
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Compute_Next(SUB_STR);
		int i=0,j=0,Start=0;
		while(Start == 0 && i <= INPUT.length()){
			if(SUB_STR.charAt(j)==INPUT.charAt(i)){
				i++;
				j++;
			}
			else {
				j = next[j] + 1;
				if (j == 0) {
					j = 1;
					i = i + 1;
				}
			}
			if(j == SUB_STR.length() + 1)
				Start = i - SUB_STR.length();
		}
		System.out.println(Start);
		
	}
	private static void Compute_Next(String subStr) {
		// TODO Auto-generated method stub
		next = new int[SUB_STR.length()];
		next[0] = -1;
		next[1] = 0;
		int j;
		for (int i = 2; i < next.length; i++) {
			j = next[i-1] + 1;
			while(SUB_STR.charAt(i-2) != SUB_STR.charAt(j) && j>0)
				j = next[j] + 1;
			next[i] = j;
		}
		for (int i = 0; i < next.length; i++) {
			System.out.print(next[i]+" ");
		}
	}

}
