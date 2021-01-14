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
 * Servlet implementation class Withdraw
 */
@WebServlet("/Withdraw")
public class Withdraw extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public Withdraw() {
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
		HttpSession session = request.getSession();
		Customer customer= (Customer) session.getAttribute("customer");
		float amount=Float.parseFloat(request.getParameter("amount"));
		CustomerDao customerDao=new CustomerDao();
		String message=null;
		int ID=customer.acc.getId();

		if(customer.acc.getTransictionPassword()==Integer.parseInt(request.getParameter("pin"))) {
			if(customerDao.getBalance(ID)>=amount) {
				customerDao.changeBalance((float) (customerDao.getBalance(ID)-amount), ID);
				message=amount+" is deducted from your account";
			}
			else
				message="Insuffecient Balance";
		}
		else
			message="wrong transiction pin";
		
		
		request.setAttribute("message", message);
		 RequestDispatcher dispatcher = request.getRequestDispatcher("home.jsp");
         dispatcher.forward(request, response);
     
	}

}
