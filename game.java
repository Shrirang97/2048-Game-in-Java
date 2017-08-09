import java.awt.Font;
import java.util.Random;

public class game implements Runnable {

	public static boolean check = true; 
	Random r = new Random();
	Thread t = new Thread(this);
	static String str[][] = {{"-","-","-","-"},{"-","-","-","-"},{"-","-","-","-"},{"-","-","-","-"}};
	public game() throws Exception {
		new display();
		t.start();
		
	}
	@Override
	public void run() {
		while(true)
		{
			int h = 70,w = 125;
			display.draw();
			display.g.setFont(new Font ("Courier New", 1, 100));
			int x,y;
			
			if(check) 
			{	System.out.println("check = "+check);
				while(true)
				{
					x = r.nextInt(4);
					y = r.nextInt(4);
					if(str[x][y]=="-")
					{
						str[x][y] = "2";
						break;
					}
				}
				check = false;
			}
			//System.out.println(x*200+70+"  "+y*200+125);
			for(int i=0;i<4;i++)
			{
				for(int j=0;j<4;j++)
				{
					if(str[i][j]!="-")
					display.g.drawString(str[i][j], i*200+h, j*200+w);
				}
			}
			
			move();
			
			display.bs.show();
		}
	
	}
	
	private void move() {
		if(display.keyb.up)
		{
			
		}
		else if(display.keyb.down)
		{
			
		}
		else if(display.keyb.left)
		{
			
		}
		else if(display.keyb.right)
		{
			for(int j=0;j<4;j++)
			{
				for(int i=3;i>0;i--)
				{
					if(game.str[j][i]=="-")
					{
						for(int k=i;k>0;k--)
						{
							game.str[j][k] = game.str[j][k-1];
						}
						game.str[j][0] = "-";
						i++;
					}
					else if(game.str[j][i]==game.str[j][i-1])
					{
						game.str[j][i] = String.valueOf(Integer.parseInt(game.str[j][i])*2);
						game.str[j][i-1] = "-";
						
					}
					else
					{
						continue;
					}
				}
			}
			for(int i=0;i<4;i++)
			{
				for(int j=0;j<4;j++)
				{
					if(game.str[i][j]!="-")
					display.g.drawString(game.str[i][j], i*200+70, j*200+125);
				}
			}
			
		}
		
	}
	public static void main(String args[]) throws Exception
	{
		new game();
	}


	
	
}
