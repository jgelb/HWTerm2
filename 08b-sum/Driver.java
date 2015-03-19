import java.util.*;
import java.lang.System;

//try using double "piggy back" pointers
public class Driver{
    public static void main(String[] args) {
	Random r = new Random();
        LList l = new LList();
	
	long t = System.currentTimeMillis();
	System.out.println(t);
	long start, end;

	for (int i=0; i < 100000; i++){
	    l.add(i);
	}
	ArrayList<Integer> x = new ArrayList<Integer>();
	for(int i = 0; i < 100000; i ++){
	    x.add(r.nextInt(100) );
	}
	
	
	
	start = System.currentTimeMillis();
	
        int total = 0;
        
	for(int i = 0; i < 100; i ++){
	    total += x.get(i);
	}
	
	    
	end = System.currentTimeMillis() - start;
	System.out.println(end);
	System.out.println(total);
	System.out.println("----------------------------------");
	start = System.currentTimeMillis();
	
        
        total = 0;
	for(int i = -1; i < 100000; i ++){
	    total += (l.get(i));
	}
	
	    
	end = System.currentTimeMillis() - start;
	
	System.out.println(end);
	System.out.println(total);
	System.out.println("----------------------------------");
	start = System.currentTimeMillis();
	
        total = 0;
        
	for(int i = 0; i < 100000; i ++){
	    total += x.get(i);
	}
	
	    
	end = System.currentTimeMillis() - start;
	
	System.out.println(end);
	System.out.println(total);
	System.out.println("----------------------------------");
    }
    
}
