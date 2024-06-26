package day7;

public class ColorPointMain {
	public static void main(String[] args) {
		ColorPoint cp = new ColorPoint(5, 5, "YELLOW");
		cp.setXY(10, 20);
		cp.setColor("RED");
		String str = cp.toString();
		System.out.println(str + "입니다. ");
//		System.out.println(cp + "입니다. ");
	}
}
