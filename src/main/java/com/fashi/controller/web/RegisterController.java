package com.fashi.controller.web;

import java.io.IOException;
import java.sql.Timestamp;
import java.util.Calendar;

import javax.inject.Inject;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.fashi.model.UserModel;
import com.fashi.service.IUserService;
import com.fashi.utils.EncryptUtil;
import com.fashi.utils.SessionUtil;

@WebServlet(urlPatterns = "/dang-ky")
public class RegisterController extends HttpServlet{
	
	@Inject
	private IUserService userService;
	
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		RequestDispatcher rd = req.getRequestDispatcher("/views/web/register.jsp");
		rd.forward(req, resp);
	}
	
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		  req.setCharacterEncoding("UTF-8");
	        resp.setCharacterEncoding("UTF-8");
	        String fullname = req.getParameter("fullname");
	        String username = req.getParameter("username");
	        String password = req.getParameter("password");
	        String email = req.getParameter("email");
	        String phone = req.getParameter("phone");
	        String address = req.getParameter("address");
	        String gender = req.getParameter("gender");

	        UserModel tmp = userService.getUser(username);
	        if (tmp == null) {
	            UserModel user = new UserModel();
	            
	            password= EncryptUtil.encryptMD5(password);
	            
	            user.setFullname(fullname);
	            user.setUsername(username);
	            user.setPassword(password);
	            user.setEmail(email);
	            user.setAddress(address);
	            user.setPhone(phone);
	            user.setGender(gender);
	            user.setStatus(1);
	            user.setGroupId(1); 
	            user.setDateRegister(new Timestamp(Calendar.getInstance().getTimeInMillis()));
	            
	            if ((user = userService.register(user)) != null) {
	            	  SessionUtil.getInstance().putValue(req, "USERMODEL", user);
	            	   resp.sendRedirect(req.getContextPath() + "/trang-chu");
				} else {
					 req.getRequestDispatcher("/views/web/register.jsp").forward(req,resp);
				}
	           
	            	 
	                     
	         
	        } else {
	            req.setAttribute("fullname",fullname);
	            req.setAttribute("email",email);
	            req.setAttribute("address",address);
	            req.setAttribute("phone",phone);
	            req.setAttribute("gender",gender);
	            req.setAttribute("uname-err", "Tên tài khoản đã tồn tại");
	            req.getRequestDispatcher("/views/web/register.jsp").forward(req,resp);
	        }
	}
}
