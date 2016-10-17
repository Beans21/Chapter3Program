
public class Ch3Programming {
	public static void main (String[] args) {
		System.out.println("Exercise 1");
		distance(29,16,34,8);
		distance(6,19,22,7);
		distance(25,24,16,14);
		System.out.println();
		System.out.println("Excersice 2");
		roadTrip(5.25);
		roadTrip(20.0);
		System.out.println("Exercise 3");
		distance(7,4,15,4);
		distance(15,4,12,10);
		distance(12,10,7,4);
		

		
	}
	
	public static double distance(double x1, double y1, double x2, double y2) {
		double x= Math.pow(x2-x1, 2);
		double y= Math.pow(y2-y1, 2);
		double d= Math.sqrt(x+y);
		System.out.println(d);
		return d;
	}
	
	public static double roadTrip(double di) {
		double c= (di*Math.PI);
		System.out.println(c);
		return c;
	}
	
}
