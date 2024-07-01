package day9;

public class Test {
	static void humanInfo(Human h) {
		String className = "";
		if (h instanceof Student) {
			className = "학생";
		}
		if (h instanceof Worker) {
			className = "직장인";
		}
		if (h instanceof Researcher) {
			className = "연구원";
		}
		System.out.println("이 객체는 " + className + " 클래스 객체 입니다.");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Student s = new Student("홍길동", 30);
		Worker w = new Worker("김철수", 20);
		Researcher r = new Researcher("박영희", 25);
		humanInfo(s);
		humanInfo(w);
		humanInfo(r);
		Orange o = new Orange("오렌지", "오렌지색", 1000);
		Apple a = new Apple("사과", "빨간색", 5000);
//		fruitBox(o);
//		fruitBox(a);
	}

}
