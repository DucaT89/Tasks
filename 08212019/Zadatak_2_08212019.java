package peta_nedelja;

import java.util.Scanner;

public class Zadatak_2_08212019 {

	public static void main(String[] args) {
		/*Napisati program koji ucitava duzinu niza, 
		 * niz i ispisuje niz inverznim redosledom.
		 * Primer niza: 3 54 123 18
         * Ispis: 18 123 54 32
		 */
		Scanner sc=new Scanner(System.in);
		System.out.print("Unesite duzinu niza:");
		int n=sc.nextInt();
		int[] vag = new int[n];
		for (int i = 0; i < vag.length; i++) {
			System.out.print("Unesite element:" + i+ "   ");
			vag[i] = sc.nextInt();
		}
		for (int i = n-1; i >=0; i--) {
			System.out.print(vag[i]+" ");
		}
		



	}

}
