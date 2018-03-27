package com.github.zesetup.mab;

import java.util.HashSet;
import java.util.Set;
import javax.ws.rs.ApplicationPath;
import javax.ws.rs.core.Application;
import com.github.zesetup.mab.service.EmployeeService;
import com.google.inject.Guice;
import com.google.inject.Injector;

@ApplicationPath("/rest")
public class App extends Application {
  public App() {
    System.out.println("App Constructor");
    Injector injector = Guice.createInjector(new SimpleModule() );
    MongoProvider mongoProvider = injector.getInstance( MongoProvider.class );

  }
  @Override
  public Set<Class<?>> getClasses() {
      HashSet<Class<?>> classes = new HashSet<Class<?>>();
      classes.add(EmployeeService.class);
      return classes;
  }
  
}