package day10;

public class Ex1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MyPoint p = new MyPoint(3, 50);
		MyPoint q = new MyPoint(4, 50);
		System.out.println(p); // Point(3,50)
		if(p.equals(q)) {
			System.out.println("같은 점");
		} else {
			System.out.println("다른 점");
		}	
	}
}
