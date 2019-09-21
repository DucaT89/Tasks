package peta_nedelja;

import java.util.Scanner;

public class Domaci_1_08222019 {

	public static void main(String[] args) {
		// Napisati program u kom se unose 3 realna broja i poziva i
		// ispisuje dve metode(u mainu). Prva metoda vraca proizvod unetih brojeva.
		// Druga metoda ispisuje najmanji od unesenih brojeva.

		Scanner sc = new Scanner(System.in);
		System.out.println("Unesi n,m,k: ");
		double n = sc.nextInt();
		double m = sc.nextInt();
		double k = sc.nextInt();
		double c = proizvod(n, m, k);
		System.out.println(c);
		najmanji(n, m, k);

	}

	public static double proizvod(double x, double y, double z) {
		double mult = x * y * z;
		return mult;
	}

	public static double najmanji(double x, double y, double z) {
		double br = z;
		if (x < y && x < z)
			br = x;
		else if (y < x && y < z)
			br = y;
		System.out.println(br);
		return br;
	}
}
