package com.servelet;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.Dao.CustomerDao;
import com.model.Customer;

/**
 * Servlet implementation class Edit
 */
@WebServlet("/Edit")
public class Edit extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public Edit() {
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
		CustomerDao customerDao=new CustomerDao();
		boolean changeUname=false;
		HttpSession session = request.getSession();
		Customer customer= (Customer) session.getAttribute("customer");
		
		if(customer.getUname().equals(request.getParameter("uname")) || customerDao.getID(request.getParameter("uname"))==customer.acc.getId() )
			changeUname=false;
		else
			changeUname=true;
		customer.setName(request.getParameter("name"));
		customer.setUname(request.getParameter("uname"));
		customer.setLoginPass(request.getParameter("pass"));
		
		session.removeAttribute("customer");
		session.setAttribute("customer", customer);
		
		
		if(changeUname) {
			if(customerDao.checkUniqueUserName(customer.getUname())) {
				
				customerDao.update(customer);
				RequestDispatcher dispatcher = request.getRequestDispatcher("home.jsp");
		        dispatcher.forward(request, response);
			}
			else {
				String message="this user name already exist";
				request.setAttribute("message", message);
				RequestDispatcher dispatcher = request.getRequestDispatcher("edit.jsp");
		         dispatcher.forward(request, response);
			}
		}
		else {
			customerDao.update(customer);
			RequestDispatcher dispatcher = request.getRequestDispatcher("home.jsp");
	        dispatcher.forward(request, response);
		}
		
		
	}

}
