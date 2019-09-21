package ucionica;

public class Polaznik {
	// Polaznik ima ime i prezime koje se zadaje prilikom kreiranja polaznika.
	// Polaznik poseduje i identifikacioni broj koji se moze dohvatiti.
	// Ime i prezime polaznika se moze dohvatiti ali ne i postaviti.
	// Vozac se ispisuje u obliku: IME_PREZIME{ID}.
	private String ime, prezime;
	private int ID;
	private static int UID = 0;

	public Polaznik(String ime, String prezime) {
		this.ime = ime;
		this.prezime = prezime;
		ID = ++UID;
	}

	public String getIme() {
		return ime;
	}

	public String getPrezime() {
		return prezime;
	}

	public int getID() {
		return ID;
	}

	public static int getUID() {
		return UID;
	}

	public String ispis() {
		return ime + "_" + prezime + "{" + ID + "}";
	}
}
