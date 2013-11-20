package src130315;

import java.io.BufferedReader;
import java.io.File;
import javax.swing.JFileChooser;
import javax.swing.filechooser.FileNameExtensionFilter;

public class openFile {

	/**
	 * @param args
	 */
	private static File[] files; 
	private static BufferedReader rd = null;
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		openFile();
		System.exit(0);
		
	}
	
	private static  void openFile(){
		File[] fileArray = null;
		JFileChooser  chooser = new JFileChooser();
		FileNameExtensionFilter filter = new FileNameExtensionFilter(
		        "txt,plt文件", "txt","plt");
		chooser.setFileFilter(filter);
		chooser.setMultiSelectionEnabled(true);//支持多选
		int result = chooser.showOpenDialog(null);
		if(result == JFileChooser.APPROVE_OPTION){
			fileArray = chooser.getSelectedFiles();
		}
		
		for (int i = 0; i < fileArray.length; i++) {
			File file = fileArray[i];
			String path  = file.getAbsolutePath();
			System.out.println(path);
	    }
	}

}
