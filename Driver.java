import java.util.*;
public class Driver {

	private static final String String = null;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int[]b = new int[5];
		
		Scanner sc = new Scanner(System.in);
		System.out.println("enter the count");
		int counter  = sc.nextInt();
		for(int i=0;i<b.length;i++){
			
			b[i]= counter;
			counter++;
			//b[i]= res*2;
			//System.out.println(b[i]);
			
		}
		
		for(int i=0;i<b.length;i++){
			System.out.println(b[i]);
		}
		
	}

	
}
