package cn.itcast.dao.impl;



import org.hibernate.Session;
import org.hibernate.Transaction;
import org.springframework.orm.hibernate5.HibernateTemplate;

import cn.itcast.dao.ICustomerDao;
import cn.itcast.domain.CstCustomer;
/**
 * 使用Spring框架提供的一个工具类：HibernateTemplate
 * @author zhy
 *
 */
public class CustomerDaoImpl1 implements ICustomerDao {

	private HibernateTemplate hibernateTemplate;
	
	public void setHibernateTemplate(HibernateTemplate hibernateTemplate) {
		this.hibernateTemplate = hibernateTemplate;
	}

	@Override
	public void saveCustomer(CstCustomer customer) {
		System.out.println("实现了保存客户");
		hibernateTemplate.save(customer);
	}

	@Override
	public CstCustomer findCustomerById(Long custId) {
		System.out.println("实现了查询客户");
		return hibernateTemplate.get(CstCustomer.class, custId);
	}
}
