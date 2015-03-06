import java.io.*;
import java.util.*;

public class selection {
  
    ArrayList<Integer> x = new ArrayList<Integer>();
    ArrayList<Integer> y = new ArrayList<Integer>();
    Random r = new Random();
    int j = 0;
    /*while (j < 20){
	
	x.add(r.nextInt(50));
	j++;
    }
    */
    int pivate = x.get(0);
    public void doPivate(){
	int k = 0;
	y.add(pivate);
	while (k < x.size()){
	    if (x.get(k) > pivate){
		y.add(x.get(k));
	    }
	    else if (x.get(k) < pivate){
		y.add(0, x.get(k));
	    }
	    else if (x.get(k) == pivate){
		y.add(y.indexOf(pivate), pivate);
	    }
	    k++ ;
	}
    }

    public static void main (String[] args){
	selection a = new selection();
    }

}
