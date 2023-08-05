import java.util.*;

class calculator
{ 
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		
		System.out.println("\n********* Calculator **********");
		
		System.out.print("Enter first number:");
		int a = sc.nextInt();
		System.out.print("Enter second number:");
		int b = sc.nextInt();
		System.out.println("-------------------------------");
		System.out.println("What do you want to do");
		
		Boolean temp = true;
		while(temp=true)
		{
			System.out.println("-------------------------------");
			System.out.println("1.Addition\n2.Subtraction\n3.Multiplication\n4.Division\n5.close");
			System.out.println("===============================");
			System.out.print("Enter your choice:");
			int ch = sc.nextInt();
			System.out.println("-------------------------------");
			
			switch(ch)
			{
				case 1:
						int c = a+b;
						System.out.println("Addition = "+c);
						break;
				case 2:
						int d = a-b;
						System.out.println("Subtraction = "+d);
						break;
				case 3:
						int e = a*b;
						System.out.println("Multiplication = "+e);
						break;
				case 4:
						int f = a/b;
						System.out.println("Division = "+f);
						break;
				case 5:
						System.out.println("********** Thank you **********");
						System.exit(0);
						break;
			}
		}
	}
}