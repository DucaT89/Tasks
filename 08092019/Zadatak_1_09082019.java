package grananje;

import java.util.Scanner;

public class Zadatak_1_09082019 {

	public static void main(String[] args) { 
		Scanner sc=new Scanner(System.in);
		System.out.println("Unesite broj ");
		int n=sc.nextInt();
		
		if (n%2==0 && n!=0) {System.out.println("Broj je paran");}
		else if (n==0) {System.out.println("Broj je nula");}
		
		else {System.out.println("Broj je neparan");}
		}

	}


