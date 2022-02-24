package com.ust;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.Resource;

public class Tester {
	public static void main(String[] args) {
	Resource r=new ClassPathResource("Bean.xml");
	BeanFactory b=new XmlBeanFactory(r);
	Employee e=(Employee) b.getBean("empbean");
	e.display_name();
}
}
