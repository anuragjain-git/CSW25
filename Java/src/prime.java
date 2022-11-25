import java.util.*;
public class prime {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter a number: ");
		int num = sc.nextInt();
		int count = 0;
		
		for(int i=2;i<Math.sqrt(num);i++) {
			if(num%i==0) {
				count++;
			}
		}
		if(count==0) {
			System.out.println(num+" is Prime.");
		}
		else {
			System.out.println(num+" is not a Prime.");
		}
	}

}
