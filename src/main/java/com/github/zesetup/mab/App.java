package com.github.zesetup.mab;

import java.util.HashSet;
import java.util.Set;
import java.util.UUID;
import javax.ws.rs.ApplicationPath;
import javax.ws.rs.core.Application;
import com.github.zesetup.mab.service.EmployeeService;
import com.google.inject.Guice;
import com.google.inject.Inject;
import com.google.inject.Injector;
import com.mongodb.BasicDBObject;
import com.mongodb.DB;
import com.mongodb.DBCollection;
import com.mongodb.MongoClient;

@ApplicationPath("/")
public class App extends Application {

  public App() {
    System.out.println("App Constructor");
    MongoClient mongoClient = new MongoClient("localhost", 27017);
    DB database = mongoClient.getDB("myMongoDb");
    database.createCollection("employees", null);
    DBCollection collection = database.getCollection("employee");
    BasicDBObject searchQuery = new BasicDBObject();
    collection.remove(searchQuery);
    BasicDBObject document = new BasicDBObject();
    
    document.put("eid", "94bf7964-44c4-48d3-97c1-f2ef3a685de1");
    document.put("login", "john ");
    document.put("name", "John");
    document.put("surname", "Surnamed ");
    document.put("position", "Engeneer");
    collection.insert(document);

    document = new BasicDBObject();
    document.put("eid", UUID.randomUUID().toString());
    document.put("login", "sarah");
    document.put("name", "Sarch");
    document.put("surname", "Connor");
    document.put("position", "Administartor");
    collection.insert(document);

    mongoClient.close();

  }
  @Override
  public Set<Class<?>> getClasses() {
      HashSet<Class<?>> classes = new HashSet<Class<?>>();
      classes.add(EmployeeService.class);
      return classes;
  }
  
}