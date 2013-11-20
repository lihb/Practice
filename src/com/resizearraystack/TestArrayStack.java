package com.resizearraystack;

import edu.princeton.cs.introcs.StdOut;

public class TestArrayStack {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ResizeArrayStack<String> str = new ResizeArrayStack<String>();
		str.push("lhb");
		str.push("lhh");
		
		StdOut.println(str.size());
		//StdOut.println(str.pop());
		for (String string : str) {
			StdOut.println(string);
		}

	}

}
