package day12;

public class CalculableClass implements Calculable {
	public void calculate(int x, int y) {
		System.out.println("[일반 객체]" + (x + y));
	}
}
