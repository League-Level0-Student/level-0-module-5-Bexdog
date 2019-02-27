package nested_loops;

public class For_loop_gauntlet {
public static void main(String[] args) {
	
	for(int i=0;i<101;i++) {
	System.out.println(i);
	}
	for(int i=100;i>-1;i--) {
		System.out.println(i);
		}
	for(int i=2;i<100;i++) {
		if(i%2==0) {
		System.out.println(i);
		}
		}
	for(int i=2;i<100;i++) {
		if(i%2==1) {
		System.out.println(i);
		}
		}
	for(int i=0;i<501;i++) {
		if(i%2==0) {
		System.out.print(i);
		System.out.println(" even");
		}
		if(i%2==1) {
			System.out.print(i);
			System.out.println(" odd");
			}
		}
	for(int i=0;i<778;i++) {
		if(i%7==0) {
		System.out.println(i);
		}
		}
	for(int i=2007;i<2020;i++) {
		 {
		System.out.print("In "+i+", ");
		System.out.println("I was " + (i-2007));
		}
	
	
	

	
	}}}

