package com.github.zesetup.mab.service;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import com.github.zesetup.mab.MongoProvider;
import com.github.zesetup.mab.domain.Employee;
import com.google.inject.Inject;
import com.mongodb.DB;

@Path("employee")
public class EmployeeService {

  private MongoProvider mongoProvider;

  public EmployeeService() {
  }

  @Inject
  public EmployeeService(MongoProvider mongoProvider) {
    this.mongoProvider = mongoProvider;
  }

  @GET
  @Produces(MediaType.APPLICATION_JSON)
  public Employee get(@PathParam("id") String id) {
    Employee e = new Employee("login1", "name1", "surname1", "position1");
    DB database = mongoProvider.getDatabase();
    System.out.println(database.getName());
    return e;
  }
}
