package grananje;

import java.util.Scanner;

public class Zadatak_2_09082019 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		double a,b,r;
		String s;
		System.out.println("Unesite geom.telo za koji zelite izracunatu povrsinu");
		s=sc.nextLine();
		//treba da se unese i string i double
		switch(s) {
		case "kvadrat":System.out.println("Unesite stranicu");
		a=sc.nextDouble();
		if (a>0) {
		System.out.println("Povrsina kvadrata je "+a*a);}
		else System.out.println("Los unos");break;
		case "krug" : System.out.println("Unesite poluprecnik");
		r=sc.nextDouble();
		if (r>0 ) {
		System.out.println("Povrsina kruga je"+r*r*3.14);} 
		else System.out.println("los unos");break;
		case "pravougaonik":System.out.println("Unesite stranice a i b");
		a=sc.nextDouble();
		b=sc.nextDouble();
		if (a>0 && b>0) {
		System.out.println("Povrsina pravougaonika je "+a*b);}
		else System.out.println("Los unos");break;
		default : System.out.println("Los unos! ");
		
		
		
		}
		
			

	}

}
