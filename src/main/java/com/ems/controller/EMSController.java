package com.ems.controller;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RestController;
import com.ems.bean.Employee;
import com.ems.dao.EmployeeDAO;
@RestController
public class EMSController {
	@Autowired
	EmployeeDAO dao;
	
	public void performInsert(Employee bean)
	{
		dao.insert(bean);
		System.out.println("Inserted");
		List <Employee> list=dao.view();
		System.out.println(list);
	}
}
