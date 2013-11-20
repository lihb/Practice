package src130321;

import java.util.Scanner;
/**
 * 将正整数的十进制转化成二进制数
 * @author lhb
 *
 */
public class Convert_to_Binary {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);
		System.out.println("请输入正整数：");
		int N = in.nextInt();
		int temp = N;
		StringBuilder sb = new StringBuilder();
			while(temp > 0){
				sb.append(temp % 2);
				temp = temp / 2;
			}
			System.out.println(sb.reverse());
		}
}
