import java.io.IOException;
import java.io.PrintWriter;
import java.sql.*;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


public class Add_Job_Servlet extends HttpServlet {
  
    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        try (PrintWriter out = response.getWriter()) {
            /* TODO output your page here. You may use following sample code. */
           
             String jo_desp=request.getParameter("desp"); 
                String company_nam=request.getParameter("company_name"); 
                String job_locatio=request.getParameter("job_location"); 
                String exp=request.getParameter("exp_reqd"); 
                String sal=request.getParameter("salary");
                String deadlin=request.getParameter("deadline");
                String link=request.getParameter("link_apply");
             int exp_reqd=Integer.parseInt(exp);  
            int salary=Integer.parseInt(sal);
            out.println(salary);
             Class.forName("org.apache.derby.jdbc.ClientDriver");
            Connection conn=DriverManager.getConnection("jdbc:derby://localhost:1527/bvdata");
            out.println("anubhi3");
               
                 out.println("anubhi2");
           
            PreparedStatement pst2 = conn.prepareStatement("select JOB_ID from JOB order by JOB_ID desc") ; 
            ResultSet rst2 = pst2.executeQuery();
            int id = 1;
            out.println(id);
            if(rst2.next()==true) 
            {    
                id = rst2.getInt(1);
                id++;

            } //auto-generated id
            out.println(company_nam);
            
            pst2 = conn.prepareStatement("insert into JOB values (?,?,?,?,?,?,?,?)");
            pst2.setInt(1, id);
            pst2.setString(2, jo_desp);  
            pst2.setString(3, company_nam);
            pst2.setString(4, job_locatio);
            pst2.setInt(5, exp_reqd);
            pst2.setInt(6, salary);
            pst2.setString(7, deadlin);
            pst2.setString(8, link);
            int x=pst2.executeUpdate();        
            if(x>0)  
            {
               
                out.println("<script type='text/javascript'> ");
                out.println("alert('Saved and Posted Successfully!')"); 
                out.println(" window.location.href = 'admin.jsp'");
                out.println("</script>");

            }
            else
            {
                out.println("<script type='text/javascript'> ");
                out.println("alert('Kindly Try again!')"); 
                out.println(" window.location.href = 'admin.jsp'");
                out.println("</script>");
            }

            conn.close();
    }
    catch(Exception ex)
    {
        ex.printStackTrace();
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
        //processRequest(request, response);
         
    }

   
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
       // processRequest(request, response);
       
    
    }
}
