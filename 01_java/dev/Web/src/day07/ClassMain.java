package day07;

import utils.Mu;

public class ClassMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ClassC c = new ClassC();
		
		Phone p = new Phone();
		SmartPhone sp = new SmartPhone();
		
		p.sendText("assssssssssssssssfffffffffffffffffaaaaaaaaaaaaaaaaaaaaaaaaaaaaaadddddddddddddssssssssssssssddddddddfffffffffsssaaasssssssssssfffffffffff");
		sp.sendText("assssssssssssssssfffffffffffffffffaaaaaaaaaaaaaaaaaaaaaaaaaaaaaadddddddddddddssssssssssssssddddddddfffffffffsssaaasssssssssssfffffffffff");
		sp.installApp();
		sp.webSerfing();
		
		
	}

}

class Phone {
	public void sendText(String str) {
		if(str.length() > 80) {
			Mu.p("문자열이 너무 깁니다....");
		}
		else {
			Mu.p(str);
		}
	}
	public void call() {
		Mu.p("Calling");
	}
}

class SmartPhone extends Phone {
	public void installApp() {
		Mu.p("Installing App...");
	}
	
	public void webSerfing() {
		Mu.p("Web Serfing...");
	}
	
	@Override // Annotation
	public void sendText(String str) {
		Mu.p(str);
	}
}