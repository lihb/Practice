package src130211;
/**
 * 
 * @author lhb
 *求100-1000以内的三位数的各个位数之和等于5的三位数。
 */
public class Five {

	/**
	 * @param args
	 * 
	 */
	public static void main(String[] args) {
		for (int i = 100; i < 1000; i++) {
			if((Transform(i)  == 5))
				System.out.print(i+" ");
		}
	}

	private static int Transform(int num) {
		// TODO Auto-generated method stub
		int a,b,c;
		a = num%10%10;
		c = num/10%10;
		b = num/100;
		return a + b + c;
	}

}
