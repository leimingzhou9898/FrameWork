package cn.itcast.web.controller;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.web.context.support.WebApplicationContextUtils;

import cn.itcast.service.ICustomerManagementService;
import cn.itcast.service.impl.CustomerManagementServiceImpl;

/**
 * 模拟一个表现层。
 * 需要通过浏览器访问该Servlet
 */
public class CustomerServlet extends HttpServlet {
	
	private ICustomerManagementService cmService;
	

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		//ApplicationContext ac = new ClassPathXmlApplicationContext("bean.xml");//永远都是创建一个新的容器
		ApplicationContext ac = WebApplicationContextUtils.getWebApplicationContext(this.getServletContext());
		System.out.println(ac.toString());
		cmService = (ICustomerManagementService) ac.getBean("cmService");
		cmService.findCustomerById(1L);
		cmService.saveCustomer(null);
	}


	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doGet(request, response);
	}

}
