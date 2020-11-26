package com.difficult.demorest;

import java.util.List;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

@Path("employees")
public class EmployeeResource 
{
	
	EmployeeRepository repo =new EmployeeRepository();
	
	
	@GET 
	@Produces(MediaType.APPLICATION_XML)
	
	public List<Employee> getemployee()
	{
     	System.out.print("get employee called.........");
	
	
		return repo.getEmployees(); 
	
	}
	
	
	public Employee CreateEmployee(Employee e)
    {
		 
	}
	
	
}
