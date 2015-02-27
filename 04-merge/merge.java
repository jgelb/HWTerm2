import java.io.*;
import java.util.*;
public class merge {
    public static ArrayList<Integer> A = new ArrayList<Integer>();
    public static ArrayList<Integer> B = new ArrayList<Integer>();
    Random r = new Random();
    public merge() {
	A.add(10);
	A.add(35);
	A.add(5);
	A.add(9);
	A.add(1);
	B.add(2);
	B.add(4);
	B.add(6);
	B.add(8);
	B.add(10);
	B.add(12);
	B.add(15);
    }
    public static ArrayList<Integer> combine( ArrayList<Integer> A, ArrayList<Integer> B){
	int i = 0;
	int j = 0;
	ArrayList<Integer> ans = new ArrayList<Integer>();
	while (i < A.size() && j < B.size() ) {
	    if (A.get(i) < B.get(j) ){
		ans.add(A.get(i)) ;
		i ++;
	    }
	    else if (A.get(i) > B.get(j) ){
		ans.add(B.get(j));
		j ++;
	    }
	    else if (A.get(i) == B.get(j) ){
		ans.add(B.get(j));
		ans.add(A.get(i));
		i ++;
		j ++;
	    }
	}
	while (i < A.size()){ ans.add(A.get(i)) ;
	    i++;}
	while (j < B.size()){ ans.add(B.get(j)) ;
	    j++;}
	return ans;
    }
    public static ArrayList<Integer> Sub(ArrayList<Integer> base, int first, int last ) {
	ArrayList<Integer> ans = new ArrayList<Integer>();
	for (int i = first; i<last; i ++) {
	    ans.add(base.get(i));
	}
	return ans;
    }
    public static ArrayList<Integer> mergeSort(ArrayList<Integer> base ) {
	int half = base.size() / 2;
	if (base.size() == 1 ) {
	    return base;
	}
	else {
	   return  combine (mergeSort (Sub(base,0,half)) , mergeSort(Sub(base, half , base.size())));
	}
        
    }
    public static void main (String[] args){
	merge x = new merge();
	System.out.println(x.A);
	System.out.println(x.B);
	System.out.println();
	//System.out.println(x.combine(A ,B));
	System.out.println(mergeSort(x.A));
    }
}
