package src130314;

import java.util.ArrayList;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Regex_Test {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str = "ab(bc)(dx)(dd)tat";
		Pattern p = Pattern.compile("\\(\\w*\\)");
		Matcher m = p.matcher(str);
		StringBuffer sb = new StringBuffer();
		ArrayList<String> list = new ArrayList<String>();
		while(m.find()) {
			String group = m.group();
			list.add(group);
			//System.out.println(group);
			m.appendReplacement(sb, " ");
		}
		m.appendTail(sb);
		
		String[] str1 = new String[list.size()];
		for (int i = 0; i < str1.length; i++) {
			String s = list.get(i);
			str1[i] = s.substring(s.indexOf('(')+1,s.indexOf(')'));
			System.out.println(str1[i]);
		}
		String[] str2 = sb.toString().split("\\s+");
		for(String s : str2) {
			System.out.println(s);
		}

	}

}
