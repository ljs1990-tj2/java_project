package day11;

import java.util.ArrayList;
import java.util.HashMap;

public class ArrayList_1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<Object> list = new ArrayList<Object>();
		
		list.add("홍길동");
		list.add(50);
		list.add("서울");
		
		HashMap<String, Object> map = new HashMap<>();
		map.put("name", "홍길동");
		map.put("age", 50);
		map.put("addr", "서울");
		
		if(map.containsKey("age")) {
			System.out.println(map.get("age") + "입니다.");
		}
		
	}

}
