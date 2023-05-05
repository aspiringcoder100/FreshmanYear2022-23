import java.util.Scanner;
public class RegularPolygon {
	public static void main(String[] args) {
	Scanner stdin = new Scanner (System.in);
	
	double n,s;
	System.out.println("Enter the number of sides: ");
	n = stdin.nextDouble();
	
	System.out.println("Enter the side length: ");
	s = stdin.nextDouble();
	double area = n*(s*s) / (4 * Math.tan(Math.PI/n));
	
	
	System.out.println("The area of the polygon is " + area);

		
		
	}

}
