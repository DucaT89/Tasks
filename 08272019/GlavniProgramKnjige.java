package sesta_nedelja_domaci;

public class GlavniProgramKnjige {

	public static void main(String[] args) {
   //Napisati glavni program koji kreira tri knjige i ispisuje sve njihove podatke.
	System.out.println("Ispod ce te videti Knjigu,Pisca,Broj Strana i godinu izdanja");
	System.out.println();
     Knjige k=new Knjige("Alhemicar","Paulo Coelho",154);
     k.setGodIzdanja(1988);
     System.out.println(k.getNazivKnjige()+"  "+k.getAutor()+"  "+k.getBrojSt()+"  "+k.getGodIzdanja() );
     Knjige k2=new Knjige("Znakovi pored puta","Ivo Andric",476);
     k2.setGodIzdanja(1976);
     System.out.println(k2.getNazivKnjige()+"  "+k2.getAutor()+"  "+k2.getBrojSt()+"  "+k2.getGodIzdanja() );
     Knjige k3=new Knjige("Zapisi iz podzemlja","F.Dostojevski",332);
     k3.setGodIzdanja(1864);
     System.out.println(k3.getNazivKnjige()+"  "+k3.getAutor()+"  "+k3.getBrojSt()+"  "+k3.getGodIzdanja() );

     

     
	}

}
