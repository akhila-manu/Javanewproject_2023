package Day07;

public class Program01 {

	public static void main(String[] args) {
		
			
				main();
				main("Good day..!");
				System.out.println(main(10,30));
			}

			public static void main(String message)
			{
				System.out.println(message);
			}
			
			public static void main()
			{
				System.out.println("Main overloading method");
			}
			
			public static int main(int a,int b)
			{
				return a+b;
			}
		}

	


