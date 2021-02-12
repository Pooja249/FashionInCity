/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import Connection.Connect;
import java.io.File;
import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import javax.servlet.ServletException;
import javax.servlet.annotation.MultipartConfig;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.Part;

/**
 *
 * @author Angel_pc
 */

public class Cart extends HttpServlet {
   
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
            String itemId=request.getParameter("itemId");
            out.println(itemId);
            String image=request.getParameter("itemImage");
            out.println(image);
            String itemQuantity=request.getParameter("qwe");
            System.out.println(itemQuantity);
            String itemName=request.getParameter("itemName");
            out.println(itemName);
            String itemPrice=request.getParameter("itemPrice");
            out.println(itemPrice);
            String discount=request.getParameter("discount");
            out.println(discount);
            String pin=request.getParameter("pin");
            System.out.println(pin);
            String userEmail=request.getParameter("userEmail");
            int a=Integer.parseInt(itemQuantity);
            
                
            try
            {
                
                
                Connection cn=new Connect().getConnection();
                PreparedStatement ps=cn.prepareStatement("select * from cart where itemId=? and userEmail=?");
                ps.setString(1, itemId);
                ps.setString(2, userEmail);
                ResultSet rs=ps.executeQuery();
                if(rs.next())
                {
                    if(rs.getString("itemId").equals(itemId))
                    {
                        int Quantity=Integer.parseInt(rs.getString("itemQuantity"));
                        
                        int q=Quantity+a;
                        
                       
                        if(Quantity>10)
                        {
                            out.println("<script type=\"text/javascript\">");
                            out.println("alert('Items Exceeded!!')");
                            out.println("window.location.href='womens/singleProduct.jsp?itemId="+itemId+"'");
                            out.println("</script>");
                        }
                        else if(Quantity<10)
                        {
                        PreparedStatement ps1=cn.prepareStatement("update cart set itemQuantity=? where itemId=?");
                        ps1.setInt(1, q);
                        ps1.setString(2, itemId);
                        int i=ps1.executeUpdate();
                        if(i>0)
                        {
                            out.println("<script type=\"text/javascript\">");
                            out.println("alert('Items added Successfully!!')");
                            out.println("window.location.href='womens/cart.jsp?itemId="+itemId+"'");
                            out.println("</script>");
                        }
                        }
                        
                    }
                }
                else
                {
                PreparedStatement ps2=cn.prepareStatement("insert into cart(itemImage,itemQuantity,itemName,itemPrice,discount,pin,itemId,userEmail,date) values(?,?,?,?,?,?,?,?,CURDATE())");
                ps2.setString(1, image);
                ps2.setString(2, itemQuantity);
                ps2.setString(3, itemName);
                ps2.setString(4, itemPrice);
                ps2.setString(5, discount);
                ps2.setString(6, pin);
                ps2.setString(7, itemId);
                ps2.setString(8, userEmail);
             
                int i=ps2.executeUpdate();
                if(i>0)
                {
                    out.println("<script type=\"text/javascript\">");
                out.println("alert('Items added Successfully!!')");
                out.println("window.location.href='womens/cart.jsp'");
                out.println("</script>");
                }
                else
                {
                    out.println("<script type=\"text/javascript\">");
                out.println("alert('Error!!')");
                out.println("window.location.href='womens/singleProduct.jsp?itemId="+itemId+"'");
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

    private String curdate() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

}
