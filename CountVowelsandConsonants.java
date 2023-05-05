import java.util.*;
public class CountVowelsandConsonants {
	public static void main(String[] args) {
	Scanner stdin = new Scanner (System.in);
	System.out.println("Enter a string: ");
	String s = stdin.nextLine();
	int vowels = 0, consonants = 0;
	for (int i = 0; i < s.length(); i++) {
		char c = Character.toLowerCase(s.charAt(i));
		if (c=='a'||c=='e'||c=='i'||c=='o'||c=='u')
			vowels++;
		if(Character.isLetter(c) && c!='a'||c!='e'||c!='i'||c!='o'||c!='u')
			consonants++;
	}
	System.out.println("The number of vowels: " + vowels);
	System.out.println("The number of consonants: " + consonants);

	}
}
