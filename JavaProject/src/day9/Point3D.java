package day9;

public class Point3D extends Point{
	private int z;
	public Point3D(int x, int y, int z) {
		super(x, y);
		this.z = z;
	}
	
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		// (1,2,3) 의 점
		return "("+super.getX()+","+super.getY()+","+this.z+") 의 점";
	}
	
	void moveUp() {
		this.z++;
	}
	void moveDown() {
		this.z--;
	}
	void move(int x, int y, int z) {
		super.move(x, y);
		this.z = z;
	}
	
}
