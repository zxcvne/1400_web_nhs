package day09;

public class MyExceptionTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
//			sendReceipt(12000);
//			sendReceipt(400000000);
			sendReceipt(700);
		}
		catch(Exception e) {
			e.printStackTrace();
			
			// 예외가 발생하면 예외 통계DB에 기록
			try {
				 // 데이터베이스에 기록
				 // 기록하다가 full이거나 정상 상태가 아니면 예외 또 날 수 있음
			}
			catch(Exception e2) {
				// 그럼 파일에다가 써
			}
			finally {
//				System.exit(0);
				System.out.println("잘가고😎👍");
			}
		}
	}
	
	public static void sendReceipt(int amt) throws MyException{
		if(amt > 100000000) 
			throw new MyException("[B001] 과도한 금액 청구 사기꾼");
		else if(amt < 1000) 
			throw new MyException("[B002] 금액" + amt + "원 정도는 니 돈주고 먹어");
		
		System.out.println("[sendReceipt()]" + amt + "원 정상처리되었습니다.");
	}
}

class MyException extends Exception {
	MyException(String msg){
		super(msg);
		System.out.println("[MyException] 경찰서 고발");
		System.out.println("[MyException] 메시지 로그 기록");
		System.out.println("[MyException] 모든 전원 오프");
		System.out.println("[MyException] 관련자 모두 무급 출근");
	}
}