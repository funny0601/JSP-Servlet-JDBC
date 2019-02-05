package jspbook.ch04;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.PrintWriter;
/**
 * Servlet implementation class CalcServlet
 */
@WebServlet(description = "Calc1 서블릿", urlPatterns = { "/CalcServlet" })
// 계산 기능이 통합된 서블릿

public class CalcServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	// GET 요청을 처리하기 위한 메소드
	public void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// doPost()로 포워딩
		doPost(request, response);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	// Post 요청을 처리하기 위한 메소드 
	// doGet() 에서도 호출했으므로 모든 요청은 doPost()에서 처리되는 구조
	public void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// 변수 선언
		int num1, num2;
		int result;
		String op;
		
		// 클라이언트 응답시 전달될 컨텐트에 대한 mime type과 캐릭터셋 지정
		response.setContentType("text/html; charset=UTF-8");
		
		// 클라이언트 응답을 위한 출력 스트릠 확보
		PrintWriter out = response.getWriter();
		
		// HTML 폼을통해 전달된 num1, num2 매개변수 값을 변수에 할당
		// getParameter()는 문자열로 반환
		
		num1 = Integer.parseInt(request.getParameter("num1"));
		num2 = Integer.parseInt(request.getParameter("num2"));
		op = request.getParameter("operator");
		
		// calc() 메소드 호출로 결과 받아오기
		result = calc(num1, num2, op);
		
		// 출력 스트림을 통해 화면 구성
		out.println("<html>");
		out.println("<head><title>계산기</title></head>");
		out.println("<body><center>");
		out.println("<h2>계산결과</h2>");
		out.println("<hr>");
		out.println(num1+" "+op+" "+num2+" = "+result);
		out.println("</body></html>");
	}
	
	// 실제 계산 기능을 수행하는 메소드
	public int calc(int num1, int num2, String op) {
		int result = 0;
		
		if(op.equals("+")) {
			result = num1 + num2;
		}
		else if(op.equals("-")) {
			result = num1-num2;
		}
		else if(op.equals("*")) {
			result = num1*num2;
		}
		else if(op.equals("/")) {
			result=num1/num2;
		}
		return result;
	}
}
