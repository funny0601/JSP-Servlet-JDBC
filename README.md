# JSP-Servlet-JDBC
walk-through JSP programming

#### HttpServletRequest 클래스의 주요 메소드
<pre><code>getParameterNames() // 현재 요청에 포함된 매개변수 이름을 열거 형태로 넘겨준다.
getParameter(name) // 문자열 name과 같은 이름을 가진 매개변수 값을 가져온다.
getParameterValues(name) // 문자열 name과 같은 이름을 가진 매개변수 값을 <strong>배열</strong> 형태로 가져온다.
                         // 주로 checkbox, multiple list등에 사용
getCookies() // 모든 쿠키 값을 javax.servlet.http.Cookie의 배열 형태로 가져온다.
getMethod() // 현재 요청이 Get인지, Post인지를 파악해서 가져온다.
getSession() // 현재 세션 객체를 가져온다.
getRemoteAddr() // 클라이언트의 IP 주소를 알려준다.
getProtocol() // 현재 서버으 프로토콜을 문자열 형태로 알려준다.
setCharacterEncoding() // 현재 JSP로 전달되는 내용을 지정한 캐릭터셋으로 변환해준다.
                       // HTML 폼에서 한글을 입력할 때 정상적으로 처리하려면 반드시 필요하다.
</code></pre>


#### HttpServletResponse 클래스의 주요 메소드
<pre><code>setContentType(type) // 문자열 형태의 type에 지정된 MIME Type을으로 Content Type을 설정한다.
setHeader(name, value) // 문자열 name의 이름으로 문자열 value 값을 헤더로 설정한다.
setDateHeader(name, date) // 문자열 name의 이름으로 date에 설정된 밀리세컨드 시간 값을 헤더에 설정한다.
sendError(status, msg) // 오류 코드를 설정하고 메시지를 보낸다.
sendRedirect(url) // 클라이언트 요청을 
</code></pre>
