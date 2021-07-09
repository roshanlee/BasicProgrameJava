import java.util.*;
public class HeadAndTail {
	public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);  
	int num=sc.nextInt();

	int count=0;
	int head=0;
	int tail=0;
	while(count<num){
	double value=Math.random();
	if(value<0.5){
		head+=1;
	}
	else{
		tail+=1;
	}
	count++;
	}
	
	System.out.println("Head percentage"+(head*100)/num);
	System.out.println("Head percentage"+((head/num)*100));
	System.out.println("Tail percentage"+((tail/num)*100));
	sc.close();
	}

	
}
