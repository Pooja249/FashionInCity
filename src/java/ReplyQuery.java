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
 * @author Angel_pc
 */
public class ReplyQuery extends HttpServlet {

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
           
            String userEmail=request.getParameter("userEmail");
            System.out.println(userEmail);
            String inbox=request.getParameter("inbox");
            System.out.println(inbox);
            String querystatus="Replied";
            System.out.println(querystatus);
            
            try
            {
                Connection cn=new Connect().getConnection();
                PreparedStatement ps=cn.prepareStatement("select * from contact where userEmail=?");
                ps.setString(1, userEmail);
                ResultSet rs=ps.executeQuery();
                if(rs.next())
                {
                    PreparedStatement ps1=cn.prepareStatement("insert into querytable(userName,inbox,queryStatus) values(?,?,?)");
                    ps1.setString(1, rs.getString("userName"));
                    ps1.setString(2, inbox);
                    ps1.setString(3, querystatus);
                    int i=ps1.executeUpdate();
                    if(i>0)
                    {
                        String subject="Reply to Your Query";
                        Mailerr.send(userEmail, subject, inbox);
                        String email = null;
                        PreparedStatement p1 = cn.prepareStatement("select * from admintable");
                        ResultSet rs0 = p1.executeQuery();
                        if(rs0.next())
                        {
                            email=rs0.getString("email");
                        }
                        String subject1 = "Replied Query";
                        Mailerr.send(email, subject1, inbox);

                        out.println("<script type=\"text/javascript\">");

                        out.println("window.location.href='admin/dashboard.jsp'");
                        out.println("</script>");
                        
                        System.out.println("replied");
                        
                    String contactId=request.getParameter("contactId");   
                   
                   
                    PreparedStatement ps2=cn.prepareStatement("update contact set status='inactive' where contactId=?");
                
                   
                    ps2.setString(1, contactId);
                    ps2.executeUpdate();
                    }
                    
                    
                }
                else
                {
                    out.println("<script type=\"text/javascript\">");
                     out.println("alert('Message not Send...Try Again.!!')");
                     out.println("window.location.href='admin/ReplyQuery.jsp'");
                     out.println("</script>");
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
