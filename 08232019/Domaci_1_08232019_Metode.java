package domaciivezbanja;

import java.util.Scanner;

public class Domaci_1_08232019_Metode {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Unesite broj:");
		int n=sc.nextInt();
		System.out.println(inverzniBroj(n));

	}
	public static int inverzniBroj(int x) {
		
		int br=0,c=0;
		while (x!=0) {
			c=x%10;
			 br*=10;
			br+=c;
			x/=10; 
		}return br;
	}

}
