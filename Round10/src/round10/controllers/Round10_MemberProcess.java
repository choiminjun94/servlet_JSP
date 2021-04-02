//서블릿 클래스 작성

package round10.controllers;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import round10.models.*;

public class Round10_MemberProcess extends HttpServlet {

	@Override
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		request.setCharacterEncoding("euc-kr");
		String name = request.getParameter("name");
		String tel = request.getParameter("tel");
		String addr = request.getParameter("addr");
		
		Round10_MemberDTO dto = new Round10_MemberDTO();
		dto.setName(name);
		dto.setTel(tel);
		dto.setAddr(addr);
		Round10_MemberDAO dao = new Round10_MemberDAO();
		boolean bool = dao.registerMember(dto);
		
		if(bool) {
			response.sendRedirect("./Round10_Success.html");
		}
	}
}
