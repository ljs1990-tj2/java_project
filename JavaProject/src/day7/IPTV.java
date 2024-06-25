package day7;

public class IPTV extends ColorTV{
	String ip;
	IPTV(String ip, int size, int color){
		super(size, color);
		this.ip = ip;
	}
	
	void printProperty() {
		// 나의 IPTV는 192.1.1.2 주소의 32인치 2048컬러
		System.out.print("나의 IPTV는 " + ip + " 주소의 " );
		super.printProperty();
	}
}
