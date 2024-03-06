package servlet;

import java.io.IOException;
import java.util.concurrent.CopyOnWriteArrayList;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.fasterxml.jackson.databind.ObjectMapper;

import beans.Home;

@WebServlet(name="home-servlet", urlPatterns = "/homes")
public class HomeServlet extends HttpServlet{
    
	private CopyOnWriteArrayList<Home> homeList = new CopyOnWriteArrayList<>();  // copyonwrite makes thread safe
	
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		ObjectMapper mapper = new ObjectMapper(); // object mapper can convert json to java object and vice versa
		String json = mapper.writeValueAsString(homeList);
		resp.getWriter().print(json);
		resp.setContentType("application/json");
	}
	
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
	    ObjectMapper mapper = new ObjectMapper(); // ObjectMapper allows to read an input stream and store it inside of an object
	    Home home = mapper.readValue(req.getInputStream(), Home.class);
	    homeList.add(home);
	    resp.setStatus(201);
	    System.out.print("CREATED HOME!");
	}
}

/*
 *  Links: 
 *  HttpServletRequest:  https://docs.oracle.com/javaee/6/api/javax/servlet/http/HttpServletRequest.html
 *  HttpServletResponse: https://docs.oracle.com/javaee/6/api/javax/servlet/http/HttpServletResponse.html
 *  ServletRequest:      https://docs.oracle.com/javaee/6/api/javax/servlet/ServletRequest.html
 *  ServletResponse:     https://docs.oracle.com/javaee/6/api/javax/servlet/ServletResponse.html
 * 
 *  Jackson has been known as "the Java JSON library" or "the best JSON parser for Java". 
 *  Or simply as "JSON for Java"
 *  Link: https://github.com/FasterXML/jackson
 */