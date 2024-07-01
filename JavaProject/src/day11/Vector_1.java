package day11;

import java.util.Vector;

public class Vector_1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Vector<String> vector = new Vector<String>();
		
		vector.add("자바");
		vector.add("오라클");
		vector.add("html/css");
		vector.add(2, "자바스크립트");
		// [자바, 오라클, 자바스크립트, html/css]
//		System.out.println(vector.get(1));
		
		for(int i=0; i<vector.size(); i++) {
			System.out.println(vector.get(i));
		}	
		
	}
}
