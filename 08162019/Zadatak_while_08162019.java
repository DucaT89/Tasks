package domaciivezbanja;

import java.util.Scanner;

public class Zadatak_while_08162019 {

	public static void main(String[] args) {
		//Napisati program za prebrojavanje neparnih brojeva od 1 do n.
		// a zatim ispisuje njihovu sumu
		Scanner sc=new Scanner(System.in);
		System.out.println("Unesite n: ");
		int n=sc.nextInt();
		int br=0,i=0,sum=0;
		while (i<n) {
			i++;
			if(i%2==1) {br++; sum+=i;
			System.out.println("Broj "+i);}
		}
		System.out.println("broj neparnih : "+br);
		System.out.println("a njih zbir je : "+sum);

	}

}
