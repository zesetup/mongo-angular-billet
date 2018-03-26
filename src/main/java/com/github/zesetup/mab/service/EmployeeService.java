package com.github.zesetup.mab.service;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import com.github.zesetup.mab.domain.Employee;

@Path("/employee")
public class EmployeeService {
  @GET
  @Produces(MediaType.APPLICATION_JSON)
  
  public Employee get(@PathParam("id") String id) {
    Employee e = new Employee("login12345", "name1", "surname1", "position1");
    return e;
  }
}
