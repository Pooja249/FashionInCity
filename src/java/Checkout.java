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
public class Checkout extends HttpServlet {

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
            System.out.println(userName);
            String userEmail=request.getParameter("userEmail");
            System.out.println(userEmail);
            String userMobile=request.getParameter("userMobile");
            System.out.println(userMobile);
            String address=request.getParameter("address");
            System.out.println(address);
            String country=request.getParameter("country");
            System.out.println(country);
            String city=request.getParameter("city");
            System.out.println(city);
            String state=request.getParameter("state");
            System.out.println(state);
            String pin=request.getParameter("pin");
            System.out.println(pin);
            
            try
            {
                Connection cn=new Connect().getConnection();
                PreparedStatement ps=cn.prepareStatement("insert into checkout(userName,userEmail,userMobile,address,country,city,state,pin) values(?,?,?,?,?,?,?,?)");
                ps.setString(1, userName);
                ps.setString(2, userEmail);
                ps.setString(3, userMobile);
                ps.setString(4, address);
                ps.setString(5, country);
                ps.setString(6, city);
                ps.setString(7, state);
                ps.setString(8, pin);
                
                int i=ps.executeUpdate();
                if(i>0)
                {
                    out.println("<script type=\"text/javascript\">");
                    out.println("alert('Details Added Successfully!!')");
                    out.println("window.location.href='womens/order.jsp'");
                    out.println("</script>");
                }
                else
                {
                    out.println("<script type=\"text/javascript\">");
                    out.println("alert('Some Error Occurs... Try Again!!')");
                    out.println("window.location.href='womens/checkout.jsp'");
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
