package com.github.zesetup.mab.service;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import com.github.zesetup.mab.MongoProvider;
import com.github.zesetup.mab.domain.Employee;
import com.google.inject.Inject;
import com.mongodb.BasicDBObject;
import com.mongodb.DB;
import com.mongodb.DBCollection;
import com.mongodb.DBObject;


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
  public List<Employee> getAll() {
    List<Employee> employees = new ArrayList<Employee>();
    DB database = mongoProvider.getDatabase();
    DBCollection employeesCollection = database.getCollection("employee");
    BasicDBObject searchQuery = new BasicDBObject();
     Iterator<DBObject> cursor = employeesCollection.find(searchQuery).iterator();;
    while (cursor.hasNext()) {
      employees.add(Employee.fromDbObject(cursor.next()));
    }
    return employees;
  }

  @GET
  @Path("{id}")
  @Produces(MediaType.APPLICATION_JSON)
  public List<Employee> get(@PathParam("id") String id) {
    List<Employee> employees = new ArrayList<Employee>();
    DB database = mongoProvider.getDatabase();
    DBCollection employeesCollection = database.getCollection("employee");
    System.out.println("employeesCollection: " + employeesCollection.count());
    BasicDBObject searchQuery = new BasicDBObject();
    searchQuery.put("eid", id);
    Iterator<DBObject> cursor = employeesCollection.find(searchQuery).iterator();
    if(cursor.hasNext())
      employees.add(Employee.fromDbObject(cursor.next()));
    return employees;
  }
}
