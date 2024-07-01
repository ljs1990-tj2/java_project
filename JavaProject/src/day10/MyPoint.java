package day10;

public class MyPoint {
	int x ;
	int y ;
	MyPoint(int x, int y){
		this.x = x;
		this.y = y;
	}
	
	@Override
	public String toString() {
		// Point(3,50)
		return "Point(" + x + "," + y + ")";
	}
	
	@Override
	public boolean equals(Object obj) {
		// TODO Auto-generated method stub
		MyPoint p = (MyPoint) obj;
		if(this.x == p.x && this.y == p.y) {
			return true;
		} else {
			return false;
		}
	}
}
