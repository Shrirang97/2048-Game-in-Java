import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

public class keybinder implements KeyListener {

	boolean key[] = new boolean[256];
	boolean up,right,left,down;
	public keybinder()
	{
		up = key[KeyEvent.VK_W];
		down = key[KeyEvent.VK_S];
		left = key[KeyEvent.VK_A];
		right = key[KeyEvent.VK_D];
		
	}
	
	@Override
	public void keyPressed(KeyEvent e) {
		// TODO Auto-generated method stub
		System.out.print("button pressed");
		key[e.getKeyCode()] = true;
		
	}

	@Override
	public void keyReleased(KeyEvent e) {
		// TODO Auto-generated method stub
		game.check = true;
		key[e.getKeyCode()] = false;
	}

	@Override
	public void keyTyped(KeyEvent e) {
		// TODO Auto-generated method stub
		
	}

}
