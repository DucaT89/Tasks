package domaci_student_profesor;

import java.util.ArrayList;
import java.util.List;

public class Profesor extends Covek {
	/*
	 * Profesor je covek koji ima titulu i listu predmeta na kojima drzi nastavu.
	 * Predmeti mogu da se dodaju i oduzimaju iz liste. Profesora ispisati u
	 * formatu: Ime_Prezime[godina rodjenja] je ___(titula) koji drzi nastavu na:
	 * <lista predmeta>.
	 */
	private String titula;
	public List<String> predmet = new ArrayList<>();

	public Profesor(String ime, String prezime, int godRodjenja, String titula) {
		super(ime, prezime, godRodjenja);
		this.titula = titula;
	}

	public String getTitula() {
		return titula;
	}

	public void setTitula(String titula) {
		this.titula = titula;
	}

	public List<String> getPredmet() {
		return predmet;
	}

	public void setPredmet(List<String> predmet) {
		this.predmet = predmet;
	}

	public String ispisiProfesora() {
		return ime + "_" + prezime + "[" + godRodjenja + "]" + "je " + titula + " koji drzi nastavu na ";
	}
}
