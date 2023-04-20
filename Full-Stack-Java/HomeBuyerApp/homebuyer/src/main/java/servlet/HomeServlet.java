package servlet;

import java.io.IOException;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.fasterxml.jackson.databind.ObjectMapper;

import beans.Home;
import data.HomeDAO;

@WebServlet(name="home-servlet", urlPatterns = "/homes")
public class HomeServlet extends HttpServlet{
    
	private CopyOnWriteArrayList<Home> homeList = new CopyOnWriteArrayList<>();  // copyonwrite makes thread safe
	
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		List<Home> homeList = null;
		try(HomeDAO dao = new HomeDAO()){
			homeList = dao.findAll();
		} catch(Exception e) {
			e.printStackTrace();
		}
		ObjectMapper mapper = new ObjectMapper(); // object mapper can convert json to java object and vice versa
		String json = mapper.writeValueAsString(homeList);
		resp.getWriter().print(json);
		resp.setContentType("application/json");
	}
	
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
	    ObjectMapper mapper = new ObjectMapper(); // ObjectMapper allows to read an input stream and store it inside of an object
	    Home home = mapper.readValue(req.getInputStream(), Home.class);
	    try(HomeDAO dao = new HomeDAO()){
			dao.save(home);
		} catch(Exception e) {
			e.printStackTrace();
		}
	    resp.setStatus(201);
	    System.out.print("CREATED HOME!");
	}
}
