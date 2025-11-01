package day09;

public class CalApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		CalculatorDummy c = new CalculatorDummy();
		Calculator c = new Calculator();
		
		c.setOperand(10, 20, 31);
		System.out.println("합계 : " + c.sum());
		System.out.println("평균 : " + c.avg());
	}

}

class CalculatorDummy implements CalculatorI {
	public void setOperand(int a, int b, int c) {
		
	}
	
	public int sum() {
		return 100;
	}
	
	public double avg() {
		return 33.3;
	}
}
