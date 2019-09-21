package domaciivezbanja;

import java.util.Scanner;

public class Zadatak_3_for_08162019 {

	public static void main(String[] args) {
		//  Učitati visine za n osoba. Ispisati prosječnu i najveću visinu.
		Scanner sc=new Scanner(System.in);
		System.out.println("Unesite broj osoba : (n)?");
		int i=0;
		double v,avg,sum=0,maxv=0;
		int n=sc.nextInt();
		for(i=1;i<=n;i++) {
			System.out.println("Visina : ");
			v=sc.nextDouble();
			maxv=v;
			sum+=v;
			if(v>maxv)  maxv=v;
		}
		System.out.println("Najvisa osoba ima "+maxv);
		avg=sum/n; System.out.println("Prosecna visina je "+avg);
		
		

	}

}
