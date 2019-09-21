package domaciivezbanja;

import java.util.Scanner;

public class Zadatak_if_08162018 {

	public static void main(String[] args) {
		//Učitatii a,b, ako je a veće od b onda je c=2a-b, inače je c=a+2b.
		Scanner sc=new Scanner(System.in);
		System.out.println("Unesite a i b");
		int a=sc.nextInt();
		int b=sc.nextInt();
		int c;
		if (a>b) {
			c=2*a-b;
		}
		else {c=a+2*b; }
		System.out.println(c);
	}

}
