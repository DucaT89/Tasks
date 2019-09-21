package sesta_nedelja_domaci;

public class Knjige {
	//Napisati klasu Knjige koja ima sledeca polja:
	//naziv knjige, autora, broj strana, godinu izdanja. 
	//Sva polja mogu da se dohvate, a godina izdanja moze i da se postavi.
	//Napisati glavni program koji kreira tri knjige i ispisuje sve njihove podatke.

	private String nazivKnjige,autor;
	private int brojSt,godIzdanja;
	
	public Knjige(String nazivKnjige,String autor,int brojSt) {
		this.nazivKnjige=nazivKnjige;
		this.autor=autor;
		this.brojSt=brojSt;
	}
	
	public String getNazivKnjige() {
		return nazivKnjige;
	}
	public String getAutor( ) {
		return autor;
	}
	public int getBrojSt() {
		return brojSt;
	}
	public int getGodIzdanja() {
		return godIzdanja;
	}	
	public void setGodIzdanja(int godIzdanja) {
		this.godIzdanja=godIzdanja;
	}

}
