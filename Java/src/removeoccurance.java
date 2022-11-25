import java.util.*;
public class removeoccurance {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter a String: ");
		String str = sc.next();
		System.out.print("Enter character to remove: ");
		char ch = sc.next().charAt(0);
		String ch1 ="";
		String s;
			for(int j=0;j<str.length();j++) {
				if(str.charAt(j)!=ch) {
					ch1=ch1+str.charAt(j);
				}
			}
			System.out.println(ch1);
		}
	}


