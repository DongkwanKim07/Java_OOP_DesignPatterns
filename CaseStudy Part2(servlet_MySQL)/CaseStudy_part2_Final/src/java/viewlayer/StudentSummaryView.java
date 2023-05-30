/* Assignment 2 demonstrates DAO design patterns with servlet implementation
 * Course: CST 8288
 * Section: 010
 * Author: Daniel Barboza and Dongkwan Kim based on Algonquin Collge staff code
 * Date: Aug 2022
 */
package viewlayer;

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import businesslayer.StudentBusinessLogic;
import businesslayer.CoursesBusinessLogic;

import transferobjects.StudentDTO;
import transferobjects.CourseDTO;
import java.util.List;
import transferobjects.CredentialsDTO;

/**
 * StudentSummaryView is our servlet view layer. It shows student or course summary
 * page depending on what parameters came from the user login page form.
 * for Student or Course summary pages.
 * @author Daniel Barboza and Dongkwan Kim
 */
public class StudentSummaryView extends HttpServlet {
    private CredentialsDTO creds=new CredentialsDTO();
    /**
     * Processes requests for both HTTP <code>GET</code> and <code>POST</code>
     * methods.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {

        String theChoice = request.getParameter("userType");
                
        response.setContentType("text/html;charset=UTF-8");
        try (PrintWriter out = response.getWriter()) {
        
        if (theChoice.equals("Students")) {    
            /* TODO output your page here. You may use following sample code. */
            out.println("<!DOCTYPE html>");
            out.println("<html>");
            out.println("<head>");
            out.println("<title>Student Summary View</title>");            
            out.println("</head>");
            out.println("<body>");
            out.println("<h1>Student Summary View at " + request.getContextPath() + "</h1>");
          
            creds.setUsername(request.getParameter("username"));
            creds.setPassword(request.getParameter("password"));
            
            StudentBusinessLogic logic = new StudentBusinessLogic(creds);
            List<StudentDTO> students = logic.getAllStudents();
            out.println("<table border=\"1\">");
            out.println("<tr>");
            out.println("<td>StudentID</td>");
            out.println("<td>First Name</td>");
            out.println("<td>Last Name</td>");
            out.println("</tr>");
            for(StudentDTO student : students){
                out.printf("<tr><td>%d</td><td>%s</td><td>%s</td></tr>",
                    student.getStudentID(), student.getFirstName(), student.getLastName());
            }
            out.println("</table>");
        }
         
        else {
            out.println("<!DOCTYPE html>");
            out.println("<html>");
            out.println("<head>");
            out.println("<title>Course Summary View</title>");            
            out.println("</head>");
            out.println("<body>");
            out.println("<h1>Course Summary View at " + request.getContextPath() + "</h1>");
            
            creds.setUsername(request.getParameter("username"));
            creds.setPassword(request.getParameter("password"));
            
            CoursesBusinessLogic courseLogic = new CoursesBusinessLogic(creds);
            
            List<CourseDTO> courses = courseLogic.getAllCourses();
           
            out.println("<table border=\"1\">");
            out.println("<tr>");
            out.println("<td>Course Code</td>");
            out.println("<td>Course Name</td>");
            out.println("<td>Course Description</td>");
            out.println("</tr>");
            for(CourseDTO course : courses){
                out.printf("<tr><td>%s</td><td>%s</td><td>%s</td></tr>",
                    course.getCourseCode(), course.getCourseName(), course.getCourseDescription());
            }
            out.println("</table>");
        }
            out.println("</body>");
            out.println("</html>");
        }

    }

    // <editor-fold defaultstate="collapsed" desc="HttpServlet methods. Click on the + sign on the left to edit the code.">
    /**
     * Handles the HTTP <code>GET</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

    /**
     * Handles the HTTP <code>POST</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

    /**
     * Returns a short description of the servlet.
     *
     * @return a String containing servlet description
     */
    @Override
    public String getServletInfo() {
        return "Short description";
    }// </editor-fold>

}
