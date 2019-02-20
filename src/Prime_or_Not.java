import javax.swing.JOptionPane;

public class Prime_or_Not {
public static void main(String[] args) {
	

String bob = JOptionPane.showInputDialog("Give me I number I want to eat");
int Bob = Integer.parseInt(bob);	

if(primeOrNot(Bob)) {
JOptionPane.showMessageDialog(null, Bob + " is prime");

}
else{
	JOptionPane.showMessageDialog(null, Bob + " isn't prime");
}
}


static boolean primeOrNot(int num) {
	for(int i=2; i<num-1; i++) {
		if(num%i == 0) {
			return false;
		}
		
			
	}
return true;
	
}
	
}
