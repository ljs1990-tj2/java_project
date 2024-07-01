package day10;

public class ParentClass {
	ParentClass(){}
	ParentClass(String name){
		System.out.println(name + "님 자바 클래스 테스트를 시작합니다!");
	}
	void gugudan(int num) {
		for(int i=1; i<=9; i++) {
			System.out.println(num + " * " + i + " = " + (num*i));
		}
	}
	int arrBigNum(int arr[]) {
		int max = arr[0];
		for(int i=1; i<arr.length; i++) {
			if(arr[i] > max) {
				max = arr[i];
			}
		}
		return max;
	}
}
