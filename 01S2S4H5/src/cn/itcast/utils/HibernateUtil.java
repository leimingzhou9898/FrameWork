package cn.itcast.utils;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

/**
 * 用于获取Session对象
 * Session工厂应该只有一个
 * @author zhy
 *
 */
public class HibernateUtil {

	private static SessionFactory factory;
	
	static{
		try {
			Configuration cfg = new Configuration();
			cfg.configure();
			factory = cfg.buildSessionFactory();
		} catch (Exception e) {
			throw new ExceptionInInitializerError("初始化SessionFactory失败！");
		}
	}
	
	public static Session getCurrentSession(){
		return factory.getCurrentSession();
	}
	
	public static Session openSession(){
		return factory.openSession();
	}
	
	public static void main(String[] args) {
		Session s1 = getCurrentSession();
		Session s2 = getCurrentSession();
		System.out.println(s1 == s2);
	}
}
