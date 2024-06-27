package day9;

public class PositivePoint extends Point{
	
	PositivePoint(){
		super(0, 0);
	}
	
	PositivePoint(int x, int y) {
		super(x, y);
		if(x < 0 || y < 0) {
			super.move(0, 0);
		}
	}
	
	@Override
	protected void move(int x, int y) {
//		if(x >= 0 && y >= 0) {
//			super.move(x, y);
//		}
		if(!(x < 0 || y < 0)) {
			super.move(x, y);
		}
	}
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		// (1,2,3) 의 점
		return "("+super.getX()+","+super.getY()+") 의 점";
	}
}
