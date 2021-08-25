package com.fashi.controller.web;

import java.io.IOException;
import java.util.List;

import javax.inject.Inject;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.fashi.model.Product;
import com.fashi.service.ISearchService;

@WebServlet(urlPatterns = "/tim-kiem")
public class SearchController extends HttpServlet{
	
	@Inject
	private ISearchService searchService;
	
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		String filter = req.getParameter("filter");
		String keyword = req.getParameter("keyword");
		
		List<Product> list = searchService.search(filter, keyword);
		
		req.setAttribute("listProduct", list);
		
		RequestDispatcher rd = req.getRequestDispatcher("/views/web/search_result.jsp");
		rd.forward(req, resp);
	}
}
