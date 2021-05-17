import java.util.Scanner;

class Fibonacci {
	
	//Fibonacci Series Without using Recursion
	
	public static void main(String[] args) {
		int a=0, b=1;
		int n,temp;
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter any number you want : ");
		
		n=sc.nextInt();
		
		System.out.print(a+" "+b);
		
		for(int i=0; i<(n-2); i++){
			temp = a+b;
			System.out.print(" "+temp);
			a=b;
			b=temp;
		}
	}

}
