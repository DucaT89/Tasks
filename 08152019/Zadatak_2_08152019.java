package domaciivezbanja;

import java.util.Scanner;

public class Zadatak_2_08152019 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Unesite n");
		int n=sc.nextInt();
		int br,f=0,f1=1,fn;
		System.out.print(f+" "+f1); // da mi uvek ispise 0 i 1
		for (br=2;br<n;++br) {
			fn=f+f1;
			System.out.print(" "+fn); // razmak + zbir predhodna dva
			f=f1;
			f1=fn;
		}

	}

}
