package day11;

import java.util.HashMap;
import java.util.TreeMap;

public class MapCollection {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HashMap<String, Integer> hm = new HashMap();
		TreeMap tm = new TreeMap();
		
		// (1) put() : 데이터 저장
//		hm.put("파스타", 5000);
		String[] foods = {"Steak", "Chicken", "Rice", "Curri"};
		int[] prices = {20000, 15000, 2000, 500};
		
		for(int i = 0; i<foods.length; i++) {
			hm.put(foods[i], prices[i]);
			tm.put(foods[i], prices[i]);
		}
		
		System.out.println("HashMap : " + hm);
		System.out.println("TreeMap : " + tm);
		
		// (2) 데이터 조회 : get()
		System.out.println("Steak?" + hm.get("Steak"));
		
		// (3) 데이터 삭제 : remove()
		hm.remove("Rice");
		System.out.println("HashMap : " + hm);
		
		// (4) 데이터 변경 : replace(키값, Value)
		hm.replace("steak", 30000);
		System.out.println("HashMap : " + hm);
		
		// Map Collection은 차후 등장할 JSON(제이슨) 형식을 해석하는데 유용하다.
	}

}
