package javaIO;

import java.io.*;
public class BlockBinaryCopyEx {
	public static void main(String[] args) {
		long beforeTime = System.currentTimeMillis();
		File src = new File("File\\test.jpg"); 
		File dest = new File("File\\copy.jpg"); 
		try {
			FileInputStream fi = new FileInputStream(src); 
			FileOutputStream fo = new FileOutputStream(dest); 
			byte [] buf = new byte [1024*10];
			while(true) {
				int n = fi.read(buf); 
				fo.write(buf, 0, n); 
				if(n <buf.length)
					break; 
			}
			fi.close();
			fo.close();
			System.out.println(src.getPath() + "를 " + dest.getPath() + "로 복사하였습니다.");
			
			long afterTime = System.currentTimeMillis(); // 코드 실행 후에 시간 받아오기
			double secDiffTime = (afterTime - beforeTime) / 1000.0; //두 시간에 차 계산
			System.out.println("시간차이(m) : "+ secDiffTime);
			
		} catch (IOException e) { System.out.println("파일 복사 오류"); }
	}
}