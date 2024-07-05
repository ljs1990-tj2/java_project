package day12;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;

public class Map_2 {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner scan = new Scanner(System.in);
		System.out.println("성적관리 시스템");
		ArrayList<HashMap<String, Object>> list 
			= new ArrayList<>();
		for(int i=0; i<3; i++) {
			HashMap<String, Object> map 
				= new HashMap<String, Object>();
			System.out.print("이름 >> ");
			map.put("name", scan.next());
			while(true) {
				System.out.print("자바 점수는? >> ");
				int java = scan.nextInt();
				if(java <0 || java > 40) {
					System.out.println("안됨");
				} else {
					break;
				}
				map.put("java", java);
			}
			
			
			
			while(true) {
				System.out.print("오라클 점수는?>> ");
				int java = scan.nextInt();
				if(java <0 || java > 40) {
					System.out.println("안됨");
				} else {
					break;
				}
				map.put("java", java);
			}
			
			while(true) {
				System.out.print("html 점수는? >> ");
				int java = scan.nextInt();
				if(java <0 || java > 40) {
					System.out.println("안됨");
				} else {
					break;
				}
				map.put("java", java);
			}
			list.add(map);
			System.out.println("--------------------------");
		}
		for(int i=0; i<list.size(); i++) {
			HashMap<String, Object> user = list.get(i);
			int sum 
				= (int) user.get("java") + (int) user.get("oracle") + (int) user.get("html");
			System.out.println("이름 : " + user.get("name") + ", 총점 : " + sum);
		}
	}

}
