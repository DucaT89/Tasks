package peta_nedelja;

import java.util.Scanner;

public class Zadatak_1_08212019 {

	public static void main(String[] args) {
//Korisnik ucitava niz od n elemenata niza, kao i neko broj br.
		// Program ispisuje elemente niza deljive brojem br.
		Scanner sc = new Scanner(System.in);
		System.out.print("Unesite duzinu niza(n) : ");
		int n = sc.nextInt();
		System.out.print("Unesite broj : ");
		int br = sc.nextInt();
		int[] niz = new int[n];
		for (int i = n - 1; i >= 0 && i < niz.length; i--) {
			System.out.println("Unesite" + " " + i + " element: ");
			niz[i] = sc.nextInt();
		}
		for (int i = n - 1; i >= 0 && i < niz.length; i--)
		// mozda moze condition u for petlji drugacije da se definise
		{
			if (niz[i] % br == 0) {
				System.out.print(niz[i] + " ");
			}
		}
	}

}
