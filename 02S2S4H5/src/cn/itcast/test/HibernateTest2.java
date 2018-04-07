package cn.itcast.test;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import cn.itcast.domain.CstCustomer;
import cn.itcast.service.ICustomerManagementService;

/**
 * Spring整合Junit单元测试
 * 需要拷贝：
 * 	spring-test-xxxx.jar
 * 就两步：
 * 	1、替换单元测试运行器。让其知道有spring的存在
 *  2、指定spring配置文件的位置
 * @author zhy
 *
 */
@RunWith(SpringJUnit4ClassRunner.class)//用于指定最终执行测试的main函数。就是junit的运行器。
@ContextConfiguration(locations={"classpath:config/spring/applicationContext.xml"})//指定spring的配置文件所在位置。
public class HibernateTest2 {
	
	@Autowired
	private ICustomerManagementService cmService;
	
	/**
	 * 通过调用业务层来实现测试业务层和持久层可用
	 */
	@Test
	public void testFind(){
		CstCustomer customer = cmService.findCustomerById(1L);
		System.out.println(customer);
	}
}
