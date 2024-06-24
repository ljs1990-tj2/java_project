package day6;

import java.util.Arrays;
import java.util.Scanner;

public class Ref {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		int a = 100;
//		System.out.println(a);
//		
//		Student hong = new Student(1234, "홍길동");
//		System.out.println(hong.getAge());
		
//		int arr1[] = {1,2,3,4,5}; // abcd
//		int arr2[] = arr1; // abcd
//		
//		arr2[0] = 10000; // {10000,2,3,4,5}
//		System.out.println(Arrays.toString(arr1));
		
		
		int arr1[] = {5,1,1,2,3}; // abcd
//		Arrays.sort(arr1);
//		System.out.println(Arrays.toString(arr1));
		Array_Ex1.arrayEx1(arr1); // abcd
		System.out.println(Arrays.toString(arr1));
		
		String name1 = "홍길동";
		String name2 = "홍길동";
		Scanner s = new Scanner(System.in);
		String name3 = s.next();
		
		System.out.println(name1 == name3);
		System.out.println(name1.equals(name3));
		
		
		
	}

}
