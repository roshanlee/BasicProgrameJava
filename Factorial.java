import java.util.Scanner;

public class Factorial {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int num=sc.nextInt();
		System.out.println("The prime Facorial of a number is");
		primeFacorial(num);
		sc.close();
	}
		
		
		static boolean  isPrime(int n){
			if(n==1){
				return false;
			}
		for(int i =2;i*i<=n;i++){
			if(n%i==0)
				return false;
		}
		return true;
		}
		static void  primeFacorial(int num){
			for(int i=2;i<num;i++){
				if(isPrime(i)){
				int num1=i;
				while(num%num1==0){
				
					 System.out.print(i+" ");
					num1=num1*i;
				
			}
		}
			}
		}
}		
			
