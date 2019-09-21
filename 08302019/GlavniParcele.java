package domaci_Parcele;

public class GlavniParcele {

	public static void main(String[] args) {
		/*
		 * Parcela p1=new Suma(240,6,4,3); System.out.println(p1.getId());
		 * System.out.println(p1.toString()); Parcela p2=new Njiva(200,5);
		 * System.out.println(p2.toString()); System.out.println(p2.izracunajPrinos(3));
		 * System.out.println(p1.izracunajPrinos(3));
		 */
		Parcela[] niz = new Parcela[6];
		niz[0] = new Suma(240, 6, 40, 3);
		niz[1] = new Suma(1000, 6, 20, 2);
		niz[2] = new Suma(500, 12, 10, 1);
		niz[3] = new Njiva(240, 10);
		niz[4] = new Njiva(800, 5);
		niz[5] = new Njiva(600, 6);

		for (int i = 0; i < niz.length; i++) {
			System.out.println(niz[i].toString() + " prinos je " + niz[i].izracunajPrinos(3));
			System.out.println();
		}

	}

}
