package domaciivezbanja;

import java.util.Scanner;

public class Zadatak_1_080152019 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		int obj;
		do {
			System.out.println("Izaberite Objekat za koji zelite povrsinu:");
			System.out.println("0 - Izlaz");
			System.out.println("1 = Kocka");
			System.out.println("2 - Kvadar");
			System.out.println("3 - Valjak");
			System.out.println("4 - Lopta");
			obj = sc.nextInt();
			double a, b, r, h;
			switch (obj) {
			case 1:
				System.out.println("Unesite a ");
				a = sc.nextDouble();
				System.out.println("P=" + a * a * a);
				break;
			case 2:
				System.out.println("Unesite a ,b i h");
				a = sc.nextDouble();
				b = sc.nextDouble();
				h = sc.nextDouble();
				System.out.println("P= " + 2 * (a * b + a * h + b * h));
				break;
			case 3:
				System.out.println("Unesite r i h");
				r = sc.nextDouble();
				h = sc.nextDouble();
				System.out.println("P= " + 2 * r * 3.14 * (r + h));
				break;
			case 4:
				System.out.println("Unesite r");
				r = sc.nextDouble();
				System.out.println("P= " + r * r * 3.14);

				break;
			default:
				System.out.println("Los unos!");
				break;
			case 0:
				System.out.println("Izlaz");
				break;

			}
		} while (obj != 0);
	}
}