package day7;

public class ColorPointMain2 {
	public static void main(String[] args) {
		ColorPoint2 zeroPoint = new ColorPoint2(); // (0,0) 위치의 BLACK 색 점
		System.out.println(zeroPoint+ "입니다.");
		ColorPoint2 cp = new ColorPoint2(10, 10); // (10,10) 위치의 BLACK 색 점
		cp.setXY(5, 5);
		cp.setColor("RED");
		System.out.println(cp + "입니다.");
//		BLACK색의 (0,0) 점입니다.
//		RED색의 (5,5) 점입니다.
	}
}
