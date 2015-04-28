import java.util.Scanner;
import java.util.Random;

public class Iki_boyut_dizi_2 {

    public static void main(String[] args) {
        Random randomNum = new Random();
        Scanner input = new Scanner (System.in);
        
        int dizi [][];
        int satir, sutun, yedek,dogruluk=0;
        
        System.out.println("Random olarak iki boyurlu dizi üretilecektir.");
        
        satir = randomNum.nextInt(9)+1;
        sutun = randomNum.nextInt(9)+1;
        
        dizi = new int [satir][sutun];
        
        System.out.println("satir = "+ satir + " sutun = "+ sutun +" dizi ulusturulacaktir.");
        for (int[] dizi1 : dizi) {
            for (int j = 0; j < dizi[0].length; j ++) {
                dizi1[j] = randomNum.nextInt(9)+1;
            }
        }
        
        for (int[] dizi1 : dizi) {
            for (int j = 0; j < dizi[0].length; j ++) {
                System.out.print(dizi1[j] + " ");
            }
            System.out.println("");
        }
        int i=0,j=0;
        for(i=0;i< satir ;i++)
		{
		dogruluk=0;
			while(dogruluk != (dizi[0].length-1))
			{
				dogruluk=0;
				for( j=0 ;j<(dizi[0].length-1);j++)
				{
					if(dizi[i][j]>dizi[i][j+1])
					{
						dizi[i][j]=dizi[i][j]+dizi[i][j+1];
						dizi[i][j+1]=dizi[i][j]-dizi[i][j+1];
						dizi[i][j]=dizi[i][j]-dizi[i][j+1];
					}
					else
					{
						dogruluk++;
					}
				}
			}
		}
        
		System.out.println("");
        
        System.out.println("siralanmis hali\n");
        for (int[] dizi1 : dizi) {
            for (j = 0; j < dizi[0].length; j ++) {
                System.out.print(dizi1[j] + " ");
            }
            System.out.println("");
        }
        
        
        
    }
    
}
