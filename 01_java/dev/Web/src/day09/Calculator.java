package day09;

public class Calculator implements CalculatorI {
		int v1, v2, v3;
		
		public void setOperand(int f, int s, int t) {
			v1 = f;
			v2 = s;
			v3 = t;
		}
		
		public int sum() {
			int result = 1000;
			result = v1 + v2 + v3;
			return result;
		}
		
		public double avg() {
			// 소수점 3자리까지만 구하시오.
			return (int)(sum()/ 3.0 * 1000) / 1000.0;
		}
}
