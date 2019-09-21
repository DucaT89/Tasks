package domaci_Parcele;

public class Njiva extends Parcela {
	public int godina;
	private double prinosPoKvm;

	public Njiva(double povrsina, double prinosPoKvm) {
		super(povrsina);
		this.prinosPoKvm = prinosPoKvm;

	}

	public int getGodina() {
		return godina;
	}

	public double getPrinosPoKvm() {
		return prinosPoKvm;
	}

	public void setGodina(int godina) {
		this.godina = godina;
	}

	public void setPrinosPoKvm(double prinosPoKvm) {
		this.prinosPoKvm = prinosPoKvm;
	}

	@Override
	public double izracunajPrinos(int godina) {
		double prinos = godina * povrsina * prinosPoKvm;
		return prinos;

	}

	@Override
	public char getVrsta() {

		return 'N';
	}

	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append(super.toString()).append(":").append(prinosPoKvm);
		return sb.toString();
	}
}
