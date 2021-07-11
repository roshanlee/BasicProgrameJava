
public class Distance {

	public static void main(String[] args) {
		int x=Integer.parseInt( args[0]); 
		int y=Integer.parseInt( args[1]); 
		System.out.println(distance(x,y));
		
	}
	public static double distance(int x,int y){
		
		double dis=Math.sqrt(Math.pow(x,x)+Math.pow(y,y));
		return dis;
		
		
	}

}
