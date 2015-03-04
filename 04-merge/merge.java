import java.io.*;
import java.util.*;
public class merge {
    public static ArrayList<Integer> A = new ArrayList<Integer>();
    public static ArrayList<Integer> B = new ArrayList<Integer>();
    public static int[] C = new int[20];
    public static int[] D = new int[15];
    
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
	int i = 0;
	while (i < 20){
	    C[i] = r.nextInt(50);
	    i ++ ;
	}
	int j = 0;
	while (j < 15){
	    D[j] = r.nextInt(50);
	    j ++ ;
	}
	
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


    //-----------------------------------------------------------------------

    public static int[] combine2( int[] A, int[] B){
	int i = 0;
	int j = 0;
	int c = 0;
        int[] ans = new int[A.length + B.length];
	while (i < A.length && j < B.length ) {
	    if (A[i] < B[j] ){
		ans[c] = A[i] ;
		i ++;
		c ++;
	    }
	    else if (A[i] > B[j] ){
		ans[c] = B[j];
		j ++;
		c ++;
	    }
	    else if (A[i] == B[j] ){
		ans[c]=B[j];
		c += 1;
		i ++;
		ans[c]=A[i];
	        
		j ++;
	    }
	   
	}
	while (i <A.length) { ans[c]= A[i] ;
	    i++; c ++;}
	while (j < B.length){ ans[c]=B[j] ;
	    j++;c ++;}
	return ans;
}
    public static int[] Sub2(int[] base, int first, int last ) {
	int[] ans = new int[first + last + 10];
	int c = 0;
	for (int i = first; i<last; i ++) {
	    ans[c]= base[i];
	    c ++;
	}
	return ans;
    }
    public static int[] mergeSort2(int[] base ) {
	int half = base.length / 2;
	if (base.length <= 1 ) {
	    return base;
	}
	if (base.length == 2){
	    return combine2(Sub2(base , 0,1) , Sub2(base,1,2));
	}
	else {
	    return  combine2 (mergeSort2 (Sub2(base,0,half)) , mergeSort2(Sub2(base, half , base.length)));
	}
        
    }

    //-----------------------------------------------------------------------------
    public static void main (String[] args){
	merge x = new merge();
	System.out.println(x.A);
	//System.out.println(x.B);
	System.out.println();
	//System.out.println(x.combine(A ,B));
	System.out.println(mergeSort(x.A));
	System.out.println(x.C);
	System.out.println(x.combine2(x.C, x.D));
	Sub2(x.C, 0, 12);
	
    }
}
