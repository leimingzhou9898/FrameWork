package cn.itcast.service;

import cn.itcast.domain.CstCustomer;

/**
 * 客户管理模块业务层接口
 * @author zhy
 *
 */
public interface ICustomerManagementService {
	
	/**
	 * 保存客户信息
	 * @param customer
	 */
	void saveCustomer(CstCustomer customer);
	
	/**
	 * 根据id查询客户信息
	 * @param custId
	 * @return
	 */
	CstCustomer findCustomerById(Long custId);
}
