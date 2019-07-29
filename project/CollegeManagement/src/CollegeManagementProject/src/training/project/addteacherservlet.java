package CollegeManagementProject.src.training.project;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class addteacherservlet
 */
@WebServlet("/addteacherservlet")
public class addteacherservlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
   
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		Teacher t1=new Teacher();
		t1.setTeacherName(request.getParameter("name"));
		t1.setTeacherAge(Integer.parseInt(request.getParameter("age")));
		t1.setTeacherSubject(request.getParameter("subject"));
		t1.setTeacherMobNo(request.getParameter("mob"));
		t1.setTeacherEmail(request.getParameter("email"));
		t1.setTeacherAddress(request.getParameter("address"));
		StandardsTeachers st= new TeacherDao();
		st.insertTeacher(t1);
		PrintWriter out = response.getWriter();
		out.println("Teacher successfully added");
		
	}

}
