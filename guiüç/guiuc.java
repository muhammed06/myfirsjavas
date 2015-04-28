import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;

public class guiuc
{

	public static JFrame frame1 = new JFrame("muhammed");
	public static JPanel panel1 = new JPanel();
	public static JButton buton1 = new JButton("buton kanka");
	public static JLabel label1 = new JLabel();
	
	public static void main(String[] args)
	{
			frame1.setSize(400,400);
			frame1.setVisible(true);
			frame1.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
			
			panel1.setSize(400,400);
			panel1.setLocation(0,0);
			
			buton1.setSize(40,40);
			buton1.setLocation(10,20);
			panel1.add(buton1);
			
			frame1.add(panel1);
			
			buton1.addActionListener(new ActionListener()
			{
				@Override
				public void actionPerformed(ActionEvent e)
				{
					buton1.setVisible(false);
					label1.setText("okey kanki");
					panel1.add(label1);
				}
			}
			
			);
			
			
	}
}