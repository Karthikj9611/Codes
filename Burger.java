import java.util.Scanner;
public class Burger 
{
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number of team: ");
		int n=sc.nextInt();
		int T[][]=new int[n][4];
		for(int i=0;i<n;i++)
		{
			System.out.println("Enter time taken by members of team "+(i+1));
			for(int j=0;j<4;j++)
			{
				T[i][j]=sc.nextInt();
			}
		}
		
		System.out.println("Input the total burgers ");
		int bg=sc.nextInt();
		
		System.out.println("Input the competation duration ");
		int time=sc.nextInt();
		
		int rs[]=new int[n];
		for(int i=1;i<=time;i++)
		{
			for(int j=0;j<n;j++)
			{
				for(int k=0;k<4;k++)
				{
					if(i%T[j][k]==0)
							rs[j]=rs[j]+1;
				}
			}
			int j=0;
			for(;j<n;j++)
			{
				if(rs[j]>=bg)
					break;
			}
			if(j<n)
				break;
		}
		int bin=0;
		for(int i=1;i<n;i++)
		{
			if(rs[i]>rs[bin])
				bin=i;
		}
		System.out.println("team "+(bin+1)+" won by ate "+rs[bin]);
	}
}
