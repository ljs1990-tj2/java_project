package day2;

public class Test1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// 1. 반복문을 통해 1부터 30까지 중 3의 배수이거나 
		//    7의 배수일 경우만 화면에 출력
		for(int i=1; i<=30; i++) {
			if(i % 3 == 0 || i % 7 == 0) {
				System.out.println(i);
			}
		}
	}

}
