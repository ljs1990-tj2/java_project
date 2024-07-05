package day12;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;

public class FruitMarket {
	static Scanner scan = new Scanner(System.in);
	static ArrayList<HashMap<String, Object>> list = new ArrayList<>();
	
	// 반복문 돌면서 과일명으로 해당 map 찾기
	public static HashMap<String, Object> searchFruit(String inputName) {
		HashMap<String, Object> map = new HashMap<>();
		for(int i=0; i<list.size(); i++) {
			String name = (String) list.get(i).get("name");
			if(inputName.equals(name)) {
				map =  list.get(i);
			}
		}
		return map;
	}
	
	// 추가
	public static void addFruit() {
		System.out.print("과일명 : ");
		String name = scan.next();
		HashMap<String, Object> map = searchFruit(name);
		if(map.containsKey("name")) { // 기존 과일명 있을 경우
			System.out.print("추가 개수: ");
			checkNum(map, "num", scan.nextInt() + (int) map.get("num"));
		} else { // 기존 과일에 없을 경우
			map.put("name", name);
			System.out.print("가격 : ");
			checkNum(map, "price", scan.nextInt());
			System.out.print("개수 : ");
			checkNum(map, "num", scan.nextInt());
		}
		if(map.containsKey("price") && map.containsKey("num")) {
			list.add(map);
		}
		
	}
	public static void sellFruit() {
		System.out.print("과일명 : ");
		String inputName = scan.next();
		System.out.print("개수 : ");
		int inputNum = scan.nextInt();
		if(!checkNum(inputNum)) {return;}
		
		HashMap<String, Object> map = searchFruit(inputName);
		String name = (String) map.get("name");
		
		if(inputName.equals(name)) { // 과일이 있을 경우
			int fruitNum = (int) map.get("num") - inputNum;
			if(fruitNum < 0) {
				System.out.println("과일이" + (Math.abs(fruitNum)) + "개 부족합니다.");
			} else {
				map.put("num", fruitNum);
				System.out.println("판매되었습니다.");
				System.out.println(name + "의 현재 남은 개수는 " + fruitNum + "개 입니다." );
			}
		} else {
			System.out.println("없는 과일 입니다.");
		}
	}
	public static void findFruit() {
		System.out.print("과일명 : ");
		String inputName = scan.next();
		HashMap<String, Object> map = searchFruit(inputName);
		String name = (String) map.get("name");
		
		if(inputName.equals(name)) {
			int num = (int) map.get("num");
			System.out.println(name + "의 현재 남은 개수는 " + num + "개 입니다." );
		} else {
			System.out.println("없는 과일 입니다.");
		}
	}
	
	
	// 숫자 유효성 체크
	public static void checkNum(HashMap<String, Object> map, String txt, int num) {
		if(num <= 0) {
			System.out.println("0초과 숫자를 입력해야 합니다.");
		} else {
			map.put(txt, num);
		}
	}
	// 숫자 유효성 체크
	public static boolean checkNum(int num) {
		if(num <= 0) {
			System.out.println("0초과 숫자를 입력해야 합니다.");
			return false;
		} 
		return true;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		for(;;) {
			System.out.println("== (1)과일 추가 (2) 판매 (3) 개수확인 (그외) 종료");
			String menu = scan.next();
			if(menu.equals("1")) {
				addFruit(); 
			} else if(menu.equals("2")) {
				sellFruit();
			} else if(menu.equals("3")) {
				findFruit();
			} else {
				System.out.println("종료되었습니다.");
				break;
			}
		}
	}
}
