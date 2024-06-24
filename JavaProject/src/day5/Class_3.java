package day5;

public class Class_3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Fruit orange = new Fruit("오렌지", 1500);
//		orange.price = 100;
		
		orange.setPrice(100);
		
//		orange.price = 100;
		int price = orange.getPrice(3);
		
	}
}
