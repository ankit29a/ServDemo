

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/Add")
public class Add extends HttpServlet {
	private static final long serialVersionUID = 102831973239L;
       public void doPost(HttpServletRequest req, HttpServletResponse res) throws IOException {
    	   
    	   int i = Integer.parseInt(req.getParameter("t1"));
    	   int j = Integer.parseInt(req.getParameter("t2"));
    	   
    	   int k = i + j;
    	   
    	   PrintWriter out = res.getWriter();
    	   out.println(k);

       }
}
