import java.util.Scanner;
public class WordNumber_To_Number 
{	
	static int amt=0;
	static String one[]= {"","one","two","three","four","five","six","seven","eight","nine","ten","eleven","twelve","thirteen","fourteen","fifteen","sixteen","seventeen","eighteen","ninteen"};
	static String two[]= {"","","twenty","thirty","fourty","fifty","sixty","seventy","eighty","ninty"};
	
	//method-1
	private static void wn(String spl,int a) {
		int n=0;
			 n=getIndexOf(spl);
		 amt=amt+n*a;
	}
	//method-2
	public static int getIndexOf(String item)
	{
		
		int y=0,x=0;
			String st[]= item.split(" ");
			if(st.length>=2)
			{
				 y=getIndexOf(st[st.length-2],two);
			     x=getIndexOf(st[st.length-1],one);
			}else if(st.length==1)
			{
				 x=getIndexOf(st[st.length-1],one);
			}
			return y*10+x;
	}
	//method-3
	private static int getIndexOf(String str, String[] xy)
	{
		for(int i=0;i<xy.length;i++)
		{
			if(xy[i].equalsIgnoreCase(str))
				return i;
		}
		return -1;
	}
	
	public static void main(String[] args)
	{
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter the amount in terms of words?");
		String st=sc.nextLine()+" ";
		    if(st.split("crore").length==2)
		    {
		    	wn(st.split("crore")[0],10000000);
		    	st=st.split("crore")[1];
		    }
		    if(st.split("lakh").length==2)
		    {
		    	wn(st.split("lakh")[0],100000);
		    	st=st.split("lakh")[1];
		    }
		    if(st.split("thousand").length==2)
		    {
		    	wn(st.split("thousand")[0],1000);
		    	st=st.split("thousand")[1];
		    	//System.out.println(amt);
		    }
		    if(st.split("hundred").length==2)
		    {
		    	wn(st.split("hundred")[0],100);
		    	st=st.split("hundred")[1];
		    }
		    {
		    	wn(st,1);
		    }
		System.out.println(amt);
	}
}

//Enter the amount in terms of words?
//ninty eight crore seventy five lakh eight thousand two hundred seventy six 
//987508276