package com.servelet;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.Dao.*;
import com.model.Customer;
/**
 * Servlet implementation class logdata
 */
@WebServlet("/logdata")
public class logdata extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public logdata() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.getWriter().append("Served at: ").append(request.getContextPath());
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
		try {
			 String destPage="index.jsp";
			CustomerDao customerDoa=new CustomerDao();
			Customer customer=customerDoa.checkLogin(request.getParameter("userName"), request.getParameter("password"));
			if(customer!=null) {
				 HttpSession session = request.getSession();
				 session.setAttribute("customer", customer); 
				destPage = "home.jsp";
			}
			else {
				String message = "Invalid email/password";
                request.setAttribute("message", message);
			}
			
			 RequestDispatcher dispatcher = 
	            		request.getRequestDispatcher(destPage);
	            dispatcher.forward(request, response);
	        
		}
		catch(Exception e) {
			e.printStackTrace();
		}
	}

}
