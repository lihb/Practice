package com.resizearraystack;

import java.util.Iterator;

public class ResizeArrayStack<Item> implements Iterable<Item> {
	
	private Item[] a = (Item[]) new Object[1];
	private int N = 0;
	
	public boolean isEmpty() {
		return N == 0;
	}
	
	public int size() {
		return N;
	}
	
	private void resize(int max){
		//将栈移动到一个大小为max的新数组，达到动态改变栈大小的效果
		Item[] temp = (Item[])new Object[max];
		for (int i = 0; i < a.length; i++) {
			temp[i] = a[i];
		}
		a = temp;
	}
	
	public void push(Item item) {
		//将元素添加到栈顶
		if(N == a.length) 
			resize(2*a.length);
		a[N++] = item;
	}
	
	public Item pop(){
		//移除栈顶元素
		Item item = a[--N];
		a[N] = null;//避免对象游离
		if(N>0&&N==a.length/4) 
			resize(a.length/2);
		return item;
	}
	
	@Override
	public Iterator<Item> iterator() {
		// TODO Auto-generated method stub
		return new ReverseArrayIterator();
	}
	
	private class ReverseArrayIterator implements Iterator<Item> {
		//支持后进先出的迭代,先进先出的迭代
		private int i = N;
		
		@Override
		public boolean hasNext() {
			// TODO Auto-generated method stub
			return i > 0;
		}

		@Override
		public Item next() {
			// TODO Auto-generated method stub			
			return a[N-(i--)]; //先进先出的迭代
			//return a[--i]; //先进后出的迭代
		}

		@Override
		public void remove() {
			// TODO Auto-generated method stub
			
		}
	}	
}
