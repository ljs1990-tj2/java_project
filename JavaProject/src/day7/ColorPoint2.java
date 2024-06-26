package day7;

public class ColorPoint2 extends Point {
	private String color;

	ColorPoint2(){
		this(0, 0, "BLACK");
//		 super(0,0);
//		 this.color = "BLACK";
	}

	ColorPoint2(int x, int y) {
		this(x, y, "BLACK");
	}

	ColorPoint2(int x, int y, String color) {
		super(x, y);
		this.color = color;
	}

	void setXY(int x, int y) {
		move(x, y);
	}

	void setColor(String color) {
		this.color = color;
	}

	@Override
	public String toString() {
		// RED색의 (10,20)의 점
		return color + "색의 (" + getX() + "," + getY() + ")의 점";

	}
}
