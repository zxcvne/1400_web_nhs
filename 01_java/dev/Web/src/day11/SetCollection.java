package day11;

import java.util.HashSet;
import java.util.TreeSet;

public class SetCollection {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// 1. HashSet
		HashSet hs = new HashSet();
		hs.add("매트릭스");
		hs.add("주글래살래");
		hs.add("쇼생크탈출");
		
		Puppy p1 = new Puppy();
		System.out.println(p1);
		
		hs.add(p1);
		System.out.println("HashSet : " + hs);
		
		// 2. TreeSet
		TreeSet ts = new TreeSet();
		ts.add("매트릭스");
		ts.add("주글래살래");
		ts.add("쇼생크탈출");
		ts.add("터미네이터");
		ts.add("다크나이트");
//		ts.add(p1); // Comparator 구현 시 가능할 걸?
		
		System.out.println("TreeSet : " + ts);
		
		TreeSet subSet1 = (TreeSet)ts.subSet("매트릭스", "주글래살래");
		System.out.println("subSet1 : " + subSet1);
		TreeSet subSet2 = (TreeSet)ts.subSet("매트릭스", true, "주글래살래", true);
		System.out.println("subSet2 : " + subSet2);
		TreeSet subSet3 = (TreeSet)ts.subSet("마",true,"차",false);
		System.out.println("subSet3 : " + subSet3);
	}

}

class Puppy {
	String name;
	
	public String toString() {
		return "이름 없는데?";
	}
}