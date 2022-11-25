import java.util.*;
public class sameelement {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter two String: ");
		String x = sc.next();
		String y = sc.next();
		boolean b=true;
		for(int i=0;i<y.length();i++) {
			if(x.indexOf(y.charAt(i))==-1) {
				b=false;
				break;
			}
		}
		for(int i=0;i<x.length();i++) {
			if(y.indexOf(x.charAt(i))==-1) {
				b=false;
				break;
			}
		}
		System.out.println(b);
	}
}