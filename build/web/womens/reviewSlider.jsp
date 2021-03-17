<%@page import="java.sql.ResultSet"%>
<%@page import="java.sql.PreparedStatement"%>
<%@page import="Connection.Connect"%>
<%@page import="java.sql.Connection"%>
<%@page import="java.sql.Connection"%>
<!DOCTYPE html>
<html lang="en">
<head>
	<meta charset="UTF-8">
	<title>Carousel de testimonios</title>
	
        <script src="sss/sss.min.js" type="text/javascript"></script>
	<script src="http://ajax.googleapis.com/ajax/libs/jquery/2.2.4/jquery.min.js"></script>
        <script src="sss/sss.js" type="text/javascript"></script>
        <link href="sss/sss.css" rel="stylesheet" type="text/css"/>
        <link href="sss/estilos.css" rel="stylesheet" type="text/css"/>
	<script>
                    
	    jQuery(function($){
	        $('.slider-testimonial').sss({
	        	slideShow : true,
	        	speed : 4000
	        });
	    });
	</script>
	
</head>
<body>
                     
	<div class="wrapper">
           
                <div class="slider-testimonial">
                     <%
                        Connection cn=new Connect().getConnection();
                        PreparedStatement ps=cn.prepareStatement("select * from usertable inner join reviewtable on usertable.userName=reviewtable.userName");
                        ResultSet rs=ps.executeQuery();
                        while(rs.next())
                        {
                        
                    %>
                     <div class="testimonial-item">
                                
                    		<div class="testimonial-client">
					<img src="images/<%=rs.getString("userImage")%>" alt="">
					<p class="client-name" style="color: #535353;font-size:30px;"><%=rs.getString("userName")%></p>
				</div>
                                
				<div class="testimonial-text" style="color: #535353">
					<p><%=rs.getString("review")%></p>
				</div>
                               
			</div>
                                 
			  <%
                    }
                %>
		</div>
                              
                
               
	</div>
                                 
</body>
</html>
