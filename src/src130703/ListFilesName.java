package src130703;

import java.io.File;
import java.util.ArrayList;
import java.util.Scanner;
/*
 * 列出当前文件夹下面所有子文件的名字和子文件夹。文件夹为空的话就忽略该文件夹。
 */
public class ListFilesName {

	/**
	 * @param args
	 */
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("--------------------------------------------");
		System.out.println("请选择要执行的方法:法1，不打印空文件夹，法2，打印空文件夹。");
		System.out.println("输入1，执行方法1，输入2，执行方法2，输入其他int值，退出此程序。");
		System.out.println("--------------------------------------------");
		Scanner in = new Scanner(System.in);
		String[] list=new String[]{};
		ArrayList<String> fileList;;
		while(true){
			int num = in.nextInt();
			switch (num) {
			case 1:
				fileList = new ArrayList<String>();
				list  = listfiles1(new File("e:\\test"),"",fileList);
				break;
			case 2:
				fileList = new ArrayList<String>();
				list  = listfiles2(new File("e:\\test"),"",fileList);
				break;	
			}
			if(num!=1&&num!=2) break;
			
			for (int i = 0; i < list.length; i++) {
				System.out.println(list[i]);
			}
		}
	}
	// 版本1：文件夹为空的话就忽略该文件夹。
	private static String[] listfiles1(File file,String parent,ArrayList<String> fileList) {
		// TODO Auto-generated method stub
		File f[] = file.listFiles();
		if (f.length > 0) {
			sort(f);
			for (int i = 0; i < f.length; i++) {
				if (f[i].isDirectory()) {
					parent += f[i].getName()+File.separator;
					listfiles1(f[i], parent,fileList);
					parent="";
				}else {
					fileList.add(parent+f[i].getName().toString());
				}
			}
		}
		
		return fileList.toArray(new String[1]);
	}
	
	// 版本2：文件夹为空,也打印出来。
	private static String[] listfiles2(File file,String parent,ArrayList<String> fileList) {
		// TODO Auto-generated method stub
		File f[] = file.listFiles();
		if (f.length > 0) {
			sort(f);
			for (int i = 0; i < f.length; i++) {
				if (f[i].isDirectory()) {
					parent += f[i].getName()+File.separator;
					listfiles2(f[i], parent,fileList);
					parent="";
				}else {
					fileList.add(parent+f[i].getName().toString());
				}
			}
		}else{
			fileList.add(parent);
		}
			
		
		return fileList.toArray(new String[1]);
	}
	

	private static void sort(File[] f) {
		// TODO Auto-generated method stub
		for (int i = 0; i < f.length-1; i++) {
			for (int j = i+1; j < f.length; j++) {
				if(f[i].isDirectory()&&f[j].isFile()){
					File temp = f[i];
					f[i] = f[j];
					f[j] = temp;
				}					
			}
		}
	}

}
