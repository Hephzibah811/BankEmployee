package com.ems.dao;
import java.util.ArrayList;
import java.util.List;
import org.springframework.stereotype.Repository;
import com.ems.bean.Employee;
@Repository
public class EmployeeDAO {
static List<Employee> list;
    
    public static boolean insert(Employee bean)
    {
        list=new ArrayList<Employee>();
        
        list.add(bean);
        return true;
        
    }
    
    public static  List<Employee> view()
    {
        return list;
    }
}
