import java.util.Scanner;


public class xoyunu
{
	
	public static void main(String[] args)
	{
		Scanner input = new Scanner(System.in);
		int tabloboyutu,i,j,oyuncuint=0;
		int oyuncupuani[] = {0,0};
		do
		{
		System.out.println("SOS oyununa hoşgeldiniz \n \n tablo boyutunu girin ( 5 ten büyük olmalıdır ) .");
		tabloboyutu = input.nextInt();
		}while(tabloboyutu<5);
		String[][] sostablo = new String[tabloboyutu][tabloboyutu];
		System.out.println("\n \n 1. oyuncu S\n 2. oyuncu O olacak.\n");
		for(i=0;i<tabloboyutu;i++)
		{
			for(j=0;j<tabloboyutu;j++)
			{
				sostablo[i][j]=" - ";
			}
		}
		while(oyunbittimi(sostablo))
		{
			oyunuyazdir(sostablo);
			
			System.out.println("\nSıra "+ (oyuncuint+1) + ". oyuncuda\n");
			hamleal(sostablo,oyuncuint,oyuncupuani);

			System.out.print("\n \n");

			if(oyuncuint==1)oyuncuint=0;
			else oyuncuint=1;
		}
		
	}
	public static int hamleal(String sostablo[][],int oyuncuint,int oyuncupuani[])
	{
		Scanner input = new Scanner(System.in);
		int giriş[] = new int[2];
		String oyuncu;
		if(oyuncuint == 0)
			oyuncu = " S ";
		else
			oyuncu = " O ";
		System.out.println("i,j  olarak gireceğiniz koordinatı veriniz");
		giriş[0] = input.nextInt();
		giriş[1] = input.nextInt();
		if(hamlekontrolet(sostablo,giriş))
		{
			sostablo[giriş[0]][giriş[1]]=oyuncu;
			if(sosmu(sostablo,oyuncupuani,oyuncuint,giriş))
				System.out.print("\t\t\t\t" + (oyuncuint+1) +". oyuncu SOS yaptı");
			return 0 ;
		}
		else
		{
			System.out.println("girdiğiniz alan dolu");
			return hamleal(sostablo,oyuncuint,oyuncupuani);
		}
	}
	public static boolean hamlekontrolet(String sostablo[][],int giriş[])
	{
		if((giriş[0]<0)||(giriş[1]<0)||(giriş[0]>=sostablo.length)||(giriş[1]>=sostablo[0].length))
			return false;
		if(sostablo[giriş[0]][giriş[1]]==" - ")
		{
			return true;
		}
		else
		{
			return false;
		}
	}
	public static void oyunuyazdir(String sostablo[][])
	{
		int i,j;
		for(i=0;i<sostablo.length;i++)
		{
			for(j=0;j<sostablo[0].length;j++)
			{
				System.out.print(sostablo[i][j]);
			}
			System.out.println(" ");
		}
	}
	public static boolean oyunbittimi(String sostablo[][])
	{
		int i,j;
		for(i=0;i<sostablo.length;i++)
		{
			for(j=0;j<sostablo[0].length;j++)
			{
				if(sostablo[i][j]==" - ")
					return true;
			}
		}
		return false;
	}
	public static boolean sosmu(String sostablo[][],int oyuncupuani[],int oyuncuint,int giriş[])
	{
		int flip=0;
		if(sostablo[giriş[0]][giriş[1]]==" S ")
		{
			if((giriş[0]==0)&&(giriş[1]==0)||(giriş[0]==1)&&(giriş[1]==1)||(giriş[0]==0)&&(giriş[1]==1)||(giriş[0]==1)&&(giriş[1]==0))									//sol üst köşe S ise
			{
				if((sostablo[giriş[0]][giriş[1]+1]==" O ")&&(sostablo[giriş[0]][giriş[1]+2]==" S "))			//
				{
					oyuncupuani[oyuncuint]++;
					flip=1;
				}
				if((sostablo[giriş[0]+1][giriş[1]]==" O ")&&(sostablo[giriş[0]+2][giriş[1]]==" S "))			//
				{
					oyuncupuani[oyuncuint]++;
					flip=1;
				}
				if((sostablo[giriş[0]+1][giriş[1]+1]==" O ")&&(sostablo[giriş[0]+2][giriş[1]+2]==" S "))			//
				{
					oyuncupuani[oyuncuint]++;
					flip=1;
				}
			}
			else if((giriş[0]==0)&&(giriş[1]==(sostablo.length-1))||(giriş[0]==0)&&(giriş[1]==(sostablo.length-2))||(giriş[0]==1)&&(giriş[1]==(sostablo.length-1))||(giriş[0]==1)&&(giriş[1]==(sostablo.length-2)))					//sağ üst köşede S ise
			{
				if((sostablo[giriş[0]][giriş[1]-1]==" O ")&&(sostablo[giriş[0]][giriş[1]-2]==" S "))		//
				{
					oyuncupuani[oyuncuint]++;
					flip=1;
				}
				if((sostablo[giriş[0]+1][giriş[1]]==" O ")&&(sostablo[giriş[0]+2][giriş[1]]==" S "))		//
				{
					oyuncupuani[oyuncuint]++;
					flip=1;
				}
				if((sostablo[giriş[0]+1][giriş[1]-1]==" O ")&&(sostablo[giriş[0]+2][giriş[1]-2]==" S "))		//
				{
					oyuncupuani[oyuncuint]++;
					flip=1;
				}
			}
			else if((giriş[0]==(sostablo.length-1))&&(giriş[1]==0)||(giriş[0]==(sostablo.length-2))&&(giriş[1]==0)||(giriş[0]==(sostablo.length-1))&&(giriş[1]==1)||(giriş[0]==(sostablo.length-2))&&(giriş[1]==1))									//sol alt köşede S ise
			{
				if((sostablo[giriş[0]-1][giriş[1]]==" O ")&&(sostablo[giriş[0]-2][giriş[1]]==" S "))	//
				{
					oyuncupuani[oyuncuint]++;
					flip=1;
				}
				if((sostablo[giriş[0]][giriş[1]+1]==" O ")&&(sostablo[giriş[0]][giriş[1]+2]==" S "))	//
				{
					oyuncupuani[oyuncuint]++;
					flip=1;
				}
				if((sostablo[giriş[0]-1][giriş[1]+1]==" O ")&&(sostablo[giriş[0]-2][giriş[1]+2]==" S "))	//
				{
					oyuncupuani[oyuncuint]++;
					flip=1;
				}
			}
			else if((giriş[0]==(sostablo.length-1))&&(giriş[1]==(sostablo.length-1)) || (giriş[0]==(sostablo.length-2))&&(giriş[1]==(sostablo.length-1)) || (giriş[0]==(sostablo.length-1))&&(giriş[1]==(sostablo.length-2)) || (giriş[0]==(sostablo.length-2))&&(giriş[1]==(sostablo.length-2)))					//sağ alt köşede S ise
			{
				if((sostablo[giriş[0]-1][giriş[1]]==" O ")&&(sostablo[giriş[0]-2][giriş[1]]==" S "))		//
				{
					oyuncupuani[oyuncuint]++;
					flip=1;
				}
				if((sostablo[giriş[0]-1][giriş[1]-1]==" O ")&&(sostablo[giriş[0]-2][giriş[1]-2]==" S "))		//
				{
					oyuncupuani[oyuncuint]++;
					flip=1;
				}
				if((sostablo[giriş[0]][giriş[1]-1]==" O ")&&(sostablo[giriş[0]][giriş[1]-2]==" S "))		//
				{
					oyuncupuani[oyuncuint]++;
					flip=1;
				}
			}
			else if((giriş[0]==0)||(giriş[0]==1))																//üst kenarsa S ise
			{
				if((sostablo[giriş[0]][giriş[1]-1]==" O ")&&(sostablo[giriş[0]][giriş[1]-2]==" S "))
				{
					oyuncupuani[oyuncuint]++;
					flip=1;
				}
				if((sostablo[giriş[0]][giriş[1]+1]==" O ")&&(sostablo[giriş[0]][giriş[1]+2]==" S "))
				{
					oyuncupuani[oyuncuint]++;
					flip=1;
				}
				if((sostablo[giriş[0]+1][giriş[1]+1]==" O ")&&(sostablo[giriş[0]+2][giriş[1]+2]==" S "))
				{
					oyuncupuani[oyuncuint]++;
					flip=1;
				}
				if((sostablo[giriş[0]+1][giriş[1]-1]==" O ")&&(sostablo[giriş[0]+2][giriş[1]-2]==" S "))
				{
					oyuncupuani[oyuncuint]++;
					flip=1;
				}
				if((sostablo[giriş[0]+1][giriş[1]]==" O ")&&(sostablo[giriş[0]+2][giriş[1]]==" S "))
				{
					oyuncupuani[oyuncuint]++;
					flip=1;
				}
			}
			else if((giriş[1]==0)||(giriş[1]==1))																//sol kenar S ise
			{
				if((sostablo[giriş[0]][giriş[1]+1]==" O ")&&(sostablo[giriş[0]][giriş[1]+2]==" S "))
				{
					oyuncupuani[oyuncuint]++;
					flip=1;
				}
				if((sostablo[giriş[0]-1][giriş[1]+1]==" O ")&&(sostablo[giriş[0]-2][giriş[1]+2]==" S "))
				{
					oyuncupuani[oyuncuint]++;
					flip=1;
				}
				if((sostablo[giriş[0]+1][giriş[1]+1]==" O ")&&(sostablo[giriş[0]+2][giriş[1]+2]==" S "))
				{
					oyuncupuani[oyuncuint]++;
					flip=1;
				}
				if((sostablo[giriş[0]+1][giriş[1]]==" O ")&&(sostablo[giriş[0]+2][giriş[1]]==" S "))
				{
					oyuncupuani[oyuncuint]++;
					flip=1;
				}
				if((sostablo[giriş[0]-1][giriş[1]]==" O ")&&(sostablo[giriş[0]-2][giriş[1]]==" S "))
				{
					oyuncupuani[oyuncuint]++;
					flip=1;
				}
			}
			else if((giriş[0]==(sostablo.length-1))||(giriş[0]==(sostablo.length-2)))							//alt kenar S ise
			{
				if((sostablo[giriş[0]][giriş[1]+1]==" O ")&&(sostablo[giriş[0]][giriş[1]+2]==" S "))
				{
					oyuncupuani[oyuncuint]++;
					flip=1;
				}
				if((sostablo[giriş[0]-1][giriş[1]+1]==" O ")&&(sostablo[giriş[0]-2][giriş[1]+2]==" S "))
				{
					oyuncupuani[oyuncuint]++;
					flip=1;
				}
				if((sostablo[giriş[0]-1][giriş[1]]==" O ")&&(sostablo[giriş[0]-2][giriş[1]]==" S "))
				{
					oyuncupuani[oyuncuint]++;
					flip=1;
				}
				if((sostablo[giriş[0]-1][giriş[1]-1]==" O ")&&(sostablo[giriş[0]-2][giriş[1]-2]==" S "))
				{
					oyuncupuani[oyuncuint]++;
					flip=1;
				}
				if((sostablo[giriş[0]][giriş[1]-1]==" O ")&&(sostablo[giriş[0]][giriş[1]-2]==" S "))
				{
					oyuncupuani[oyuncuint]++;
					flip=1;
				}
			}
			else if((giriş[1]==(sostablo.length-1))||(giriş[1]==(sostablo.length-2)))							//sağ kenar S ise
			{
				if((sostablo[giriş[0]+1][giriş[1]]==" O ")&&(sostablo[giriş[0]+2][giriş[1]]==" S "))
				{
					oyuncupuani[oyuncuint]++;
					flip=1;
				}
				if((sostablo[giriş[0]-1][giriş[1]]==" O ")&&(sostablo[giriş[0]-2][giriş[1]]==" S "))
				{
					oyuncupuani[oyuncuint]++;
					flip=1;
				}
				if((sostablo[giriş[0]+1][giriş[1]-1]==" O ")&&(sostablo[giriş[0]+2][giriş[1]-2]==" S "))
				{
					oyuncupuani[oyuncuint]++;
					flip=1;
				}
				if((sostablo[giriş[0]-1][giriş[1]-1]==" O ")&&(sostablo[giriş[0]-2][giriş[1]-2]==" S "))
				{
					oyuncupuani[oyuncuint]++;
					flip=1;
				}
				if((sostablo[giriş[0]][giriş[1]-1]==" O ")&&(sostablo[giriş[0]][giriş[1]-2]==" S "))
				{
					oyuncupuani[oyuncuint]++;
					flip=1;
				}
			}
			
			else																								//S ortada ise
			{
				if((sostablo[giriş[0]+1][giriş[1]]==" O ")&&(sostablo[giriş[0]+2][giriş[1]]==" S "))
				{
					oyuncupuani[oyuncuint]++;
					flip=1;
				}
				if((sostablo[giriş[0]-1][giriş[1]]==" O ")&&(sostablo[giriş[0]-2][giriş[1]]==" S "))
				{
					oyuncupuani[oyuncuint]++;
					flip=1;
				}
				if((sostablo[giriş[0]+1][giriş[1]-1]==" O ")&&(sostablo[giriş[0]+2][giriş[1]-2]==" S "))
				{
					oyuncupuani[oyuncuint]++;
					flip=1;
				}
				if((sostablo[giriş[0]-1][giriş[1]-1]==" O ")&&(sostablo[giriş[0]-2][giriş[1]-2]==" S "))
				{
					oyuncupuani[oyuncuint]++;
					flip=1;
				}
				if((sostablo[giriş[0]][giriş[1]-1]==" O ")&&(sostablo[giriş[0]][giriş[1]-2]==" S "))
				{
					oyuncupuani[oyuncuint]++;
					flip=1;
				}
				if((sostablo[giriş[0]][giriş[1]+1]==" O ")&&(sostablo[giriş[0]][giriş[1]+2]==" S "))
				{
					oyuncupuani[oyuncuint]++;
					flip=1;
				}
				if((sostablo[giriş[0]+1][giriş[1]+1]==" O ")&&(sostablo[giriş[0]+2][giriş[1]+2]==" S "))
				{
					oyuncupuani[oyuncuint]++;
					flip=1;
				}
				if((sostablo[giriş[0]-1][giriş[1]+1]==" O ")&&(sostablo[giriş[0]-2][giriş[1]+2]==" S "))
				{
					oyuncupuani[oyuncuint]++;
					flip=1;
				}
			}
	
		}
		else
		{
			if((giriş[0]==0)&&((giriş[1]!=0)&&(giriş[1]!=(sostablo.length-1)))&&(sostablo[giriş[0]][giriş[1]-1]==" S ")&&(sostablo[giriş[0]][giriş[1]+1]==" S "))   //giriş O ise  ve üst tarafta ise
			{
					oyuncupuani[oyuncuint]++;
					flip=1;
			}
			else if((giriş[0]==(sostablo.length-1))&&((giriş[1]!=0)&&(giriş[1]!=(sostablo.length-1)))&&(sostablo[giriş[0]][giriş[1]-1]==" S ")&&(sostablo[giriş[0]][giriş[1]+1]==" S "))	//giriş O ise ve alt tarafta ise
			{
					oyuncupuani[oyuncuint]++;
					flip=1;
			}
			else if((giriş[1]==0)&&((giriş[0]!=0)&&(giriş[0]!=(sostablo.length-1)))&&(sostablo[giriş[0]-1][giriş[1]]==" S ")&&(sostablo[giriş[0]+1][giriş[1]]==" S "))		//giriş O ise ve sol tarafta ise
			{
					oyuncupuani[oyuncuint]++;
					flip=1;
			}
			else if((giriş[1]==(sostablo.length-1))&&((giriş[0]!=0)&&(giriş[0]!=(sostablo.length-1)))&&(sostablo[giriş[0]-1][giriş[1]]==" S ")&&(sostablo[giriş[0]+1][giriş[1]]==" S "))	//giriş O ise ve sağ tarafta ise
			{
					oyuncupuani[oyuncuint]++;
					flip=1;
			}
			else if((giriş[0]!=0)&&(giriş[0]!=(sostablo.length-1))&&(giriş[1]!=0)&&(giriş[1]!=(sostablo.length-1)))	//giriş o ise ve ortada ise
			{
				if(((sostablo[giriş[0]-1][giriş[1]-1]==" S ")&&(sostablo[giriş[0]+1][giriş[1]+1]==" S "))||((sostablo[giriş[0]-1][giriş[1]+1]==" S ")&&(sostablo[giriş[0]+1][giriş[1]-1]==" S ")))
				{
					oyuncupuani[oyuncuint]++;
					flip=1;
				}
				else if(((sostablo[giriş[0]-1][giriş[1]]==" S ")&&(sostablo[giriş[0]+1][giriş[1]]==" S "))||((sostablo[giriş[0]][giriş[1]+1]==" S ")&&(sostablo[giriş[0]][giriş[1]-1]==" S ")))
				{
					oyuncupuani[oyuncuint]++;
					flip=1;
				}
			}
		}
		if(flip==1) return true;
		else return false;
	}
}
/*
  0  1  2  3  4  j
0 *  O  *  *  *
1 *  *  *  *  *
2 *  *  *  *  *
3 *  *  *  *  *
4 *  *  *  *  *
i
bş: 
yu284738
iş:
25924076634
Yg26331

244087 ismailcan erkal
259226 ilkay karatepe
*/

