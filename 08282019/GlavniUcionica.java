package ucionica;

public class GlavniUcionica {

	public static void main(String[] args) {

		Polaznik p1 = new Polaznik("Dusan", "Tanasijevic");
		Laptop l1 = new Laptop("HP");
		l1.setPolaznik(p1);
		System.out.println(p1.ispis());
		Polaznik pom = l1.getPolaznik();
		System.out.println(l1.getMarka() + " " + pom.ispis());
		l1.resetPolaznik(p1);
		Polaznik p2 = new Polaznik("Dejan", "Ciric");
		l1.setPolaznik(p2);
		System.out.println(l1.ispis());

	}

}
