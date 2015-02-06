public class driver{
    public int fib (int n){
	if (n <2){
	    return n;
	}
	else {
	    return fib(n -1) + fib (n -2) ;
	}
    }
    public int len (String s){
	if (s.equals("")){
	    return 0;
	}
	else {
	    return 1 + len(s.substring(1));
	}
    }
    public int x (String s){
	if (s.equals("")){
	    return 0;
	}
	else if (s.charAt(0) == 'x'){
	    return 1 + x(s.substring(1));
	}
	else {
	    return x(s.substring(1));
	}
    }

	    
    public static void main (String[] args) {
	driver x = new driver();
	System.out.println(x.fib(5));
	System.out.println(x.len("chinese"));
	System.out.println(x.x("xylophone"));
    }
}
