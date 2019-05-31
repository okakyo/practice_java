import java.awt.Graphics;
import java.awt.Font;
import java.awt.Graphics2D;
import java.awt.RenderingHints;

import javax.swing.JFrame;
import javax.swing.JPanel;

class window{
	
	public static void main(String[] args){
		GameWindow gw=new GameWindow("ゲーム",640,480);
		gw.add(new DrawCanvas());
		gw.setVisible(true);

	}

}



class GameWindow extends JFrame{
	public GameWindow(String title,int width,int height){
	super(title);
	setDefaultCloseOperation(EXIT_ON_CLOSE);
	setSize(width,height);
	setLocationRelativeTo(null);
	setResizable(false);
	}

}

class DrawCanvas extends JPanel{
	public void paintComponent(Graphics g){
		super.paintComponent(g);
		g.drawLine(100,100,200,200);
	}
}

