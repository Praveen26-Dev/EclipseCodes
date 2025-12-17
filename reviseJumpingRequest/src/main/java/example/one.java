package example;

import java.io.IOException;
import java.net.Authenticator.RequestorType;

import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpSession;

@WebServlet("/submit")
public class one extends HttpServlet{
	
	@Override
	protected void service(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException {
		String name = req.getParameter("name");
		String address = req.getParameter("address");
		
		HttpSession session =req.getSession();
		session.setAttribute("name", name);
		session.setAttribute("address", address);
		
		if(name.equals("praveen")&&address.equals("Bhopal")) {
			RequestDispatcher rd=req.getRequestDispatcher("/products.jsp");
			rd.forward(req, res);
			
			RequestDispatcher rd1=req.getRequestDispatcher("/profile.jsp");
			rd.forward(req, res);
		}
	}

}
