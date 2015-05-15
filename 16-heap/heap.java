import java.util.*;
import java.io.*;

public class heap {
    ArrayList<Integer> stuff = new ArrayList<Integer>;


    public int left(int n){
	return 1 + 2*n;
    }

    public int right (int n){
	return 2 + 2*n;
    }
    public int parent (int n) {
	return (n-1)/2;
    }
    
    public boolean switch (int x , int y){
	int child = stuff.get(y);
	int parent = stuff.get(x);

	if (parent > child){
	    stuff.set(y, parent);
	    stuff.set(x, child);
	    return true;
	}
	else {
	    return false;
	}
    }
    public void push (int n){
	while (!isLeaf(n)){
	    int left = getLeft(n);
	    int right =getRight(n);
	    if (switch(n, right) ){
		n = right;
	    }
	    else if (switch (n, left)){
		n = left;
	    }
	    else {
		//Do nothing or return
		return;
	    }
	}
    }

    public void sift(int n){
	while (!Root(n)){
	    int parent = parent(n);
	    if (switch (parent,n)){
		n = parent;
	    }
	    else {
	        //do nothing
		return;
	    }
	}
    }
	

	       
    public int getMin (){
	return stuff.get(0);
    }

    public void remove(){
	int tmp = getMin();
	stuff.set(0, stuff.get(stuff.size() - 1) );
	push(0);
	
        //Insert code here
        
    }

    
