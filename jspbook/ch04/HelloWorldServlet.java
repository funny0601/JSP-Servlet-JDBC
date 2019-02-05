package jspbook.ch04;

import java.io.IOException;
// PrintWriter 객체 사용을 위한 패키지 import
import java.io.PrintWriter;
// import javax.servlet.* ;
// 서블릿 개발에 필요한 클래스들은 주로 javax.servlet에 포함
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
// import java.servlet.http.*;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class HelloWorldServlet
 */

/* 서블릿 매핑을 위한 애너테이션으로 
 * 서블릿을 생성할 때 지정한 내용들이 자동으로 들어가게 된다.
 * @ : 애너테이션의 시작
 * description, urlPatterns: 해당 에너테이션에 전달되는 일종의 매개변수
 */
@WebServlet(description = "처음 만드는 서블릿", urlPatterns = { "/HelloWorldServlet" })

public class HelloWorldServlet extends HttpServlet {
	//HttpServlet 클래스를 상속받는 HelloWorldServlet 클래스
	private static final long serialVersionUID = 1L;
	
	public HelloWorldServlet() {
		// 기본 생성자
	}
	// 클라이언트 요청을 처리할 doGet(), doPost() 메서드 구현 
	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// 콘텐츠 타입 선언 및 한글 설정
		// 웹 서버가 클라이언트에 데이터를 보낼 때, text/html 형식으로 전달
		// 한글 처리를 위해 캐릭터셋을 UTF-8로 지정
		response.setContentType("text/html;charset=UTF-8");
		// 웹 브라우저 출력을 위한 PrintWriter 객체 확보
		PrintWriter out = response.getWriter();
		// HTML 형식으로 브라우저 출력 콘텐츠 작성
		// 서블릿의 최대 취약점 : HTML 처리를 소스코드 내에서 하드코딩해야 함
		out.println("<html>");
		out.println("<head><title>Hello World Servlet</title></head>");
		out.println("<body><h2>Hello World Servlet : 헬로월드</h2></body>");
		out.println("</html>");
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// Post에서 별다른 처리 없이 doGet으로 포워딩
		doGet(request, response);
	}

}
