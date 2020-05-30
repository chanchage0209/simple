//package servlet_examples;

import java.io.*;
import javax.servlet.*;
import javax.servlet.http.*;

public class HelloWorld extends HttpServlet {

	int count=0;
	
	public void doGet(HttpServletRequest req, HttpServletResponse res)
			                         throws ServletException, IOException {
		doPost(req, res);

	}

	public void doPost(HttpServletRequest req, HttpServletResponse res)
			                          throws ServletException, IOException {

		res.setContentType("text/html; charset=Big5");
		PrintWriter out = res.getWriter();
		int size = res.getBufferSize(); // returns 8192 or greater
		
		//避免快取
    //res.setHeader("Cache-Control","no-store"); //HTTP 1.1
  	//res.setHeader("Pragma","no-cache");        //HTTP 1.0
  	//res.setDateHeader ("Expires", 0);
  	
    // Record the default size, in the log
    log("The default buffer size is " + size);
    
<<<<<<< HEAD
		out.println("<p>");
=======
		log("i++");
>>>>>>> AA
		out.println("<HTML>");
		out.println("<HEAD><TITLE>Hello World</TITLE></HEAD>");
		out.println("<BODY>");
		out.println("<BIG>Hello World , 世界你好2 !</BIG>="+(++count));
		out.println("</BODY></HTML>");
	}
}