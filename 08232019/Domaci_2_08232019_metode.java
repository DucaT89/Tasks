package domaciivezbanja;

import java.util.Scanner;

public class Domaci_2_08232019_metode {

	public static void main(String[] args) {
		/*Napisati program koji ucitava tri cela broja 
		 * i metodu koja ispisuje
		 *  brojeve od prvog do drugog (ukljucujuci i njih)
		 *   koji su deljivi trecim
		 * */
  System.out.println("UNOSIMO BROJEVE n,k, i m");  
       Scanner sc=new Scanner(System.in);
       int n=sc.nextInt();
       int k=sc.nextInt();
       int m=sc.nextInt();
      if (n<k)
     deljiviTrecimBrojem(n,k,m);
      else System.out.println("broj N mora biti veci od K");
     }
     public static void deljiviTrecimBrojem(int x,int y,int z) {
    	 
    while(x<=y) { x+=1; 
    if (x%z==0){
    	System.out.print(" "+x);}
    
    }
    }
}
/*}
     public static void unosBroja(int x) {
         Scanner sc=new Scanner(System.in);
    	 System.out.println("Unesite broj");
    	  x=sc.nextInt();
    	*/


