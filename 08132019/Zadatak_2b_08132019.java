package cetvrtanedelja;

import java.util.Scanner;

public class Zadatak_2b_08132019 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Unesite n: ");
		int n = sc.nextInt();
		int sum = 0, br = 0;
		while (br < n) {
			br += 1;
			sum += br;
		}
		System.out.println(sum);

	}

}
