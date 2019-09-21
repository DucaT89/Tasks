package calculator_domaci;

public class GlavniCalc {

	public static void main(String[] args) {
		Calculator calc = new Calculator();
		double result = calc.add(45).sub(13).mult(3).div(5).Value();
		System.out.println(result);
	}

}
