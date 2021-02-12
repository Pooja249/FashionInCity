/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import Connection.Connect;
import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author Cuteepoo_pc
 */
public class ChangePassword extends HttpServlet {

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
        response.setContentType("text/html;charset=UTF-8");
        try (PrintWriter out = response.getWriter()) {
            /* TODO output your page here. You may use following sample code. */
            String adminId=request.getParameter("adminId");
            String email=request.getParameter("email");
           
            String password=request.getParameter("password");
           
            String newpassword=request.getParameter("newpassword");
            
                if(password.equals(newpassword))
                {
                    
                     out.println("<script type=\"text/javascript\">");
                        out.println("alert('New Password is same as old Password.....Please Try again!!')");
                        out.println("window.location.href='admin/change_Password.jsp'");
                        out.println("</script>");
                }
                try
                {
                    Connection cn=new Connect().getConnection();
                    PreparedStatement ps=cn.prepareStatement("select * from admintable where email=? and password=?");
                    ps.setString(1, email);
                    ps.setString(2, password);
                    ResultSet rs=ps.executeQuery();
                    if(rs.next())
                    {
                        if(rs.getString("email").equals(email) && rs.getString("password").equals(password))
                        {
                            PreparedStatement ps1=cn.prepareStatement("update admintable set password=? where email=?");
                            ps1.setString(1, newpassword);
                            ps1.setString(2, email);
                            int i=ps1.executeUpdate();
                            if(i>0)
                            {
                                out.println("<script type=\"text/javascript\">");
                                out.println("alert('Password Updated Successfully!!')");
                               out.println("window.location.href='admin/Logout.jsp'");
                               out.println("</script>");
                            }
                        }
                            else
                            {
                                out.println("<script type=\"text/javascript\">");
                                out.println("alert('Error!!')");
                               out.println("window.location.href='admin/change_Password.jsp'");
                               out.println("</script>");
                            }
                        
                    }
                    
                
            }catch(Exception e)
            {
                out.println(e);
            }
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
