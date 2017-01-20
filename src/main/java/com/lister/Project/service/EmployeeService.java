package com.lister.Project.service;

import java.util.List;



import org.springframework.beans.factory.BeanFactory;  
import org.springframework.beans.factory.xml.XmlBeanFactory;  
import org.springframework.core.io.ClassPathResource;  
import org.springframework.core.io.Resource;

import com.lister.Project.dao.EmployeeDao;
import com.lister.Project.domain.Employee;

public class EmployeeService {
	EmployeeDao empdao;
	Resource r;
	BeanFactory factory;
	//AnnotationConfiguration configuration;
	public EmployeeService(){
		r=new ClassPathResource("DefaultServlet-servlet.xml");  
	    factory=new XmlBeanFactory(r);  
	    empdao=(EmployeeDao)factory.getBean("d");
	    //configuration.configure("DefaultServlet-servlet.xml");
	}
	public void addemployee(Employee emp){
		empdao.saveEmployee(emp);
	}
	public void removeEmployeeByID(int id){
		empdao.deleteEmployee(empdao.getById(id));
	}
	public List<Employee> getEmployeeList(){
	    return empdao.getEmployees();
	}
	public List<Employee> getEmployeeList(String name){
	    return empdao.getEmployeeByName(name);
	}
}
