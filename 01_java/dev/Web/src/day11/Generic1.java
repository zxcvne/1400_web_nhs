package day11;

import java.util.ArrayList;

public class Generic1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Food ramen = new Food("라면", "그냥 무지성 끓이거나 날로 먹는다");
		
        //Oldbox
		OldBox ob = new OldBox();
		ob.add(ramen);
		System.out.println(((Food)(ob.get(0))).getRecipe());
		
		//NewBox
		
		NewBox<Food> nb = new NewBox();
		nb.add(ramen);
		System.out.println(nb.get(0).getRecipe());
		
	}

}

class Food {
	String name;
	String recipe;
	
	Food(String name, String recipe){
		this.name = name;
		this.recipe = recipe;
	}
	
	String getRecipe() {
		return recipe;
	}
	
}

class OldBox {
	ArrayList items = new ArrayList();
	
	void add(Object o) {
		items.add(o);
	}
	
	Object get(int index) {
		return items.get(index);
	}
	
}

class NewBox<T> {
	// T, E, (K, V) : T=Type, E=Element, Key=Key, V=Value
	ArrayList<T> items = new ArrayList();
	
	void add(T o) {
		items.add(o);
	}
	
	T get(int index) {
		return items.get(index);
	}
}

class StrangeBox<DisneyLand> {
	DisneyLand name;
	
}