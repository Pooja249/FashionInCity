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
 * @author Cuteepoo_pc
 */
@MultipartConfig(
fileSizeThreshold = 1024*1024*2, 
maxFileSize = 1024*1024*10,
maxRequestSize = 1024*1024*50)
public class UserRegistration extends HttpServlet {
    private final String filepath="E:\\NetBeansProjects\\fashion\\web\\womens\\images";
    
    private String extractFileName(Part part) {
        String contentDisp = part.getHeader("content-disposition");
        String[] items = contentDisp.split(";");
        for (String s : items) {
            if (s.trim().startsWith("filename")) {
                return s.substring(s.indexOf("=") + 2, s.length()-1);
            }
        }
        return "";
    }

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
            int flag=1;
            String userName=request.getParameter("userName");
            out.println(userName);
            String userEmail=request.getParameter("userEmail");
            out.println(userEmail);
            String userPassword=request.getParameter("userPassword");
            out.println(userPassword);
            String userMobile=request.getParameter("userMobile");
            out.println(userMobile);
            Part filepart=request.getPart("userImage");
              
            String photo;
              File file=new File(filepath);
                String fileName=extractFileName(filepart);
                fileName=new File(fileName).getName();
                filepart.write(filepath + File.separator + fileName);
            try
            {
                
               
                Connection cn=new Connect().getConnection();
                PreparedStatement ps=cn.prepareStatement("select userEmail from usertable where userEmail=?");
                ps.setString(1, userEmail);
                ResultSet rs=ps.executeQuery();
                if(rs.next())
                {
                    if(rs.getString("userEmail").equals(userEmail))
                    {
                        out.println("<script type=\"text/javascript\">");
                    out.println("alert('Email Already Exists.')");
                    out.println("window.location.href='womens/userlogin.jsp'");
                    out.println("</script>");
                    }
                }
                else if(flag==1)
                {                                                                                                                                                                                                                                                                                                                                          
                    PreparedStatement ps1=cn.prepareStatement("insert into usertable(userName,userEmail,userPassword,userMobile,userImage) values(?,?,?,?,?)");
                    ps1.setString(1, userName);
                    ps1.setString(2, userEmail);
                    ps1.setString(3, userPassword);
                    ps1.setString(4, userMobile);
                    ps1.setString(5, fileName);
                    
                    int i=ps1.executeUpdate();
                    if(i>0)
                    {
                        out.println("<script type=\"text/javascript\">");
                    out.println("alert('Registered Successfully.')");
                    out.println("window.location.href='womens/userlogin.jsp'");
                    out.println("</script>");
                    }
                    else
                    {
                        out.println("<script type=\"text/javascript\">");
                    out.println("alert('Some Error.')");
                    out.println("window.location.href='womens/userLogin.jsp'");
                    out.println("</script>");
                    }
                }
                
                
            }catch(Exception e)
            {
                
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
