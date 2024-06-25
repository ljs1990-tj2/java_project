package day7;

public class ShapeMain {
	
	static void paint(Shape p) {
		p.draw();
	}
	public static void main(String[] args) {
		Line line = new Line();
		paint(line); // line.draw();
		Rect rect = new Rect();
		paint(rect);
	}
}
