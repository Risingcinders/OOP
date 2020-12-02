package Calculator;

public class Calctest {
	public static void main(String[] args) {
		
		Calculator calc = new Calculator();
		
		calc.setOperandOne((float) 10.5);
		calc.setOperation('+');
		calc.setOperandTwo((float) 5.2);
		calc.performOperation();
		System.out.println(calc.getResults());
		
	}
}
