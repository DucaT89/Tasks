package CetvrtaNedelja;

import java.util.Scanner;

public class Zadatak_2_12082019 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Unesite n :");
		int n=sc.nextInt();
		int br=0;
		int sum=0;
		int multi=1;
		while (br<n) {br+=1;
			if (br%2==0) {
			sum+=br;}
			else multi*=br;
			}
		System.out.println(sum);
		System.out.println(multi);

		}
		
		}

	


