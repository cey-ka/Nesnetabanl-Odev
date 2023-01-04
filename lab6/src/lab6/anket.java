package lab6;
import java.util.HashMap;
import java.util.Scanner;

public class anket {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int s1,s2,s3,s4,s5;
		int sayac;
		for(sayac = 0; sayac <= 10; sayac++)
		{
			System.out.println("ankete başlamak için 0 a basınız : ");
			int start = sc.nextInt();
			if(start == 0)
			{
				System.out.println("ekonomi sizin için ne kadar önemli 1/10 arası ");
				s1 = sc.nextInt();
				
				System.out.println("küresel ısınma sizin için ne kadar önemli 1/10 arası ");
				s2 = sc.nextInt();
				
				System.out.println("eğitim sizin için ne kadar önemli 1/10 arası ");
				s3 = sc.nextInt();
			
				System.out.println("teknolojik gelişim sizin için ne kadar önemli 1/10 arası ");
				s4 = sc.nextInt();
				
				System.out.println("kültür sizin için ne kadar önemli 1/10 arası ");
				s5 = sc.nextInt();
				
				System.out.println("------------------------------------");
			}
				
				else
				{
					System.out.println("anket başlatılamadı");
				}
	     }
		
		
		int a[][]=new int[10][5];
	
		
		
		for(int i=0;i<10;i++)
        {
           for(int j=0; j<5; j++)
           {
               a[i][j] = 0;
               System.out.println(a[i][j]);
           }
        }
		
		
		
		for(s1 = 1; s1<=10; s1++)
		{
			for(sayac = 0;sayac<10; sayac++)
			{
				if(sayac == 0 && s1 == 1)
				{
					a[0][0]++;
				}
				
				if(sayac == 1 && s1 == 1)
				{
					a[0][1]++;
				}
				
				if(sayac == 2 && s1 == 1)
				{
					a[0][2]++;
				}
				
				if(sayac == 3 && s1 == 1)
				{
					a[0][3]++;
				}
				
				if(sayac == 4 && s1 == 1)
				{
					a[0][4]++;
				}
				
				if(sayac == 5 && s1 == 1)
				{
					a[0][5]++;
				}
				if(sayac == 6 && s1 == 1)
				{
					a[0][6]++;
				}
				if(sayac == 7 && s1 == 1)
				{
					a[0][7]++;
				}
				if(sayac == 8 && s1 == 1)
				{
					a[0][8]++;
				}
				if(sayac == 9 && s1 == 1)
				{
					a[0][9]++;
				}
				if(sayac == 10 && s1 == 1)
				{
					a[0][10]++;
					
				}
				
				else if(sayac==0 && s1 == 2)
				{
					a[1][0]++;
				}
				
				else if(sayac==0 && s1 == 2)
				{
					a[2][0]++;
				}
				else if(sayac==0 && s1 == 2)
				{
					a[1][0]++;
				}
				else if(sayac==0 && s1 == 2)
				{
					a[1][0]++;
				}
				else if(sayac==0 && s1 == 2)
				{
					a[1][0]++;
				}
				else if(sayac==0 && s1 == 2)
				{
					a[1][0]++;
				}
				else if(sayac==0 && s1 == 2)
				{
					a[1][0]++;
				}
				else if(sayac==0 && s1 == 2)
				{
					a[1][0]++;
				}
				else if(sayac==0 && s1 == 2)
				{
					a[1][0]++;
				}
				else if(sayac==0 && s1 == 2)
				{
					a[1][0]++;
				}
				else if(sayac==0 && s1 == 2)
				{
					a[1][0]++;
				}
				
					
			}	
		}
		
	}
	
}

	
			
			
		