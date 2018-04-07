package cn.itcast.test;

import org.hibernate.Session;
import org.hibernate.Transaction;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import cn.itcast.domain.CstCustomer;
import cn.itcast.service.ICustomerManagementService;
import cn.itcast.utils.HibernateUtil;

/**
 * 测试Hiberante能独立运行
 * @author zhy
 *
 */
public class HibernateTest {
	
	/**
	 * 保证hibernate可以独立运行
	 */
	@Test
	public void testAdd(){
		CstCustomer c = new CstCustomer();
		c.setCustName("传智播客教育集团2");
		c.setCustSource("口口相传");
		c.setCustIndustry("IT教育培训");
		c.setCustLevel("VVIP");
		c.setCustAddress("北京市昌平区北七家镇不能明说");
		c.setCustPhone("400-618-9090");
		
		Session s = HibernateUtil.getCurrentSession();
		Transaction tx = s.beginTransaction();
		s.save(c);
		tx.commit();
	}
	
	
	/**
	 * 通过调用业务层来实现测试业务层和持久层可用
	 */
	@Test
	public void testFind(){
		//ICustomerManagementService cmService = new CustomerManagementServiceImpl();
		ApplicationContext ac = new ClassPathXmlApplicationContext("config/spring/applicationContext.xml");
		ICustomerManagementService cmService = (ICustomerManagementService) ac.getBean("cmService");
		CstCustomer customer = cmService.findCustomerById(1L);
		System.out.println(customer);
	}
}
