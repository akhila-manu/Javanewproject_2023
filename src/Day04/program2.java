package Day04;

public class program1 {

	public static void main(String[] args) {
		program1 abc=new program1();
		int x=add(20,40);
		System.out.println(x*x);
		System.out.println(x*x*x);
		byte u=50;
		byte v=20;
		abc.sub((byte)50,(byte)20);
		abc.sub(u,v);
	}
		
		
	
	public static int add(int a,int b)	
	{
	
	System.out.println(a+b);
	return a+b;
	}
	public static int sub(byte a,byte b)
	
	{
		return a-b;
		
	

	}

}

	}

}
