package src130324;

public class SolveSudoku {
	static int answer = 0;
	static int blan[] = new int[82];
	static int cnt = 0;
	static int sudoku[][]=
		   {{0,6,0,9,0,0,1,0,2},
			{4,0,0,1,0,6,0,0,0},
			{0,8,0,0,2,0,0,0,5},
			{6,3,0,2,0,1,5,0,0},
			{0,0,4,5,3,7,9,0,6},
			{0,0,5,6,0,0,0,3,1},
			{9,0,8,7,6,0,0,1,0},
			{0,0,0,8,0,9,0,0,7},
			{7,0,6,0,0,2,0,0,0}};
	public static void main(String []args){
		for(int i=0; i<9; i++)
			for(int j=0; j<9; j++){
				if(sudoku[i][j]==0)
					blan[cnt++]=9*i + j;
			}
		solve(0, cnt);
		System.out.println(answer);
	}
	public static Boolean checkitnow(int i, int j, int fill){
		//rowcheck
		for(int k=0; k<9; k++){
			if(sudoku[i][k]==fill)
				return false;
		}
		//colcheck
		for(int k=0; k<9; k++){
			if(sudoku[k][j]==fill)
				return false;
		}
		int li = i/3*3;
		int lj = j/3*3;
		for(int k=0; k<3; k++){
			for(int kk=0; kk<3; kk++)
			if(sudoku[li+k][lj+kk]==fill)
				return false;
		}
		return true;
	}
	public static void solve(int k, int ct){
		int i, j;
		if(k<ct&&k>=0){
			i = blan[k]/9;
			j = blan[k]%9;
			for(int fill=1; fill<=9; fill++){
				if(checkitnow(i, j, fill)){
					sudoku[i][j] = fill;
					solve(++k, ct);
					k--;
				}
			}
			
			sudoku[i][j] = 0;
		}
		else{
			answer++; 
			printsudoku();
		}
	}
	public static void printsudoku(){
		for (int m = 0; m < 9; m++) {  
            for (int n = 0; n < 9; n++) {  
                System.out.print(sudoku[m][n] + " ");  
            }  
            System.out.println();  
        } 
		System.out.println();
	}
}
