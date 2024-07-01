package day10;

public class Circle {
	int x;
	int y;
	int radius;
	Circle(int x, int y, int radius){
		this.x = x;
		this.y = y;
		this.radius = radius;
	}
	
	@Override
	public String toString() {
		// Circle(2,3) 반지름 5
		return "Circle(" + x + "," + y + ") 반지름 " + radius;
	}
	
	@Override
	public boolean equals(Object obj) {
		// TODO Auto-generated method stub
		Circle p = (Circle) obj;
		if(this.x == p.x && this.y == p.y) {
			return true;
		} else {
			return false;
		}
	}
	
}
