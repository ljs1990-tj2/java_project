package day7;

public class ColorPoint extends Point{
	private String color;
	ColorPoint(int x, int y, String color){
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
