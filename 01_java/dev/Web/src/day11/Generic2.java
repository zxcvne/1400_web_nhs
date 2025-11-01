package day11;

import java.util.ArrayList;

public class Generic2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LuxuryBox<Instrument> box1 = new LuxuryBox();
		LuxuryBox<Violin> box2  = new LuxuryBox(); 
		LuxuryBox<Flute> box3  = new LuxuryBox(); 
		
//		LuxuryBox<Bat> box4 = new LuxuryBox();
//		extends Instrument 조건에 의해 입구컷 당함
		
		Bat bat = new Bat();
		System.out.println(box3.<Bat>get(bat));
		
	}

}

class Instrument {}
class Violin extends Instrument{}
class Flute extends Instrument {}

class SportsTool {}
class Bat extends SportsTool {
	public String soString() {
		return "선배님이 주신 야구 빳다";
	}
}

class LuxuryBox<T extends Instrument> {
	ArrayList<T> items = new ArrayList();
	
	public <T> T get(T data) {
		return data;
	}
}