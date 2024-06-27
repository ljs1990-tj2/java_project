package day8;

public class CarMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Car sonata = new Car();
		sonata.name = "좋은차";
		sonata.speed = 10;
		sonata.setName();
		
		sonata.speedUp(5);
		
		String name = sonata.getName();
		
		Car avante = new Car();
		avante.name = "이상한차";
		avante.setName();
	}

}
