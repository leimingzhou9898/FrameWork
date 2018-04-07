package cn.itcast.dao.impl;



import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

import cn.itcast.dao.ICustomerDao;
import cn.itcast.domain.CstCustomer;
import cn.itcast.utils.HibernateUtil;
/**
 * 在Dao中定义了SessionFactory
 * 事务控制又回到了持久层。
 * 不能使用
 * @author zhy
 *
 */
public class CustomerDaoImpl implements ICustomerDao {

	private SessionFactory sessionFactory;
	
	public void setSessionFactory(SessionFactory sessionFactory) {
		this.sessionFactory = sessionFactory;
	}

	@Override
	public void saveCustomer(CstCustomer customer) {
		System.out.println("实现了保存客户");
		Session s = null;
		Transaction tx = null;
		try{
			s = sessionFactory.getCurrentSession();
			tx = s.beginTransaction();
			s.save(customer);
			tx.commit();
		}catch(Exception e){
			tx.rollback();
			throw new RuntimeException(e);
		}
	}

	@Override
	public CstCustomer findCustomerById(Long custId) {
		System.out.println("实现了查询客户");
		Session s = null;
		Transaction tx = null;
		try{
			s = sessionFactory.getCurrentSession();
			tx = s.beginTransaction();
			CstCustomer customer = s.get(CstCustomer.class, custId);
			tx.commit();
			return customer;
		}catch(Exception e){
			tx.rollback();
			throw new RuntimeException(e);
		}
	}
}
