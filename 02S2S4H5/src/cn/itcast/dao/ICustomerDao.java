package cn.itcast.dao;

import cn.itcast.domain.CstCustomer;

/**
 * 客户实体类操作的持久层接口
 * @author zhy
 *
 */
public interface ICustomerDao {

	/**
	 * 保存客户
	 * @param cusotmer
	 */
	void saveCustomer(CstCustomer cusotmer);
	
	/**
	 * 根据id查询客户信息
	 * @param custId
	 * @return
	 */
	CstCustomer findCustomerById(Long custId);
}
