package day9;

public class PointMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// 3번 문제
//		Point3D p = new Point3D(1, 2, 3); // 1,2,3은 각각 x, y, z축의 값.
//		System.out.println(p.toString() + "입니다.");
//		p.moveUp(); // z 축으로 위쪽 이동
//		System.out.println(p.toString() + "입니다.");
//		p.moveDown(); // z 축으로 아래쪽 이동
//		p.move(10, 10); // x, y 축으로 이동
//		System.out.println(p.toString() + "입니다.");
//		p.move(100, 200, 300); // x, y, z축으로 이동
//		System.out.println(p.toString() + "입니다.");

		// 4번 문제
		PositivePoint p = new PositivePoint();
		p.move(10, 10);
		System.out.println(p.toString() + "입니다.");
		p.move(-5, 5); // 객체 p는 음수 공간으로 이동되지 않음
		System.out.println(p.toString() + "입니다.");
		PositivePoint p2 = new PositivePoint(-10, -10);
		System.out.println(p2.toString() + "입니다.");
	}

}
