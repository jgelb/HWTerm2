import java.util.*;
import java.io.*;
public class Selection{

 /*
1 select pivot value
2. swap pivot with a[h]
3. li = l hi = h -1
4
while li,h{
if a[li] < p; li++
else swap a[li] and a[hi]; hi --}
then check for location
*/
    public int divide(int[] x , int SI, int EI) {
        
	int spot = x[SI];
	System.out.println(Arrays.toString(x));
	while(SI<EI) {
	    int temp = x[SI];
	    if (x[SI] < spot) {
		SI += 1;
	    }
	    if(x[EI] > spot) {
		EI -= 1;
	    }

	    x[SI] = x[EI];
	    x[EI] = temp;
	}
        
	System.out.println(Arrays.toString(x));
	return SI;
    }
    public int select(int[] A ,int k, int l , int h) {
        
	if (k ==l) {
	    return(divide(A,l,h));
	}
	else{
	    return select(A,k,l+1,A.length-1);
	}
    }

    public static void main(String[] args) {
	Selection a = new Selection() ;
	int[] data = {2,3,16,20,0,9,4,1,65,73};
        
        System.out.println(Arrays.toString(data));
	System.out.println((a.divide(data, 0 , data.length-1)));
	//System.out.println(a.select(data,5,0,data.length-1));
    }
}