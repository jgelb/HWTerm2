
import java.io.*;
import java.util.*;

public class knights {
    private int[][] board = new int[5][5];
    private int size;

    public knights()
    {
        int k = 0;
	for (int i=0;i<board.length;i++){
	    for (int j=0;j<board[0].length;j++){
		board[i][j] = k;
		k ++;
	    }}
    }

    public void print(){
        
	for (int i=0;i<board.length;i++){
	    for (int j=0;j<board[0].length;j++){
	        
		System.out.printf("%3d", board[i][j]);
	    }
	    
	    System.out.printf("\n");
	}
    }


    public static void main(String[] args){
	knights x = new knights();
        x.print();
    }
}
