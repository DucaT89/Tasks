package domaci_student_profesor;

public class Covek {
	/*
	 * Covek ima ime, prezime i godinu rodjenja. Ime i prezime mogu da se i dohvate
	 * i postave, dok godina rodjenja moze samo da se dohvati. Coveka ispisati u
	 * formatu: Ime_Prezime[godina rodjenja].
	 */

	public String ime, prezime;
	int godRodjenja;

	public Covek(String ime, String prezime, int godRodjenja) {
		this.ime = ime;
		this.prezime = prezime;
		this.godRodjenja = godRodjenja;
	}

	public String getIme() {
		return ime;
	}

	public void setIme(String ime) {
		this.ime = ime;
	}

	public String getPrezime() {
		return prezime;
	}

	public void setPrezime(String prezime) {
		this.prezime = prezime;
	}

	public int getGodRodjenja() {
		return godRodjenja;
	}

	public String ispisiCoveka() {
		return ime + "_" + prezime + "[" + godRodjenja + "]";
	}

}
