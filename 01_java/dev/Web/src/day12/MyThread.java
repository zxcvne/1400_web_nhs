package day12;

public class MyThread extends Thread {
	public MyThread(String name) {
		setName(name);
	}
	
	public void run() {
		for(int i=0; i<10; i++) {
			try {
				sleep(1000);
				System.out.println(getName() + " : " + i + "번 count");
			}
			catch(Exception e) {
				e.printStackTrace();
			}
		}
	}
}
