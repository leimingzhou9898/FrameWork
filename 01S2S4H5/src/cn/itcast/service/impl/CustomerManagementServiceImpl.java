package cn.itcast.service.impl;

import org.hibernate.Session;
import org.hibernate.Transaction;

import cn.itcast.dao.ICustomerDao;
import cn.itcast.dao.impl.CustomerDaoImpl;
import cn.itcast.domain.CstCustomer;
import cn.itcast.service.ICustomerManagementService;
import cn.itcast.utils.HibernateUtil;
/**
 * 业务层具体实现类
 * @author zhy
 *
 */
public class CustomerManagementServiceImpl implements ICustomerManagementService {

	private ICustomerDao customerDao;
	
	public void setCustomerDao(ICustomerDao customerDao) {
		this.customerDao = customerDao;
	}

	@Override
	public void saveCustomer(CstCustomer customer) {
		customerDao.saveCustomer(customer);
	}

	@Override
	public CstCustomer findCustomerById(Long custId) {
		return customerDao.findCustomerById(custId);
	}

}
