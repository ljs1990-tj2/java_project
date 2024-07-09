package fruitMarket;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;

public class FruitMarket2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s = new Scanner(System.in);
		ArrayList<HashMap<String, Object>> list = new ArrayList<>();
		while(true) {
			System.out.println("== (1)과일 추가 (2) 판매 (3) 개수확인 (그외) 종료");
			System.out.print("메뉴 선택 : ");
			int menu = s.nextInt();
			HashMap<String, Object> map = new HashMap<>();
			if(menu == 1) {
				// 과일 추가
				System.out.print("과일명 : ");
				String inputName = s.next();
				boolean isFruit = false;
				for(int i=0; i<list.size(); i++) {
					String name = (String) list.get(i).get("name");
					if(inputName.equals(name)) {
						isFruit = true;
						System.out.print("개수 : ");
						int inputNum = s.nextInt();
						list.get(i).put("num", (int) list.get(i).get("num") + inputNum);
					}
				}
				if(!isFruit) {
					map.put("name", inputName);
					System.out.print("가격 : ");
					map.put("price", s.nextInt());
					System.out.print("개수 : ");
					map.put("num", s.nextInt());
					list.add(map);
				}
				
			}	
			System.out.println(list);
		}
	}

}
