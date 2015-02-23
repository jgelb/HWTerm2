import java.util.*;
import java.io.*;

public class cows{
    int x = 7;
    int y = 5;
    Random r = new Random();
    
    private int[][] field = new int[x][y] ;
    public void fillboard(){
	for (int i = 0, i < field.length, i ++){
	    for (int k = 0, k <field[0].length, k ++){
		field[i][k] = r.nextInt(50);
	    }
	}
    }
    public String toString(){
	String ans = "";
	for (int i = 0, i < field.length, i ++){
	    for (int k = 0, k <field[0].length, k ++){
		ans += field[i][k];
	    }
	    ans += "\n";
	}
    }


    public static void main (String[] args){
	cows a = new cows();
	a.fillboard();
	System.out.println(a);
    }

    
}
