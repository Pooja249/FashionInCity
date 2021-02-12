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
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author Angel_pc
 */
public class Review extends HttpServlet {

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
            String userName=request.getParameter("userName");
            String userEmail=request.getParameter("userEmail");
            String userImage=request.getParameter("userImage");
            String rating=request.getParameter("selected_rating");
            String review=request.getParameter("review");
            try
            {
                Connection cn=new Connect().getConnection();
                PreparedStatement ps=cn.prepareStatement("insert into reviewtable(userName,userEmail,userImage,rating,review) values(?,?,?,?,?)");
                ps.setString(1, userName);
                ps.setString(2, userEmail);
                ps.setString(3, userImage);
                ps.setString(4, rating);
                ps.setString(5, review);
                int i=ps.executeUpdate();
                if(i>0)
                {
                    out.println("<script type=\"text/javascript\">");
                     out.println("alert('Your Feedback is Added!!')");
                     out.println("window.location.href='womens/home.jsp'");
                     out.println("</script>");
                }
                else
                {
                    out.println("<script type=\"text/javascript\">");
                     out.println("alert('Error.....!!')");
                     out.println("window.location.href='womens/review.jsp'");
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
