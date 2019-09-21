package domaci_Parcele;

public abstract class Parcela {
	public int id;
	public static int UID = 0;
	protected double povrsina;

	public Parcela(double povrsina) {
		this.povrsina = povrsina;
		id = ++UID;

	}

	public int getId() {
		return id;
	}

	public static int getUID() {
		return UID;
	}

	public double getPovrsina() {
		return povrsina;
	}

	public abstract double izracunajPrinos(int godina);

	public abstract char getVrsta();

	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append(getVrsta()).append("-").append(id).append("[");
		sb.append(povrsina).append("]");
		return sb.toString();
	}
}