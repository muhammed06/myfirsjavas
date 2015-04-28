import java.util.Random;
import java.util.Scanner;
public class Randomsayi1
{
	public static void main(String[] args)
	{
		Random random = new Random();
		Scanner input = new Scanner(System.in);
		int a[][]=new int[10][15];
		int i,j;
		for(i=0;i<10;i++)
		{
			System.out.print("\n"+(i+1)+".  ");
			for(j=0;j<15;j++)
			{
				a[i][j]=random.nextInt(10)+1;
				System.out.print(a[i][j] + "-");
			}
			
		}
	}
	public static String a()
	{
		return "";
	}
}