
public class Fibonacci {
	
public static void main(String[] args) {
	int f = 1;
	int g = 0;
	int h =f+g;
	System.out.println(g);
	
	for(int i=1;i<13; i++) {
		System.out.println(h);
		
		f = g;
		g = h;
		h = f+g;
	}
}
}
