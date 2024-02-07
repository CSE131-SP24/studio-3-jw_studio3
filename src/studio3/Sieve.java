package studio3;
import java.util.Scanner;
public class Sieve {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the maximum number n:");
		int n = scan.nextInt();
		boolean[] primeOrNot = new boolean[n-1];
		
		//set all the numbers in the array to true first
		for (int i = 0; i<primeOrNot.length; i++) {
			primeOrNot[i] = true;
		}
		int index = 0;
		int p = 2;
		int multi = p;
		
		for (int pn = 2; pn <= n-1; pn++) {
			while (!primeOrNot[pn-2] && (pn!=2)) {
				p++;
			}
			index = p-2;
			primeOrNot[index] = true;
		}
		
		for (int i = 2; i<n-1; i++) {
			
			while (multi <= n) {
				multi = i*p;
				index = multi - 2;
				primeOrNot[index] = false;
			}
		
			for (int j = 0; j<n; j++) {
				while(primeOrNot[j]) {
					System.out.println(index+1);
				}
			}
		}
		
		
	

	}

}
