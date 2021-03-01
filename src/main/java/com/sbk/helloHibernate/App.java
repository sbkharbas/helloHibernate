package com.sbk.helloHibernate;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import com.sbk.model.Employee;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        Employee employee = new Employee();
        employee.setName("Suraj");
        employee.setEmployeeId("12118");
        employee.setDepartment("Tech");
        
        Configuration cf = new Configuration().configure();
        SessionFactory sf  = cf.buildSessionFactory();
        Session session = sf.openSession();
        session.save(employee);
        
    }
}
