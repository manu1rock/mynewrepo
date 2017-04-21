package practice;

public class StringLength 
{
	static int i, c=0, res;
	
	static int getLength(String s)
	{
		try
		{
			//using charArray
			int count=0;
			char[] ar = s.toCharArray();
			for(char c : ar)
			{
				count++;
			}
			System.out.println("count is: "+count);
			
			//using charAt
			for(i=0;0<=i;i++)
			{
				s.charAt(i);
				System.out.println("vlaue of i is: "+i);
				c=c+1;
			}
			
		}
		catch(Exception e)
		{
			System.out.println("String length is: ");
		}
		
		return c;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		res = StringLength.getLength("I am good boy");
		System.out.println(res);

	}

}
