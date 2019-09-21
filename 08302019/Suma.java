package domaci_Parcele;

public class Suma extends Parcela {
	private double prinos;
	private double povrsinaStab, prinosStab;
	int godina, godSazrevanja;

	public Suma(double povrsina, double povrsinaStab, double prinosStab, int godSazrevanja) {
		super(povrsina);
		this.povrsinaStab = povrsinaStab;
		this.prinosStab = prinosStab;
		this.godSazrevanja = godSazrevanja;
	}

	@Override
	public char getVrsta() {

		return 'S';
	}

	public double getPrinos() {

		return prinos;
	}

	public int getGodina() {
		return godina;
	}

	public void setGodina(int godina) {
		this.godina = godina;
	}

	public double getPovrsinaStab() {
		return povrsinaStab;
	}

	public double getPrinosStab() {
		return prinosStab;
	}

	public int getGodSazrevanja() {
		return godSazrevanja;
	}

	@Override
	public double izracunajPrinos(int godina) {
		if (godina > 0 && godSazrevanja > 0)
			prinos = povrsina / povrsinaStab * prinosStab * (godina / godSazrevanja);
		else
			System.out.println("unesite tacnu godinu");
		return prinos;

	}

	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append(super.toString()).append(":").append("(").append(povrsinaStab).append(",");
		sb.append(prinosStab).append(",").append(godSazrevanja).append(")");
		return sb.toString();

	}

}
