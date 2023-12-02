package snake;

import javax.swing.JFrame;

public class GameFrame extends JFrame{
	
	GameFrame() {
		GamePanel snakepanel = new GamePanel();
		this.setVisible(true);
		
		this.add(snakepanel);
		this.setTitle("snakegame");
		this.setDefaultCloseOperation(EXIT_ON_CLOSE);
		this.setResizable(false);
		this.pack();
		this.setLocationRelativeTo(null);
	}

}
