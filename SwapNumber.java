import java.util.Scanner;

public class SwapNumber {
	public static int num1;
	public static int num2;
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		num1=sc.nextInt();
		num2=sc.nextInt();
		System.out.println("Number before swap "+num1+" "+num2);
		swap();
		System.out.println("Number After Swap "+num1+" "+num2);
		sc.close();
		
	}
	static void swap(){
		int temp;
		temp=num1;
		num1=num2;
		num2=temp;
	}

}
