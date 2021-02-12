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
import javax.servlet.http.HttpSession;

/**
 *
 * @author Cuteepoo
 */
public class UserLogin2 extends HttpServlet {

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
            String pin=request.getParameter("pin");
            System.out.println(pin);
            String itemId=request.getParameter("itemId");
            String userEmail=request.getParameter("userEmail");
            String userPassword=request.getParameter("userPassword");
            try
            {
                Connection cn=new Connect().getConnection();
                PreparedStatement ps=cn.prepareStatement("select * from usertable where userEmail=? and userPassword=?");
                ps.setString(1, userEmail);
                ps.setString(2, userPassword);
                ResultSet rs=ps.executeQuery();
                if(rs.next())
                {
                    String s=rs.getString("userEmail");
                    
                    HttpSession session=request.getSession(true);
                    session.setAttribute("userEmail", s);
                    
                    out.println("<script type=\"text/javascript\">");
                    out.println("alert('Welcome')");
                    out.println("window.location.href='womens/singleProduct.jsp?itemId="+itemId+"&pin="+pin+"'");
                    out.println("</script>");
                }
                else
                {
                    out.println("<script type=\"text/javascript\">");
                    out.println("alert('Invalid Email and Password..')");
                    out.println("window.location.href='womens/userlogin2.jsp?itemId="+itemId+"'");
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
