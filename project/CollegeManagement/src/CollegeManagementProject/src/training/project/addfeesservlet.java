/** @author Sandeep */
package CollegeManagementProject.src.training.project;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class addfeesservlet
 */
@WebServlet("/addfeesservlet")
public class addfeesservlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
    
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		Fees f = new Fees();
		f.setsId(Integer.parseInt(request.getParameter("id")));
		f.fees=Double.parseDouble(request.getParameter("feestobepaid"));
		f.fine_amount=Double.parseDouble(request.getParameter("finetobepaid"));
		f.fees_paid=Double.parseDouble(request.getParameter("amountpaid"));
		StandardsFees f1= new FeesDAO();
		f1.addFeesDetails(f);
		PrintWriter out = response.getWriter();
		out.println("Fees successfully added");
	}

	
}
