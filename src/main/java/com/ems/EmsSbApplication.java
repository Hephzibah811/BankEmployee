package com.ems;
import java.util.Scanner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import com.ems.bean.Employee;
import com.ems.controller.EMSController;
import com.ems.dao.EmployeeDAO;
@SpringBootApplication
public class EmsSbApplication {
    static EmployeeDAO dao=new EmployeeDAO();
   public  Employee menu()
   {
       Scanner sc=new Scanner(System.in);
       System.out.println("Enter Id, firstName, lastName, role, logId, pwd");
      
       return new Employee(sc.nextInt(),sc.next(),sc.next(),sc.next(),sc.next(),sc.next());
   }
  
   public static void main(String[] args) {
       SpringApplication.run(EmsSbApplication.class, args);
      
       EmsSbApplication obj = new EmsSbApplication();
       Employee bean =obj.menu();
         
          
           EMSController control=new EMSController();
           control.performInsert(bean);
         
   }
}
