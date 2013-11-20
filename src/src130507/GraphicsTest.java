package src130507;

import java.awt.Color;
import java.util.Arrays;

import edu.princeton.cs.introcs.StdDraw;
import edu.princeton.cs.introcs.StdRandom;


public class GraphicsTest {

	/**
	 * 测试stdlib.jar
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*int N = 50;
		StdDraw.setXscale(0, N);
		StdDraw.setYscale(0, N*N);
		StdDraw.setPenRadius(.01);
		for (int i = 1; i <= N; i++)
		{
		   StdDraw.point(i, i);
		   //StdDraw.point(i, i*i);
		   StdDraw.point(i, i*Math.log(i));
		}*/
		int N = 50;
		double[] a = new double[N];
		for (int i = 0; i < N; i++)
		   a[i] = StdRandom.random();
		Arrays.sort(a);
		
		for (int i = 0; i < N; i++)
		{
		    StdDraw.setPenColor(Color.blue);
		    double x = 1.0*i/N;
		    double y = a[i]/2.0;
		    double rw = 0.5/N;
		    double rh = a[i]/2.0;
		    StdDraw.filledRectangle(x, y, rw, rh);
		  
		}
		System.out.println('b'+'c');
	}

}
