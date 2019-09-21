package pp;

import java.util.Scanner;

public class Zadatak_2_08082019 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		double o, p, a, b;
		System.out.println("Unesite dimenzije stranica: ");
		a = sc.nextDouble();
		b = sc.nextDouble();
		o = 2 * a + 2 * b;
		p = a * b;
		System.out.println("Obim pravougaonika je : " + o);
		System.out.println("Povrsina pravougaonika je: " + p);

	}

}
