import java.util.Scanner;

class Fibonacci_Recursion {
	
	//Fibonacci Series Using Recursion
	
	static int a=0,b=1,temp;
	 
	public static void fibo(int num) {
		
		
		if(num>0) {
			
			temp=a+b;
			System.out.print(" "+temp);
			a=b;
			b=temp;
			//Used recursion with decrementing the size of num
			fibo(num-1);
		}
		else {
			//System.out.println("Number should greater than 0.");
		}
	} 
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter any number");
		int n = sc.nextInt();
		System.out.print(a+" "+b);
		fibo(n-2);
	}
}
