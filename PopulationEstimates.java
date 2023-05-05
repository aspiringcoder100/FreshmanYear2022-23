import java.util.Scanner;
public class PopulationEstimates {
	public static void main(String[] args) {
	Scanner stdin = new Scanner (System.in);
	
	int year, twodigits, population;
	System.out.println("Enter year: ");	
	year = stdin.nextInt();
	
	twodigits = year % 100;
	
	population = (twodigits - 10) * 3 + 310;
	
	System.out.println("Population estimate (millions of people): " + population);	

	}

}
