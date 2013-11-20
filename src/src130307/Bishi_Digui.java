package src130307;
/**
 * 笔试的一个关于递归填空题目。
 * 求ack（3，3）的值
 * 答案为：61
 * @author lhb
 */

public class Bishi_Digui {
	
	public static void main(String[] args){
		System.out.println(ack(3,3));
	}

	private static int ack(int m, int n) {
		// TODO Auto-generated method stub
		if(m == 0){
			return n+1;
		}else
		if(n == 0){
			return ack(m-1, 1);
		}else {
			return ack(m-1, ack(m, n-1));
		}
	}
}
