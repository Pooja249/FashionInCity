/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Connection;

import static java.lang.System.out;
import java.sql.Connection;
import java.sql.DriverManager;

/**
 *
 * @author Cuteepoo_pc
 */
public class Connect {
    Connection cn=null;
    public Connection getConnection()
    {
        try
        {
            Class.forName("com.mysql.jdbc.Driver");
            cn=DriverManager.getConnection("jdbc:mysql://localhost:3306/demoproject","root","newroot");
            
        }catch(Exception e)
        {
           out.println("error"+e); 
        }return cn;
    }
}

