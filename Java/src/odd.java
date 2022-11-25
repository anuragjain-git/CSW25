import java.util.*;
public class odd {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter number of elements you want to store: ");
		int n = sc.nextInt();
		int x[] = new int[n];
		int count = 0;
		for(int i=0;i<n;i++) {
			System.out.println("Enter a number:");
			x[i] = sc.nextInt();
		}
		for(int i=0;i<n;i++) {
			if(x[i]%2==0) {
				System.out.println("It contains even number.");
				break;
			}
			else {
				count++;
			}
		}
		if(count==n) {
			System.out.println("It contains odd numbers.");
		}
	}

}
