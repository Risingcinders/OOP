package Calculator;

public class Calculator {
	
	
	public float getOperandOne() {
		return operandOne;
	}
	public void setOperandOne(float operandOne) {
		this.operandOne = operandOne;
	}
	public float getOperandTwo() {
		return operandTwo;
	}
	public void setOperandTwo(float operandTwo) {
		this.operandTwo = operandTwo;
	}
	public char getOperation() {
		return operation;
	}
	public void setOperation(char operation) {
		this.operation = operation;
	}
	
	private float operandOne;
	private float operandTwo;
	private char operation;
	private float results;
	
	public float getResults() {
		return results;
	}
	public void setResults(float results) {
		this.results = results;
	}
	public void performOperation() {
		float output = getOperandOne();
		if (getOperation() == '+') {
			output+= getOperandTwo();
			setResults(output);
		} else if (getOperation() == '-') {
			output -= getOperandTwo();
			setResults(output);
		} else {
			System.out.println("Incorrect Operation, use a single char - or +");
		}
	}
	
}
