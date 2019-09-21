package domaci_student_profesor;

public class Student extends Covek {
	/*
	 * Student je covek koji se kreira sa brojem indeksa i ima trenutnu godinu
	 * studija i trenutni prosek. Sva polja mogu samo da se dohvate. Studenta
	 * ispisati u formatu: Ime_Prezime[godina rodjenja] je student ___ (god studija)
	 * godine studija sa prosekom____ (trenutni prosek).
	 */
	private String brIndexa;
	private int godinaStudija;
	private double prosek;

	public Student(String ime, String prezime, int godRodjenja, String brIndexa, int godinaStudija, double prosek) {
		super(ime, prezime, godRodjenja);
		this.brIndexa = brIndexa;
		this.godinaStudija = godinaStudija;
		this.prosek = prosek;
	}

	public String getBrIndexa() {
		return brIndexa;
	}

	public int getGodinaStudija() {
		return godinaStudija;
	}

	public double getProsek() {
		return prosek;
	}

	public String ispisiStudenta() {
		return ime + "_" + prezime + "[" + godRodjenja + "]" + "je " + "student " + godinaStudija
				+ " godine studija sa prosekom " + prosek;
	}

}
