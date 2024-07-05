package day12;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;

public class Map_3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s = new Scanner(System.in);
		ArrayList<HashMap<String, Object>> list
			= new ArrayList<>();
		
		while(true) {
			System.out.println("== (1)과일 추가 (2) 판매 (3) 개수확인 (그외) 종료");
			System.out.print("메뉴 선택 : ");
			int select = s.nextInt();
			
			if(select == 1) {
				// 과일 추가
				HashMap<String, Object> map = new HashMap<>();
				System.out.print("과일명 입력 : ");
				String name = s.next();
				map.put("name", name);
				
				System.out.print("가격 입력 : ");
				int price = s.nextInt();
				map.put("price", price);
				
				System.out.print("갯수 입력 : ");
				int count = s.nextInt();
				map.put("cnt", count);
				
				list.add(map);
				
			} else if(select == 2) {
				// 판매
				System.out.print("과일명 입력 : ");
				String name = s.next();
				
				System.out.print("갯수 입력 : ");
				int count = s.nextInt();
				
				for(int i=0; i<list.size(); i++) {
					String fruitName = (String) list.get(i).get("name");
					if(name.equals(fruitName)) {
						HashMap<String, Object> map = new HashMap<>();
						map = list.get(i);
						int fruitCnt = (int) map.get("cnt");
						if(fruitCnt - count >= 0) {
							System.out.println("판매되었습니다.");
							map.put("cnt", fruitCnt - count);
							System.out.println(name + "의 현재 남은 개수는 " + (fruitCnt - count) + "개 입니다." );
						} else {
							System.out.println("판매불가!!");
							System.out.println(name + "의 현재 남은 개수는 " + fruitCnt + "개 입니다." );
						}
					}
				}
				
			} else if(select == 3) {
				// 확인
				System.out.print("과일명 입력 : ");
				String name = s.next();
				
				for(int i=0; i<list.size(); i++) {
					String fruitName = (String) list.get(i).get("name");
					if(name.equals(fruitName)) {
						HashMap<String, Object> map = new HashMap<>();
						map = list.get(i);
						int fruitCnt = (int) map.get("cnt");
						System.out.println(name + "의 현재 남은 개수는 " + fruitCnt + "개 입니다." );
					}
				}
			} else {
				System.out.println("종료!");
				break;
			}
			
		}
	}

}
