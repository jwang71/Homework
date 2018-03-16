

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.json.JSONException;
import org.json.JSONObject;

/**
 * Servlet implementation class SearchApi
 */
@WebServlet("/SearchApi")
public class SearchApi extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public SearchApi() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
    //Given a key word return json type results
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		//response.getWriter().append("Served at: ").append(request.getContextPath());
//		response.setContentType("application/json");
//	  	 response.addHeader("Access-Control-Allow-Origin", "*");
//	  	 String username = "";
//	  	 if (request.getParameter("username") != null) {
//	  		 username = request.getParameter("username");
//	  	 }
//	  	 JSONObject obj = new JSONObject();
//	  	 try {
//	  		 obj.append("username", username);
//	  	 } catch (JSONException e) {
//	  		 // TODO Auto-generated catch block
//	  		 e.printStackTrace();
//	  	 }
//	  	 PrintWriter out = response.getWriter();
//	  	 out.print(obj);
//	  	 out.flush();
//	  	 out.close();
		
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	// Use Gateway to upload data
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		//doGet(request, response);
	}

}
