package day01;

import utils.Mu;

public class Welcome {
	/**
	 * 가나다라 그냥 아무거나
	 * @param args
	 */
	public static void main(String[] args) {
		// Ctrl + Alt + 방향키 한줄 복사
		System.out.println("Welcome to my house");
		System.out.println("\033[91m" + "Welcome to my house" + "\033[0m"); // \033[1m : escape
		System.out.println("\033[1m" + "Welcome to my house" + "\033[0m");
		System.out.print("Welcome to\n\nmy house");
		System.out.print("Welcome to my place");
		Mu.p("Welcome");
		Mu.p("My Name is " + Mu.RED + "NONAME" + Mu.END);
	}// main

}// class