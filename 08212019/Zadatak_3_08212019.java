package peta_nedelja;

import java.util.Scanner;

public class Zadatak_3_08212019 {

	public static void main(String[] args) {
		/*
		 * Napisati program koji ucitava duzinu niza, niz i proverava da li je niz
		 * rastuci. Primer1 niza: 3 54 123 18 Ispis: Niz nije rastuci. Primer2 niza: 71
		 * 422 1001 5050 Ispis: Niz je rastuci.
		 */
		Scanner sc = new Scanner(System.in);
		System.out.print("Unesite duzinu niza:");
		int n = sc.nextInt();
		int[] a = new int[n];
		boolean jeRastuci=true;
		int i=0;
		for ( i = 0; i < a.length; i++) {
			System.out.print("Unesite " + i + " element: " + "   ");
			a[i] = sc.nextInt();
		}
		for (int j = 0; j < a.length-1; j++) {
		if( a[j]>=a[j+1]){jeRastuci=false;
		} 
		if(jeRastuci=true) {System.out.println("rastuci");}
		else System.out.println("nije rastuci");
		}
		
		
		
		
		/*int i = 0;
		while (i < n - 1 && br<=n-1 ) {
			if (a1[i] > a1[i + 1]) {
				System.out.println("niz nije rastuci");}
				br += 1;
				i++;}
			if (br==n-1)	System.out.println("niz je rastuci");
				}*/
	/*	String s="";
		for (int i = 0; i < a1.length; i++) {

			while (a1[i]<a1[i+1]) s="rastuci";
			
			System.out.println(s);}
		
		if (a1[i]>a1[i+1]) s="nije rastuci";}*/
		
}
}

