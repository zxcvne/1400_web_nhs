package com.koreait.board.util;

import java.util.Random;

public class MyUtil {
	public static final String BLUE = "\033[94m";	
	public static final String END = "\033[0m";
	
	public static String getColor() {
		Random rd = new Random();
		return "\033[38;5;" + rd.nextInt(256) + "m";
	}
	
}
