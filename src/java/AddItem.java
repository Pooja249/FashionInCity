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
public class AddItem extends HttpServlet {
    private final String filepath="E:\\NetBeansProjects\\fashionInCity\\web\\admin\\images";

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
             Connection cn=new Connect().getConnection();
            String categoryName=request.getParameter("categoryName");
           
            String subCategoryName=request.getParameter("state");
           
            String itemName=request.getParameter("itemName");
            String itemPrice=request.getParameter("itemPrice");  
            String stock=request.getParameter("stock");
            String discount=request.getParameter("discount");
            String featuredProduct=request.getParameter("featuredProduct");
            String itemDes=request.getParameter("itemDes");
            String itemStatus=request.getParameter("itemStatus");
            Part filepart=request.getPart("itemImage");
              String photo;
              File file=new File(filepath);
                String fileName=extractFileName(filepart);
                fileName=new File(fileName).getName();
                 filepart.write(filepath + File.separator + fileName);
            
            try{
                
                  
                   
                    PreparedStatement ps=cn.prepareStatement("insert into items(categoryId,subCategoryId,itemName,itemImage,itemPrice,stock,discount,featuredProduct,itemDes,itemStatus) values(?,?,?,?,?,?,?,?,?,?)");
                    ps.setString(1, categoryName);
                    ps.setString(2, subCategoryName);
                    ps.setString(3, itemName);
                    ps.setString(4, fileName);
                    ps.setString(5, itemPrice);
                    ps.setString(6, stock);
                    ps.setString(7, discount);
                    ps.setString(8, featuredProduct);
                    ps.setString(9, itemDes);
                    ps.setString(10, itemStatus);
                    int i=ps.executeUpdate();
                    if(i>0)
                    {
                        out.println("<script type=\"text/javascript\">");
                        out.println("alert('Item Added Successfully!!')");
                        out.println("window.location.href='admin/view_Item.jsp'");
                        out.println("</script>");
                    }
                    else
                    {
                        out.println("<script type=\"text/javascript\">");
                        out.println("alert('Error!!')");
                        out.println("window.location.href='admin/view_Item.jsp'");
                        out.println("</script>");
                    }
                
                
                
                
            }catch(Exception e)
            {
                out.println("error"+e);
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
