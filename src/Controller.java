import javax.servlet.*;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.*;
import java.io.*;
import java.util.*;



@WebServlet(urlPatterns="/Controller")
public class Controller extends HttpServlet 
{
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	
	
	public void doPost(HttpServletRequest request,HttpServletResponse response)throws IOException, ServletException
	{
		System.out.println("1");

		String c =request.getParameter("type");
		System.out.println("Type Values is : "+c);
		
		Model model = new Model();
		List<?> result = model.getTypes(c);
		
		System.out.println("The Result We Got From Model : "+result);
		
		request.setAttribute("styles", result);
		RequestDispatcher view = request.getRequestDispatcher("result.jsp");
		view.forward(request,response);
		
	}
	

}