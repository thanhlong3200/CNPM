package com.fashi.controller.web;

import java.io.IOException;

import javax.inject.Inject;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.fashi.model.Product;
import com.fashi.service.IProductService;

@WebServlet(urlPatterns = "/chi-tiet-san-pham")
public class ProductController extends HttpServlet{
	@Inject
	private IProductService productService;
	
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		Integer id = Integer.parseInt(req.getParameter("id"));
		
		Product product = productService.getDetails(id);
		
		req.setAttribute("product", product);
		RequestDispatcher rd = req.getRequestDispatcher("/views/web/product-details.jsp");
		rd.forward(req, resp);
	}
}
