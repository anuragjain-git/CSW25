import java.util.*;
public class powerrecursion {
	
	public static int pow(int y, int z) {
		if(y==0) {
			return 0;
		}
		if(y==0) {
			return 1;
		}
		else 
			return pow(Math.pow(y, z));
	}
	
	public static int pow1(int xy, int z) {
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter x,y,z: ");
		int x=sc.nextInt();
		int y=sc.nextInt();
		int z=sc.nextInt();
		
		int pow= pow(x,y);
	}

}
