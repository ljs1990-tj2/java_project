package day11;

import java.util.ArrayList;
import java.util.HashMap;

public class Map_1 {
	static void front() {
		
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		key : name, value : "홍길동",
//		key : age, value : 30,
//		key : addr, value : "인천",
//		key : phone, value : "010-1234-5678",
		
		HashMap<String, Object> hong
			= new HashMap<String, Object>();
		hong.put("name", "홍길동");
		hong.put("age", 30);
		hong.put("addr", "인천");
		hong.put("phone", "010-1234-5678");
		
		HashMap<String, Object> kim
			= new HashMap<String, Object>();
		kim.put("name", "김철수");
		kim.put("age", 40);
		kim.put("addr", "서울");
		kim.put("phone", "010-1234-1234");
		
		HashMap<String, Object> yu
			= new HashMap<String, Object>();
		yu.put("name", "유재석");
		yu.put("age", 50);
		yu.put("addr", "서울");
		yu.put("phone", "010-1212-1234");
		
		ArrayList<HashMap<String, Object>> list
			= new ArrayList<>();
		list.add(hong);
		list.add(kim);
		list.add(yu);
		System.out.println(list);
	}
}
