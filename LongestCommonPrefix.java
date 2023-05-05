import java.util.Scanner;
public class LongestCommonPrefix {
	public static void main(String[] args) {
	Scanner stdin = new Scanner (System.in);
	System.out.println("Enter the first string: ");
	String s1 = stdin.nextLine();
	System.out.println("Enter the second string: ");
	String s2 = stdin.nextLine();
	String s3 = common(s1,s2);
	
	if(s3.equals(""))
		System.out.println(s1 + " and " + s2 + " have no common prefix");
	else 
		System.out.println("The common prefix is " + s3);
	}
	
	public static String common (String s1, String s2) {
		String s3 = "";
		int min = (s1.length() > s2.length()) ? s2.length() : s1.length();
		for (int i = 0; i < min; i++)
		if (s1.charAt(i) == s2.charAt(i))
			s3+=s1.charAt(i);
		return s3;
	}
}
