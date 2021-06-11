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
import com.fashi.service.IProductService;

@WebServlet(urlPatterns = "/shop")
public class ShopController extends HttpServlet{
	@Inject
	private IProductService productService;
	
	@Override
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		List<Product> list = productService.getAll();
		
		request.setAttribute("list", list);
		
		RequestDispatcher rd = request.getRequestDispatcher("/views/web/shop.jsp");
		rd.forward(request, response);
	
	}
}
