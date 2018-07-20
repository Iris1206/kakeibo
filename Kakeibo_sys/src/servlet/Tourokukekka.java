package servlet;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import dao.KakeiboDAO;
import dto.KakeiboDTO;

/**
 * Servlet implementation class Tourokukekka
 */
@WebServlet("/Tourokukekka")
public class Tourokukekka extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#HttpServlet()
	 */
	public Tourokukekka() {
		super();
		// TODO Auto-generated constructor stub
	}

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		request.setCharacterEncoding("UTF-8");

		KakeiboDTO result = null;

		int id = Integer.parseInt(request.getParameter("id"));
		String naiyou = request.getParameter("naiyou");
		int money = Integer.parseInt(request.getParameter("money"));
		String hantei = request.getParameter("hantei");
		int month = Integer.parseInt(request.getParameter("month"));
		int day = Integer.parseInt(request.getParameter("day"));

		result = KakeiboDAO.touroku(id, naiyou, money, hantei, month, day);

		result = KakeiboDAO.syusi_disp(naiyou);
		request.setAttribute("tou", result);

		String view = "/WEB-INF/view/tourokuResult.jsp";
		RequestDispatcher dispatcher = request.getRequestDispatcher(view);
		dispatcher.forward(request, response);   //NullPointerException
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
