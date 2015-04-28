import java.awt.Font;
import javax.swing.*;

public class guiki
{
	public static void main(String[] args)
	{
		JFrame form = new JFrame("muhammed yilmaz");
		JPanel panel1 = new JPanel();
		JLabel label1 = new JLabel("orta yazi");
		label1.setFont(new Font( "Arial",Font.BOLD,18));
		
		JLabel label2 = new JLabel("ikinci yazi");
		label2.setFont(new Font( "Halvetica",Font.BOLD,18));
		
		panel1.add(label1);																//labelin gözükmesi için
		panel1.add(label2);
		form.add(panel1);
		
		form.setSize(400,400);
		form.setVisible(true);														//formun gözükmesi için
		form.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);//otomatik kapatmak için
		
		}
}