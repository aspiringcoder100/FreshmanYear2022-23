import java.util.Scanner;
public class CarInsurance {
	public static void main(String[] args) {
	Scanner input = new Scanner(System.in);
	
	int age;
	double premium, paid;
	String gender = "";
	
	System.out.println("Please enter in either Male or Female for gender:");
	gender = input.nextLine();
	
	System.out.println("Please enter in the premium price of the auto insurance policy:");
	premium = input.nextDouble();
	
	System.out.println("Please enter in the person's age:");
	age = input.nextInt();
	
	if ((age >= 18 && age < 21) && gender.equals("Male")) {
		paid = premium * 1;
		System.out.println("Premium: $" + paid);
	}
	
	else if ((age >= 18 && age < 21) && gender.equals("Female")) {
		paid = premium * .9;
		System.out.println("Premium: $" + paid);
	}
	
	else if (age >= 21 && age < 30) {
		paid = premium * .75;
		System.out.println("Premium: $" + paid);
	}
	
	else if ((age >= 30 && age < 60) && gender.equals("Male")) {
		paid = premium * .6;
		System.out.println("Premium: $" + paid);
	}
	
	else if ((age >= 30 && age < 60) && gender.equals("Female")) {
		paid = premium * .7;
		System.out.println("Premium: $" + paid);
	}
	
	else if (age > 60) {
		paid = premium * 1;
		System.out.println("Premium: $" + paid);
	}
	
	}
}
