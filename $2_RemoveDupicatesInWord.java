package GliderCompany;
import java.util.Scanner;
public class $2_RemoveDupicatesInWord 
{
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		for(int i=1;i<=n;i++)
		{
			String str=sc.next();
			String empty="";
			char prevChar=' ';
			for(int j=0;j<str.length();j++)
			{
				if(prevChar!=str.charAt(j))
				{
					empty=empty+str.charAt(j);
				}
				prevChar=str.charAt(j);
			}
			System.out.print(empty+" ");
		}
	}
}

//      4
//		hi across beeeater Bookkeeper
//		hi acros beater Bokeper

//      2
//		unsuccessfully bypass
//		unsucesfuly bypas
