package jdbc;

import java.io.*;
import java.sql.*;
import java.util.Scanner;

public class DBManager {
	static Connection conn;
	static Statement stmt = null;
	static Scanner s = new Scanner(System.in);

	public static void main(String[] args) {
		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");
			String db_url = "jdbc:oracle:thin:@localhost:1521:xe";
			String db_id = "SYSTEM";
			String db_pw = "test1234";
			conn = DriverManager.getConnection(db_url, db_id, db_pw);
			System.out.println("DB 연결 완료");
			stmt = conn.createStatement();
			int choice = 1;
			while (choice != 5) {
				System.out.print("추가(1), 삭제(2), 수정(3), 확인(4) 끝내기(5)>>");
				choice = Integer.parseInt(s.nextLine());
				switch (choice) {
				case 1:
					add();
					break;
				case 2:
					delete();
					break;
				case 3:
					update();
					break;
				case 4:
					select(stmt);
					break;
				case 5:
					break;
				default:
					System.out.println("잘못 입력하셨습니다.");
				}
			}
		} catch (ClassNotFoundException e) {
			System.out.println("JDBC 드라이버 로드 에러");
		} catch (SQLException e) {
			System.out.println("SQL 실행 에러");
		}
	}

	private static void update() {
		try {
			System.out.print("아이디 입력 : ");
			String id = s.nextLine();
			System.out.print("수정할 학과 입력 : ");
			String dept = s.nextLine();
			stmt.executeUpdate("UPDATE TBL_STUDENT SET DEPT = '" + dept + "' WHERE ID = '" + id + "'");
			System.out.println("수정되었습니다.");
		} catch (SQLException e) {
			System.out.println("레코드 수정 에러");
		}
	}

	private static void delete() {
		try {
			System.out.print("삭제할 아이디 입력 : ");
			String id = s.nextLine();
			stmt.executeUpdate("DELETE FROM TBL_STUDENT WHERE ID = '" + id + "'");
			System.out.println("삭제되었습니다.");
		} catch (SQLException e) {
			System.out.println("레코드 삭제 에러");
		}
	}

	private static void add() {
		try {
			System.out.print("아이디 입력 : ");
			String id = s.nextLine();
			System.out.print("이름 입력 : ");
			String name = s.nextLine();
			System.out.print("학과 입력 : ");
			String dept = s.nextLine();
			stmt.executeUpdate("INSERT INTO TBL_STUDENT " + "(ID, NAME, DEPT) VALUES ('" + id + "','" + name + "','"
					+ dept + "')");
			System.out.println("추가되었습니다.");
		} catch (SQLException e) {
			System.out.println("레코드 추가 에러");
		}
	}

	private static void select(Statement stmt) throws SQLException {
		ResultSet srs = stmt.executeQuery("select * from TBL_STUDENT");
		System.out.println("====== 학생 목록 ========");
		while (srs.next()) {
			System.out.print(srs.getString("ID"));
			System.out.print("\t|\t" + srs.getString("NAME"));
			System.out.println("\t|\t" + srs.getString("DEPT"));
		}
	}
}
