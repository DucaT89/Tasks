package cetvrtanedelja;

import java.util.Scanner;

public class Zadatak_2c_08132019 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Unesite k,zatim n :");
		int k=sc.nextInt();
		int n=sc.nextInt();
		int sum=0;
		
		while (k<n) {
			k+=1;
			sum+=k;
		}
		System.out.println(sum);
		/*meni ovde sabira bez pocetne cifre k,ne znam 
		da li je to ok,znaci ne uzima pocetno k u zbir a ukljucuje n 
		*/

	}

}
