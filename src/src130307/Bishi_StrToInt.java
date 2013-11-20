package src130307;

import java.util.Scanner;

/**
 * 今天去中山参加腾讯广研的笔试，这是一个笔试编程题。
 * 题目是：假设A=1，B=2，C=3.....Z=26,AA=27,BB=28,AC=29...AAA=XXXXX,依此类推，输入一个字符，将其转换成数字输出。
 * @author lhb
 *
 */
public class Bishi_StrToInt {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		System.out.println("请输入字符串：");
		String str = scanner.nextLine();
		int result = StringToInt(str);
		System.out.println("result = " + result );
	}

	private static int StringToInt(String str) {
		// TODO Auto-generated method stub
		int sum = 0;
		int length = str.length()-1;
		String temp = str.toUpperCase();
		for(int i = 0;i < temp.length();i++){
			char up = temp.charAt(i);
			sum += (up - 64)*Math.pow(26, length);
			length --;
		}
		return sum;
	}

}
