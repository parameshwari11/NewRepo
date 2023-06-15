import java.util.Scanner;

public class PrimeNO 
{

	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		
		System.out.println("enter the no");
		
		int a=sc.nextInt();
		if(a%2==0)
		{
			System.out.println("its a prime no");
		}
			else
				System.out.println("not a prime no");
		}

	}


