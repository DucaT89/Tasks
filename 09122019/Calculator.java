package calculator_domaci;

public class Calculator {
	private double value;

	public double Value() {
		return value;
	}

	public Calculator add(double c) {
		value += c;
		return this;
	}

	public Calculator sub(double c) {
		value -= c;
		return this;
	}

	public Calculator mult(double c) {
		if (c != 0)
			value *= c;
		return this;

	}

	public Calculator div(double c) {
		if (c != 0)
			value /= c;
		return this;
	}
}
