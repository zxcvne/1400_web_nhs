package day09;

import java.text.SimpleDateFormat;
import java.util.Date;

public class ExceptionTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		CalculatorEx c = new CalculatorEx();
		c.setOperand(100, 27);
		c.divide1();

		c.setOperand(100, 0);
		c.divide2();
		try {
		c.divide3();
		}
		catch(Exception e) { e.printStackTrace();}
		
		c.setOperand(10001, 0);
		try {
			c.divide4();
		}
		catch(Exception e) { e.printStackTrace();}
		
		System.out.println("프로그램 완벽 종료");
	}

}

class CalculatorEx {
	int left, right;
	public int exCount = 0;

	public void setOperand(int left, int right) {
		this.left = left;
		this.right = right;
	}

	// 무대비
	public void divide1() {
		System.out.println("[divide()] " + left/right);
	}
	public void divide2() {
	try {
			int p = left/right;
			System.out.println("[divide2()]" + p);
		}
		catch(ArithmeticException ae) {
			System.out.println(ae.getMessage());
			System.out.println(ae.toString());
			ae.printStackTrace();
			System.out.println("error");
			
			exCount++;
			Date d = new Date();
			SimpleDateFormat sdf = new SimpleDateFormat("yyyyMMdd HHmmss");
			System.out.println(sdf. format(d) + ":" + "[B001]"
							+ "left=" + left + ", right=" + right);
			
		}
	}
	
	// 예고 또는 경고
	public void divide3() throws Exception {
		System.out.println("[divide3()]" + left/right);
	}
	
	// 사용자(개발자, 나)가 예외를 강제적으로 발생시키는 메서드
	public void divide4() throws Exception {
		// left가 10000을 초과하는 경우 장난으로 간주하고 처리 안함
		if(left > 10000) {
			throw new Exception("10000을 넘을 수 없습니다.");
		}
		System.out.println("[divide4]" + left/right);
	}
}
