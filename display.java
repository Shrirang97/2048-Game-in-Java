import java.awt.Canvas;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.image.BufferStrategy;

import javax.swing.JFrame;

public class display extends JFrame {

	private static final long serialVersionUID = 1L;
	private static Dimension d = new Dimension(800,835);
	static BufferStrategy bs;
	private static Canvas cs;
	static Graphics g;
	static keybinder keyb = new keybinder();
	display() throws Exception
	{
	setSize(d);
	setTitle("2048");
	setResizable(false);
	setLocationRelativeTo(null);
	
	cs = new Canvas();
	cs.setPreferredSize(d);
	cs.setMaximumSize(d);
	cs.setMinimumSize(d);
	cs.setFocusable(false);
	add(cs);
	addKeyListener(keyb);
	setVisible(true);
	
	}
	static void draw()
	{
		bs = cs.getBufferStrategy();
		if(bs==null)
		{
			cs.createBufferStrategy(3);
			
		}
		bs = cs.getBufferStrategy();
		g = bs.getDrawGraphics();
		g.setColor(Color.BLACK);
		g.fillRect( 0, 0, 800, 800);
		g.setColor(Color.white);
		g.drawLine(200, 0, 200, 800);
		g.drawLine(400, 0, 400, 800);
		g.drawLine(600, 0, 600, 800);
		
		g.drawLine(0, 200, 800, 200);
		g.drawLine(0, 400, 800, 400);
		g.drawLine(0, 600, 800, 600);
		//bs.show();
	}
	
	
}
