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
public class Order extends HttpServlet {

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
            String state=request.getParameter("state");
            System.out.println(state);
            String city=request.getParameter("city");
            System.out.println(city);
            String pin=request.getParameter("pin");
            System.out.println(pin);
            
            String status="Pending";
            System.out.println(status);
           
           
            int total=0;
            String otp="";
           
            
              for(int i=1;i<=4;i++)
                       {
                        otp=otp+(int)(Math.random()*10); 
                       }
             String pid="" + otp;
             System.out.println(pid);
             
            String Body = "<h2>Details Of Your Order</h2><br><table border=\"2\" width=\"6\" cellspacing=\"4\" cellpadding=\"4\"><thead style=\"color:#003366;font-family:Helvetica;background-color:cornsilk;\"><tr><td>Order Id</td><td>Name</td><td>Email</td><td>Address</td><td>Product Name</td><td>quantity</td><td>Price</td><td>Discount</td><td>Discount Price</td><td>Final Price</td></tr></thead><tbody>";
            
            try
            {
                
                Connection cn=new Connect().getConnection();
                PreparedStatement ps=cn.prepareStatement("select * from cart where userEmail=?");
                ps.setString(1, userEmail);
                ResultSet rs=ps.executeQuery();
                while(rs.next())
                {
                       System.out.println("Before adding order");
                       int price=Integer.parseInt(rs.getString("itemPrice"));
                       System.out.println(price);
                       int discount=Integer.parseInt(rs.getString("discount"));
                       System.out.println(discount);
                       int a=price*discount/100;
                       int totalPrice=price-a;
                       System.out.println(totalPrice);
                                                            
                       int qt=Integer.parseInt(rs.getString("itemQuantity"));
                       System.out.println(qt);
                       int finalPrice=totalPrice*qt;
                       total=total+finalPrice;
                      System.out.println(total);
                        
                        
                        
                        PreparedStatement ps1=cn.prepareStatement("insert into order1(itemId,itemName,userName,userEmail,userMobile,address,country,state,city,pin,price,discount,itemQuantity,discountedPrice,finalPrice,total,status,otp,date) values(?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,CURDATE())");
                        ps1.setString(1, rs.getString("itemId"));
                        ps1.setString(2, rs.getString("itemName"));
                        ps1.setString(3, userName);
                        ps1.setString(4, userEmail);
                        ps1.setString(5, userMobile);
                        ps1.setString(6, address);
                        ps1.setString(7, country);
                        ps1.setString(8, state);
                        ps1.setString(9, city);
                        ps1.setString(10, pin);
                        ps1.setInt(11, price);
                        ps1.setInt(12, discount);
                       
                        ps1.setInt(13, qt);
                        ps1.setInt(14, totalPrice);
                        ps1.setInt(15, finalPrice);
                        ps1.setInt(16, total);
                        ps1.setString(17, status);
                        ps1.setString(18, pid);
                       
                       
                        ps1.executeUpdate();
                        
                        PreparedStatement ps2 = cn.prepareStatement("delete from cart where userEmail=?");
                        ps2.setString(1, userEmail);
                        ps2.executeUpdate();
                }
                System.out.println("After Adding Order");
                PreparedStatement ps3 = cn.prepareStatement("select * from order1 where userEmail=? and otp=?");
                ps3.setString(1, userEmail);
                ps3.setString(2, pid);
                ResultSet rs3 = ps3.executeQuery();
                
                while (rs3.next()) 
                {
                    
                    Body = Body + "<tr><td>" + pid + "</td><td>" + rs3.getString("userName") + "</td><td>" + rs3.getString("userEmail") + "</td><td>" + rs3.getString("address") + "</td><td>" + rs3.getString("itemName") + "</td><td>" + rs3.getString("itemQuantity") + "</td><td>" + rs3.getString("price") + "</td><td>"+ rs3.getString("discount") +"%"+ "</td><td>"+ rs3.getString("discountedPrice") + "</td><td>"+ rs3.getString("finalPrice")+"</td></tr>";
                    System.out.println(Body);
                    out.println("<script type=\"text/javascript\">");

                    out.println("location='womens/invoice.jsp?orderId=" + pid + "'");
                    out.println("</script>");
                }
                System.out.println("After Order");
                String subject = "Your Order " + pid + " Has Been Confirmed";
                Mailerr.send(userEmail, subject, Body);
                String EmailRet = null;
                PreparedStatement p1 = cn.prepareStatement("select * from admintable");
                ResultSet rs0 = p1.executeQuery();

                
                if (rs0.next()) 
                {
                    
                    EmailRet = rs0.getString("email");

                }
                String subject12 = "New Order " + pid + "";
                Mailerr.send(EmailRet, subject12, Body);

                out.println("<script type=\"text/javascript\">");

                out.println("window.location.href='womens/invoice.jsp?orderId=" + pid + "'");
                out.println("</script>");
                        
                    
                
               
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
