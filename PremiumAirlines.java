import java.util.*;
public class PremiumAirlines {
	public static void main(String[] args) {
	Scanner stdin = new Scanner (System.in);
	
	System.out.println("Please enter membership (Diamond/Platinum/Regular): ");
	String membership = stdin.nextLine();
	
	System.out.println("Please enter ticket price: ");
	int ticketprice = stdin.nextInt();
	
	System.out.println("Please enter current points: ");
	int points = stdin.nextInt();
	
	if ((membership.equals("Diamond") || membership.equals("Platinum")) 
			&& (ticketprice >= 5000)) {
		System.out.print("Points: " + (points + 35));
	}
	
	else if (membership.equals("Diamond") && (ticketprice >= 2000) 
			&& points > 300) {
		System.out.print("Points: " + (points + 30));
	}
	
	else if (membership.equals("Platinum") && (ticketprice >= 2000)) {
		System.out.print("Points: " + (points + 20));
	}
	
	else if (membership.equals("Diamond") && ticketprice >= 500
			&& points >= 100) {
		System.out.print("Points: " + (points + 10));
	}
	
	else if (membership.equals("Regular") && ticketprice >= 5000) {
		System.out.print("Points: " + (points + 5));
	}
	
	else if (membership.equals("Diamound") && points >= 5) {
		System.out.print("Points: " + (points + 2));
	}
	
	}

}
