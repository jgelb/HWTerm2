import java.util.*;
import java.io.*;

public class cows{
    int x = 7;
    int y = 5;
    Random r = new Random();
    
    private int[][] field = new int[x][y] ;
    public void fillboard(){
	for (int i = 0; i < field.length; i ++){
	    for (int k = 0; k <field[0].length; k ++){
		field[i][k] = r.nextInt(50);
	    }
	}
    }
    public void print(){
        
	for (int i = 0; i < field.length; i ++){
	    for (int k = 0; k <field[0].length; k ++){
	        System.out.printf("%3d", field[i][k]);
	    }
	    System.out.printf("\n");
	}
        
    }

    
    public int calcNow(int x, int y, int red){
	int max = 0;
	int[] nums2 = {field[x][y], field[x+1][y],field[x+2][y],field[x][y+1],field[x][y+2],field[x+1][y+1],field[x+1][y+2],field[x+2][y+1],field[x+2][y+2]}  ;
	for (int i = 0; i < 9; i ++){
	    if (nums2[i] > max) {
		max = nums2[i];
	    }
	}
	int target = max - red;
	for (int i =0;i<red;i++) {
	    for (int k = 0 ; k<nums2.length;k++) {
		if (nums2[k]==max){
		    nums2[k] = nums2[k] - 1;
		}
	    }


	    // int[] nums = {field[x][y], field[x+1][y],field[x+2][y],field[x][y+1],field[x][y+2],field[x+1][y+1],field[x+1][y+2],field[x+2][y+1],field[x+2][y+2]}  ;
	    for (int j = 0; j < 9; j ++){
		if (nums2[j] > max) {
		    max = nums2[j];
		}
	    }
	    
	    
	}
	return max;
    }
    
    
    public static void main (String[] args){
	cows a = new cows();
	a.fillboard();
	
        a.print();
	System.out.println (a.calcNow(1,1,4));
	
	a.print();
	
    }

    
}
