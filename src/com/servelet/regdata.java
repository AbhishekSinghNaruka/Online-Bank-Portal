package com.servelet;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.Dao.CustomerDao;
import com.model.Customer;

/**
 * Servlet implementation class regdata
 */
@WebServlet("/regdata")
public class regdata extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public regdata() {
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

		CustomerDao customerDao = new CustomerDao();
		Customer customer = new Customer();
		customer.setName(request.getParameter("name"));
		customer.setUname(request.getParameter("uname"));
		customer.setLoginPass(request.getParameter("loginPass"));
		customer.acc.setTransictionPassword(Integer.parseInt(request.getParameter("pin")));
		
		if(customerDao.checkUniqueUserName(customer.getUname())){
			customerDao.addCustomer(customer);
			 RequestDispatcher dispatcher = request.getRequestDispatcher("index.jsp");
	         dispatcher.forward(request, response);
		}
		else {
			String message="this user name already exist";
			request.setAttribute("message", message);
			RequestDispatcher dispatcher = request.getRequestDispatcher("register.jsp");
	         dispatcher.forward(request, response);
		}
		
	}

}
