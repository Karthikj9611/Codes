package GliderCompany;
import java.util.Scanner;
public class $1_MaxNum_String
{
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		String str=sc.nextLine();
		System.out.println(higestInString(str));
	}

	static int higestInString(String str) 
	{
		int n=0, r=0;
		
		// Start traversing the given string //
		for(int i=0;i<str.length();i++)
		{
			// if a numeric value comes start converting it into an interger till there are consecutive numeric digits //
			if(Character.isDigit(str.charAt(i)))
			{
				n=n*10+(str.charAt(i)-'0');
			}
			
			// update maximum value //
			else
			{
				r=Math.max(r, n);
				// reset the number //
				n=0;
			}
		}
		// return maximum value //
		return Math.max(r, n);
	}
}

//		gt12cty65mt1
//		65

//		mkf43kd1cmk32klmv123
//		123
