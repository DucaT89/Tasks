package domaciivezbanja;

import java.util.Scanner;

public class Domaci_3_08232019 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.print("Unesite duzinu niza  ");
		int n=sc.nextInt();
		int [] niz=new int[n];
		for (int i = 0; i < niz.length; i++) {
			System.out.println("Unesi element " + i);
			niz[i] = sc.nextInt();}
		int proizvod=proizvodNEPARNIH(niz);
		System.out.println(proizvod);
		int sum=sumaPARNIH(niz);
		System.out.println(sum);
	}
    public static int proizvodNEPARNIH(int[] x) {
    	int br=1;
    	for (int i = 0; i <= x.length-1; i++) {
    		if(x[i]%2==1) {
    		br=br*x[i];
    		}
    	}return br;	
    }
    public static int sumaPARNIH(int[] x) {
    	int sum=0;
    	for (int i = 0; i < x.length-1; i++) {
    		if(x[i]%2==0) {
    		sum=sum+x[i];
    		}
    	}return sum;
}
}