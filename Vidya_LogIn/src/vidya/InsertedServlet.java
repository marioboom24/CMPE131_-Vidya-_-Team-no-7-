package vidya;
import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


public class InsertedServlet extends HttpServlet {
	
	private static final long serialVersionUID = 1L;

	public void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		response.setContentType("text/html");
		PrintWriter out = response.getWriter();
		
		String strUsername=request.getParameter("username");
		String strUserpass = request.getParameter("userpass");
		out.print("Username "+strUsername+" and password "+strUserpass + " is saved successfully");
		out.println("Click here to return to the login page");
		out.close();
	}

}
