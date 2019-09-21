package domaci_student_profesor;

import java.util.ArrayList;
import java.util.List;

public class GlavniProgram {

	public static void main(String[] args) {
		Student s1 = new Student("Dusan", "Bobicic", 1997, "0033/2016", 3, 9.7);
		Student s2 = new Student("Jelena", "Obradovic", 1988, "0034/2016", 3, 9.5);
		Student s3 = new Student("Dusan", "Tanasijevic", 1989, "0123/2016", 1, 8.9);
		List<String> predmet = new ArrayList<>();
		predmet.add("Matematika");
		predmet.add("Srpski jezik");
		predmet.add("Engleski jezik");
		predmet.add("Fizika");
		Profesor p1 = new Profesor("Ivan", "Tokin", 1960, "profesor");
		p1.setPredmet(predmet);
		Profesor p2 = new Profesor("Ana", "Tokin", 1970, "profesorka");
		System.out.println(s1.ispisiStudenta());
		System.out.println(s2.ispisiStudenta());
		System.out.println(s3.ispisiStudenta());
		System.out.println(p1.ispisiProfesora() + p1.getPredmet());
		predmet.remove(1);
		p2.setPredmet(predmet);
		System.out.println(p2.ispisiProfesora() + p2.getPredmet());

	}
}