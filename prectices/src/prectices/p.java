
package prectices;
import java.util.Scanner;
public class p {

	public static void main(String[] args) {
		 Scanner sc = new Scanner(System.in);
		 
		 System.out.print("input ->");
		 int n = sc.nextInt();
		 int x = sc.nextInt();
		 
		 int sum[] = new int[n];
		 
		 for(int i=0; i<n; i++) {
		     sum[i] = sc.nextInt();
		  }
		  System.out.print("output ->");
		  for(int i=0; i<sum.length; i++) {
				if(x > sum[i]) {
					
			  		System.out.print( sum[i] + " ");
		     }
		  }
	}	
}
		
		