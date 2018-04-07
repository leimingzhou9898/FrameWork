package cn.itcast.dao.impl;



import org.hibernate.Session;
import org.hibernate.Transaction;
import org.springframework.orm.hibernate5.HibernateTemplate;
import org.springframework.orm.hibernate5.support.HibernateDaoSupport;

import cn.itcast.dao.ICustomerDao;
import cn.itcast.domain.CstCustomer;
/**
 * 使用Spring框架提供的一个工具类：HibernateTemplate
 * @author zhy
 *
 */
public class CustomerDaoImpl2 extends HibernateDaoSupport implements ICustomerDao {


	@Override
	public void saveCustomer(CstCustomer customer) {
		System.out.println("实现了保存客户");
		getHibernateTemplate().save(customer);
	}

	@Override
	public CstCustomer findCustomerById(Long custId) {
		System.out.println("实现了查询客户");
		return getHibernateTemplate().get(CstCustomer.class, custId);
	}
}
