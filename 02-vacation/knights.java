
import java.io.*;
import java.util.*;

public class knights {
    private int[][] board = new int[9][9];
    private int size;
    private boolean solved = false; 
    private static int count = 0;
    public knights(int x, int y)
    {
        int k = 0;
	for (int i=0;i<board.length;i++){
	    for (int j=0;j<board[0].length;j++){
		if (j == 0|| j == 1 || j == 7 || j == 8 || i ==0 ||i == 1|| i == 7 || i == 8){
		    board[i][j]= -1;
		}
	        else{
		    board[i][j] = 30;
		    k ++;
		}
	    }}
	board[x][y] = 30;
    }

    public void print(){
        
	for (int i=0;i<board.length;i++){
	    for (int j=0;j<board[0].length;j++){
	        
		System.out.printf("%3d", board[i][j]);
	    }
	    
	    System.out.printf("\n");
	}
    }
    
    public void doMove(int x, int y, int count){
        
	if (solved || board[x][y] != 0 ){
	    return;
	}
	if (count== 24){
	    print();
	    solved = true;
	}

        board[y][x] = count;
	count +=1;
        doMove(x+2,y-1, count + 1);
	doMove(x+2,y+1, count + 1);
	doMove(x+1,y-2, count + 1);
	doMove(x+1,y+2, count +1 );
        doMove(x-2,y-1,count +1 );
	doMove(x-2,y+1,count +1 );
	doMove(x-1,y-2,count +1 );
	doMove(x-1,y+2,count +1 );
	if (!solved){
	    count = count - 1;
	    board[x][y]=0;
	}

    }
    public static void main(String[] args){
	knights x = new knights(3,4);
        x.print();
        x.doMove(2,2,1);
    }
}
