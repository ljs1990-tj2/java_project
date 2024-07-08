package javaIO;

import java.io.*;

public class BinaryCopyEx {
	public static void main(String[] args) {
		long beforeTime = System.currentTimeMillis();
		File src = new File("File\\test.jpg"); 
		File dest = new File("File\\copy.jpg"); 

		int c;
		try {
			FileInputStream fi = new FileInputStream(src); 
			FileOutputStream fo = new FileOutputStream(dest);
			while((c = fi.read()) != -1) {
				fo.write((byte)c);
			}
			fi.close();
			fo.close();
			System.out.println(src.getPath()+ "를 " + dest.getPath()+ "로 복사하였습니다.");
			long afterTime = System.currentTimeMillis(); 
			double secDiffTime = (afterTime - beforeTime) / 1000.0; 
			System.out.println("시간차이(m) : "+ secDiffTime);
		} catch (IOException e) {
			e.printStackTrace();
			System.out.println("파일 복사 오류");
		}
	}
}