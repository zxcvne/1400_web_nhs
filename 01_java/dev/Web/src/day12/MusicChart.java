package day12;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;

public class MusicChart extends JFrame implements ActionListener{
	
	JLabel[] labels;
	JButton bt;
	JLabel log;
	int count = 0;
	
	MusicChart() {
		bt = new JButton("GET!");
		bt.setBounds(20,20,340,30); // x, y, width, height
		add(bt);
		bt.addActionListener(this);
		
		labels = new JLabel[10];
		for(int i = 0; i<labels.length; i++) {
			labels[i] = new JLabel("Ranking"+ (i + 1));
			labels[i].setBounds(20, 80+(i*40),340,30);
			add(labels[i]);
		}
		
		log = new JLabel("Log Region");
		log.setBounds(20, 480, 340, 30);
		add(log);
		
		setSize(400, 600);
		setLayout(null);
		setVisible(true);
	}
	
	public void actionPerformed(ActionEvent e) {
		if(e.getSource() == bt) {
			System.out.println("Button Clicked");
			count++;
			log.setText("Button Clicked : " + count);
		}
		
		String URL = "http://music.bugs.co.kr/chart";
		
		try {
			Document doc = Jsoup.connect(URL).get();
			System.out.println(doc);
			
			Elements elements = doc.select("p.title");
			
			int rank = 1;
			
			for(Element element : elements) {
				String text = "Ranking" + rank + ":" + element.text();
				labels[rank-1].setText(text);
				if(rank == 10) 
					break;
				rank++;
			}
		}
		catch(Exception ex) {
			ex.printStackTrace();
			log.setText("Connection Failed");
		}
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new MusicChart();
	}

}
