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
 * Servlet implementation class addstudentservlet
 */
@WebServlet("/addstudentservlet")
public class addstudentservlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		Student s1 = new Student();
		s1.setsId(Integer.parseInt(request.getParameter("id")));
		s1.setName(request.getParameter("name"));
		s1.setAge(Integer.parseInt(request.getParameter("age")));
		s1.setStandard(request.getParameter("standard"));
		s1.setDivision(request.getParameter("division"));
		s1.setMobileno(request.getParameter("mobileno"));
		s1.setAddress(request.getParameter("address"));
		StandardStudents st= new StudentDAO();
		st.insertStudent(s1);
		PrintWriter out = response.getWriter();
		out.println("Student successfully added");
	}

}
