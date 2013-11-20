package src130314;

import java.io.*;
import java.util.*;

public class alien {

	public static void main(String[] args) throws Exception{
		
		Scanner In = new Scanner(new File("d:\\programDATA\\Alien Language\\A-large-practice.in"));
		System.setOut(new PrintStream(new File("d:\\programDATA\\Alien Language\\A-large-practice.out")));
		
		int L = In.nextInt(), D = In.nextInt(), N = In.nextInt();
		String[] dict = new String[D];
		
		for(int i = 0;i < D;i++) dict[i] = In.next();
		In.nextLine();
		for(int cur = 1;cur <= N;cur++){
			
			String input = In.nextLine();
			String[] choices = new String[L];
			Arrays.fill(choices, "");
			
			for(int i = 0, j = 0;i < input.length();i++, j++){
				if(input.charAt(i) == '(')
					for(i = i+1;j < input.length() && input.charAt(i) != ')';i++)
						choices[j] += input.charAt(i);
				else
					choices[j] += input.charAt(i);
				
			}
			
			int count = 0;
			for(int i = 0;i < D;i++)
				if(valid(dict[i], choices))
					count++;
			System.out.println("Case #"+cur+": "+count);
		}
		
	}
	public static boolean valid(String word, String[] choices){
		
		for(int i = 0;i < word.length();i++)
			if(choices[i].indexOf(word.charAt(i)) == -1)
				return false;
		return true;
		
	}
}
