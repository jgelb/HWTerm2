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
    public String allStar(String str) {
	if (str.length() <2 ) {
	    return str;
	}
	else {
	    return (str.charAt(0) + "*" + allStar(str.substring(1)));
	}
	
    }
    public int bunnyEars2(int bunnies) {
	if (bunnies == 0){
	    return 0;
	}
	else if (bunnies == 1){
	    return 2;
	}
	else if (bunnies == 2){
	    return 5;
	}
	else{
	    if (bunnies % 2 == 0){
		return 3 + bunnyEars2(bunnies - 1);
	    }
	    else{
		return 2 + bunnyEars2(bunnies -1);
	    }
	}
    }
    public int sumDigits(int n) {
	if (n == 0){
	    return 0;
	}
	else{
	    return n % 10 + sumDigits(n/10);
	}
    }


    public int strCount(String str, String sub) {
	if (str.length() < sub.length()){
	    return 0;}
	else{
	    if (str.substring(0,sub.length()).equals(sub)){
		return 1 + strCount(str.substring(sub.length()), sub);
	    }
	    else{
		return strCount(str.substring(1), sub);
	    }
	}
    }	    
    public static void main (String[] args) {
	driver x = new driver();
	System.out.println(x.fib(5));
	System.out.println(x.len("chinese"));
	System.out.println(x.x("xylophone"));
	System.out.println(x.allStar("xylophone"));
	
    }
}
