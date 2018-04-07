package cn.itcast.web.action;

import com.opensymphony.xwork2.ActionSupport;
import com.opensymphony.xwork2.ModelDriven;

import cn.itcast.domain.CstCustomer;
import cn.itcast.service.ICustomerManagementService;
import cn.itcast.service.impl.CustomerManagementServiceImpl;

/**
 * 客户操作的动作类
 * @author zhy
 *
 */
public class CustomerAction extends ActionSupport implements ModelDriven<CstCustomer> {

	private CstCustomer customer = new CstCustomer();
	

	private ICustomerManagementService cmService;
	
	
	public void setCmService(ICustomerManagementService cmService) {
		this.cmService = cmService;
	}

	@Override
	public CstCustomer getModel() {
		return customer;
	}
	
	/**
	 * 查询所有客户
	 * @return
	 */
	public String findCustomerById(){
		System.out.println("客户动作类中根据id查询客户的方法执行了。。。");
		CstCustomer customer = cmService.findCustomerById(1L);
		System.out.println(customer);
		return SUCCESS;
	}
}
