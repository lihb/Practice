package src130211;
/**
 * 
 * @author lhb
 *求1000以内的阿姆斯特朗数
 * 阿姆斯特朗数的意思是一个正整数等与其各个数字的立方和
 * 
 */
public class Amusitelang {

	/**
	 * @param args
	 * 
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		for (int i = 1; i < 1000; i++) {
			int sum = 0;
			int temp = i;
			while(temp >= 1){
				sum += Math.pow(temp % 10, 3);
				temp /=  10;
			}
			if(sum == i) 
				System.out.print(i+" ");
		}
		
	}

}
