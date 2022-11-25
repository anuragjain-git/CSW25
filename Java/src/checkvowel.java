import java.util.*;
public class checkvowel {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter a string.");
		String str = sc.next();
		str = str.toLowerCase();
		
		char ch;
		
		for(int i=0;i<str.length()-1;i++) {
			ch = str.charAt(i);
			if(ch=='a' || ch=='e' || ch=='i' || ch=='o' || ch=='u') {
				System.out.print("Vowel is present.");
				break;
			}
		}
	}
}