package pkgServletHM;

import java.io.*;

import javax.jws.WebParam;
import javax.servlet.*;
import javax.servlet.annotation.*;
import javax.servlet.http.*;

/*
import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
*/



@WebServlet(value = "/Practica2Servlet",initParams = { 
		   @WebInitParam(name = "foo", value = "Hello "), 
		   @WebInitParam(name = "bar", value = " World!"), 
		   @WebInitParam(name = "first_name", value = " ")
		   
		}) 
public class Practica2Servlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public Practica2Servlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.getWriter().append("El servidor esta en: ").append(request.getContextPath());
		
		 response.setContentType("text/html");   
	      PrintWriter out = response.getWriter();   
	      out.print("<html><body>");   
	      out.print("<h3>Hello Servlet</h3>");   
	      out.println(getInitParameter("foo")); 
	      out.println(getInitParameter("bar")); 
	      out.print("</body></html>");   
	      
	

	      PrintWriter out1 = response.getWriter();
	      String title = "Esto es una página de prueba.";
	      String docType =
	         "<!doctype html public \"-//w3c//dtd html 4.0 " +
	         "transitional//en\">\n";
	         
	      out1.println(docType +
	         "<html>\n" +
	            "<head><title>" + title + "</title></head>\n" +
	            "<body bgcolor = \"#f0f0f0\">\n" +
	               "<h1 align = \"center\">" + title + "</h1>\n" +
	               "<ul>\n" +
	                  "  <li> "
	                  + "Esto es un li" +
	                  "  <li> "
	                  + "Esto es un li"+
	               "</ul>\n" +
	            "</body>"+
	         "</html>"
	      );
	      
	      
	      

	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
