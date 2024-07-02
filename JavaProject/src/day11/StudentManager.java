package day11;

import java.util.ArrayList;
import java.util.Scanner;
import java.util.StringTokenizer;

public class StudentManager {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		ArrayList<Student> list = new ArrayList<>();		
		System.out.println("학생의 이름,학과,학번,학점평균 을 입력하세요.");
		while(true) {
			System.out.print(">> ");
			String info = scan.nextLine();
			if(info.equals("그만")) {
				break;
			}
			StringTokenizer st = new StringTokenizer(info, ",");
			String name = st.nextToken(); // 홍길동
			String dept = st.nextToken(); // 컴퓨터
			String id = st.nextToken(); // 1234
			String grade = st.nextToken(); // "4.5"
			double parseGrade = Double.parseDouble(grade);
			
			Student student = new Student(name,dept,id,parseGrade);
			list.add(student);
		}
		
		for(int i=0; i<list.size(); i++) {
			System.out.println("----------------------");
			System.out.println("이름 : " + list.get(i).getName());
			System.out.println("학과 : " + list.get(i).getDepartment());
			System.out.println("학번 : " + list.get(i).getId());
			System.out.println("학점 : " + list.get(i).getGrade());
			System.out.println("----------------------");
		}
		
	}

}
