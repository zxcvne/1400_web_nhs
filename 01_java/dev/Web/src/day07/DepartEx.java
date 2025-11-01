package day07;

import java.util.Random;

import utils.Mu;

public class DepartEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Department[] d = new Department[5];
		
		d[0] = new Department("강남점");
		d[1] = new Department("본점");
		d[2] = new Department("USA점");
		d[3] = new Department("일본점");
		d[4] = new Department("속리산점");
	
		Department.setPranOpenInd(true);
		
		Random rd = new Random();
		for(int i=0; i<d.length; i++) {
			d[i].setOpenInd(rd.nextInt(2)==1? true:false);
		}
		
		Mu.p("지점 오픈 상태 확인하기");
		for(int i=0; i<d.length; i++) {
			Mu.p(d[i].name + " : " + (d[i].getOpenStatus()? "Open":"Close"));
			
		}
		// 1억 이하의 임의의 금액을 얻은 후, 1000단위 이하를 절사하여 amt에 추가함
		for(int i = 0; i<10; i++) {
			for(int j=0; j<d.length; j++) {
				int todayAmt = rd.nextInt(100000001) / 1000 * 1000;
				d[j].addAmt(todayAmt);
			}
		}
		// 각 지점의 매출을 출력한다.
		  for(int i=0; i<d.length; i++) {
		         Mu.p(d[i].name + " : " + d[i].getAmt());
		      }
		
		
	}// main

} // class

class Department {
	// 1. name : 백화점 지점의 이름, 생성할 때 지정 가능함
	// 2. pranName : 브랜드 이름, 수정 불가, 최초에 "내백화점"으로 세팅
	// 3. amt : 지점의 매출액, 초기에는 0, 직접 수정 불가
	// 4. openInd : 현재 지점의 오픈 가능 여부(true or false)
	// 5. pranOpenInd : 전체(브랜드) 레벨의 백화점 오픈 가능 여부
	// 6. getOpenStatus() : 현 지점이 오픈 가능한지 여부를 돌려주는 메서드
	// 7. addAmt(int amt) : 매출액을 amt만큼 더하는 메서드
	
	// Step0. 클래스 설명 넣기
	// 백화점 지점 단위를 객체로 갖는 클래스
	
	// Step1. 필드 정의
	String name;
	static final String pranName = "내백화점";
	private int amt = 0; // 매출액
	private boolean openInd;
	private static boolean pranOpenInd;
	// Step2. Constructor 정의
	Department(){
		this.name = name;
	}
	
	Department(String name){
		this.name = name;
	}
	
	// Step3. getOpenStatus 구현
	public boolean getOpenStatus() {
//		if(pranOpenInd == false) {
//			return false;
//		}
//		else {
//			if(openInd == true)
//				return true;
//			else
//				return false;
//		}
		// 2번 방식
//		if(pranOpenInd == true && openInd == true) {
//			return true;
//		}
//		else
//			return false;
		
		return pranOpenInd && openInd;
		
	}
	// Step4. getter/setter
	public void setOpenInd(boolean status) {
		openInd = status;
	}
	
	public static void setPranOpenInd(boolean status) {
		pranOpenInd = status;
	}
	
	public int getAmt() {
		return amt;
	}
	
	// Step5. User Function
	// 매출액을 더하는 메서드
	
	public void addAmt(int amt) {
		// this.amt = this.amt + amt
		this.amt += amt;
	}
	
	
}