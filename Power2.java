import java.util.Scanner;
public class Power2 {
	public static void main(String[] args) {
	int result=1;
	Scanner sc=new Scanner(System.in);
	int num=sc.nextInt();
	for(int i=0;i<=num && i<31;i++){
		result=result*2;
		System.out.println("Table of power"+result);
		
	}
	
	sc.close();
	}
}
