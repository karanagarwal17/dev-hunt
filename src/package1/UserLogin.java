package package1;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


@WebServlet("/UserLogin")
public class UserLogin extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		System.out.println("cjdgavcjdcv");
		String username = request.getParameter("username");
		String password = request.getParameter("password");
		String usertype = request.getParameter("optionsRadio");
		System.out.println(username + " " + password + "" + usertype);
		
		if(username.equals("karan") && password.equals("agarwal")){
			if(usertype.equals("recruiter")){
				response.sendRedirect("index.jsp");
			}
			else if(usertype.equals("developer")){
				response.sendRedirect("profile.jsp");
			}
		}
	}
}
