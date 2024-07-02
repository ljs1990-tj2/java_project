package day11;

import java.util.*;

public class CustomerManager {
	private HashMap<String, Integer> map = new HashMap<String, Integer>();
	private Scanner scanner = new Scanner(System.in);
	
	public CustomerManager() { }
	
	public void run() {
		System.out.println("** 포인트 관리 프로그램입니다 **");

		while(true) {
			System.out.print("이름과 포인트 입력>> ");
			String name = scanner.next();
			if(name.equals("그만"))
				break;
			int point = scanner.nextInt();
			
			Integer n = map.get(name); // 이름으로 포인트 검색
			if(n != null) { // 신규가 아닌 경우
				point += n; // 포인트 점수 누적
			}
			
			map.put(name, point); // 이름과 누적 포인트 갱신
			printAll();
		}
	}
	
	void printAll() {
		Set<String> keys = map.keySet();
		Iterator<String> it = keys.iterator();
		while(it.hasNext()) {
			String name = it.next();
			int point = map.get(name);
			System.out.print("("+name+","+point+")");			
		}
		System.out.println();
	}
	
	public static void main(String[] args) {
		CustomerManager man = new CustomerManager();
		man.run();
	}
}

