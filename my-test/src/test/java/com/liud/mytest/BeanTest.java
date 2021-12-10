package com.liud.mytest;

import com.liud.mytest.pojo.User;
import org.junit.jupiter.api.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @Author: liud
 * @Description: TODO
 * @Date: 2021/12/10 9:06
 */
public class BeanTest {
	@Test
	public void testUserBean() {
		ApplicationContext context = new ClassPathXmlApplicationContext("classpath*:application.xml");
		User user = context.getBean("user", User.class);

		System.out.println(user);
	}
}
