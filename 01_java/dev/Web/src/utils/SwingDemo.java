package utils;

import javax.swing.JFrame;

public class SwingDemo extends JFrame {

	SwingDemo(){
		setSize(300,200);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setVisible(true);
	}
	
	public static void main(String[] args) {
		new SwingDemo();
	}
	
}

