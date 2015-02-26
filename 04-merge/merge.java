public class merge {
    
    ArrayList<Integer> A = new ArrayList<Integer>();
    ArrayList<Integer> B = new ArrayList<Integer>();

    public ArrayList<Integer> combine(){
	int i = 0;
	int j = 0;
	ArrayList<Integer> ans = new ArrayList<Integer>();
	
	while (i < A.size() || j < B.size() ) {
	    if (i >= A.size() || j >= B.size() ){
	    }
	    
	    else if (A.get(i) < B.get(j) ){
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
	return ans;
	}
    
    public static void main (String[] args){
	merge x = new merge();
    }
}
