package round10.models;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import javax.servlet.ServletException;

public class Round10_MemberDAO {
	private Connection conn;
	public Round10_MemberDAO() throws ServletException{
		try {
			Class.forName("com.mysql.jdbc.Driver");
		}catch(ClassNotFoundException ex) {
			throw new ServletException("드라이버 오류");
		}
		String url = "jdbc:mysql/localhost:3306/web_java";
		String id ="root";
		String pw = "00000000";
		
		try {
			conn = DriverManager.getConnection(url,id,pw);
		}catch(SQLException ex) {
			throw new ServletException("접속 오류");
		}
	}
	public boolean registerMember(Round10_MemberDTO dto) throws ServletException{
		String query = "insert into Round10_Member values (null,?,?,?)";
		
		try {
			PreparedStatement pstmt = conn.prepareStatement(query);
			pstmt.setString(1, dto.getName());
			pstmt.setString(2, dto.getTel());
			pstmt.setString(3, dto.getAddr());
			pstmt.executeUpdate();
			pstmt.close();
		}catch(SQLException ex) {
			throw new ServletException("등록 실패");
		}finally {
			this.close();
		}
		return true;
	}
	private void close() {
		try {
			if(conn != null && conn.isClosed()) conn.close();
		}catch(SQLException ex) {conn = null;}
	}
}
