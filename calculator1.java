import java.util.Scanner;

public class calculator1 {

	private static int ch;

	public static void main(String[] args) {
		

		int a,b,c;
		System.out.print("enter any two number: ");
		Scanner s=new Scanner (System.in);
		
		a=s.nextInt();
		b=s.nextInt();
		System.out.print("enter your choice: ");
		ch=s.nextInt();
		
		switch(ch)
		
		{
		case 1:c=a+b;
		System.out.print("Addition "+c);
		break;
		case 2:c=a-b;
		System.out.print("Subtraction "+c);
		break;
		case 3:c=a*b;
		System.out.print("Multification: "+c);
		break;
		case 4:c=a/b;
		System.out.print("Division: "+c);
		break;
		case 5:c=a%b;
		System.out.print("Ramainder: "+c);
		break;
		default:
			System.out.print("invalid choice....: ");
			


		




		
			
		}


		
	

	}

}
